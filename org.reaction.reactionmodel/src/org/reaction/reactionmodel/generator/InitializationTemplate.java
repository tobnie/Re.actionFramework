package org.reaction.reactionmodel.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.reaction.reactionmodel.util.AgentClassFactory;
import org.reaction.reactionmodel.util.StateClassFactory;

import IntermediateModel.BindingState;
import IntermediateModel.IntermAgentInstance;
import IntermediateModel.IntermPattern;
import IntermediateModel.IntermSite;
import IntermediateModel.IntermSiteInstance;
import IntermediateModel.IntermSiteState;
import ReactionModel.Agent;
import ReactionModel.State;

public class InitializationTemplate {

	private IntermPattern pattern;
	private AgentClassFactory agentFactory;
	private StateClassFactory stateFactory;
	private Map<String, State> stateInstances;
	private Map<IntermAgentInstance, AgentTemplate> agentTemplates;

	public InitializationTemplate(IntermPattern pattern, AgentClassFactory agentFactory, StateClassFactory stateFactory,
			Map<String, State> stateInstances) {

		this.pattern = pattern;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		this.stateInstances = stateInstances;

		createAgentTemplates();
		findBindings();
		findStates();
	}

	private void createAgentTemplates() {
		agentTemplates = new HashMap<>();

		// find agents in pattern
		for (IntermAgentInstance instance : pattern.getAgentInstances()) {
			agentTemplates.put(instance,
					new AgentTemplate(instance.getInstanceOf(), agentFactory, stateFactory, stateInstances));
		}
	}

	private void findBindings() {
		for (IntermAgentInstance instance : pattern.getAgentInstances()) {
			for (IntermSiteInstance si : instance.getSiteInstances()) {
				if (si.getBindingState() == BindingState.BOUND) {
					IntermSiteInstance siPartner = (IntermSiteInstance) si.getBoundTo();
					agentTemplates.get(instance).defineSitePartner(si.getInstanceOf(), siPartner.getInstanceOf());
				}
			}
		}
	}

	private void findStates() {
		for (IntermAgentInstance instance : pattern.getAgentInstances()) {
			for (IntermSiteInstance siteInstance : instance.getSiteInstances()) {
				IntermSite site = siteInstance.getInstanceOf();
				if (site.getSiteStates().size() > 0) {
					if (siteInstance.getState() == null) {
						agentTemplates.get(instance).defineSiteState(site, site.getSiteStates().get(0));
					} else {
						IntermSiteState siteState = siteInstance.getState();
						agentTemplates.get(instance).defineSiteState(site, siteState);
					}
				}
			}
		}
	}

	public Collection<Agent> createInstances(int amount) {
		Collection<Agent> instances = new LinkedList<Agent>();
		

		//Create agent and set states
		for (int i = 0; i < amount; i++) {
			HashMap<IntermAgentInstance, Agent> instanceToAgent = new HashMap<>();
			for(IntermAgentInstance ai : agentTemplates.keySet()) {
				AgentTemplate template = agentTemplates.get(ai);
				Agent thisAgent = agentFactory.getEObjectFactory().createObject(template.getAgentClassName());
				template.setStates(thisAgent);
				
				instanceToAgent.put(ai, thisAgent);
			}
			
			//Set sites
			for(IntermAgentInstance ai : instanceToAgent.keySet()) {
				Agent agent = instanceToAgent.get(ai);
				for(IntermSiteInstance si : ai.getSiteInstances()) {
					if(si.getBindingState() == BindingState.BOUND) {
					
						IntermSiteInstance siBoundTo = (IntermSiteInstance) si.getBoundTo();
						IntermAgentInstance aiBoundTo = siBoundTo.getParent();
						
						String refName = AgentTemplate.createSiteRefName(si, siBoundTo);
						EReference ref = agentFactory.getEClassRegistry().getRegisteredReference(refName);
						if(ref != null) {
							//set reference
							Agent otherAgent = instanceToAgent.get(aiBoundTo);
							agent.eSet(ref, otherAgent);
						}
					}
				}
			}
			instances.addAll(instanceToAgent.values());
		}

		return instances;
	}

}
