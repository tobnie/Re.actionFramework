package GeneralTestSimSG.hipe.engine.actor.edge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import hipe.engine.util.HiPESet;
import hipe.engine.actor.Port;
import hipe.engine.match.EdgeMatch;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.actor.edge.PortEdge;
import hipe.engine.actor.edge.PortEdgeLeft;
import hipe.engine.actor.edge.PortEdgeRight;
import hipe.engine.message.HiPEMessage;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.node.NodeAddedLeft;
import hipe.engine.message.node.NodeAddedRight;
import hipe.engine.message.node.NodeDeletedLeft;
import hipe.engine.message.node.NodeDeletedRight;		
import hipe.engine.message.InitActor;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.InputMessage;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class A_A_b_0_reference extends AbstractActor {

	private List<Port<EdgeMatch>> ports;

	private Map<TestcasesModel.A, Set<EdgeMatch>> sourceElements = new HashMap<TestcasesModel.A, Set<EdgeMatch>>();
	private Map<reactionContainer.Agent, Set<EdgeMatch>> targetElements = new HashMap<reactionContainer.Agent, Set<EdgeMatch>>();
	private HiPESet<EdgeMatch> matches = new HiPESet<>();
	
	private Map<reactionContainer.Agent, Set<TestcasesModel.A>> pending = new HashMap<>();

	private int finishedNodes = 0;
	
	public A_A_b_0_reference() {
	}
	
	public void initActor(InitActor m) {
		Map<String, ActorRef> name2actor = m.name2actor;
		ports = new LinkedList<>();
		ports.add(new PortEdge(getSelf(), name2actor.get("a_bBound_production"), this::check_constraint_1));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("bidirectionalRuleBwd_564_nacjunction"), this::check_constraint_73));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("degradation2_540_nacjunction"), this::check_constraint_33));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("freeAgentsBind2_554_nacjunction"), this::check_constraint_64));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("freeAgentsBind_550_nacjunction"), this::check_constraint_60));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("partialDegradation2_544_nacjunction"), this::check_constraint_37));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("rhsGeneric1_496_junction"), this::check_constraint_78));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("rhsGeneric2_567_nacjunction"), this::check_constraint_79));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBind1State1_512_nacjunction"), this::check_constraint_15));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBind1State2_516_nacjunction"), this::check_constraint_19));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBind1_1_504_nacjunction"), this::check_constraint_7));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBind1_2_508_nacjunction"), this::check_constraint_11));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("simpleBind2_520_nacjunction"), this::check_constraint_23));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("underspecified1_269_junction"), this::check_constraint_41));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("underspecified2_281_junction"), this::check_constraint_49));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("underspecified3_291_junction"), this::check_constraint_52));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("underspecified4_301_junction"), this::check_constraint_55));
		ports.add(new PortEdgeLeft(getSelf(), name2actor.get("underspecified5_311_junction"), this::check_constraint_58));
		ports.add(new PortEdgeRight(getSelf(), name2actor.get("underspecifiedAgent_391_junction"), this::check_constraint_68));
	}	

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		super.postStop();
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(HiPEMessage.class, this::distributeMessage)
				.build();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void distributeMessage(HiPEMessage msg) {
		switch(msg.getType()) {
		case InitActor :
			initActor((InitActor)msg);
			return;
		case AttributeChanged :
			changeAttribute((AttributeChanged)msg);
			return;
		case NodeAddedLeft :
			leftAdded((NodeAddedLeft)msg);
			return;
		case NodeAddedRight :
			rightAdded((NodeAddedRight)msg);
			return;
		case NodeDeletedLeft :
			leftRemoved((NodeDeletedLeft)msg);
			return;
		case NodeDeletedRight :
			rightRemoved((NodeDeletedRight)msg);
			return;
		case ReferenceAdded :
			addReference((ReferenceAdded)msg);
			return;
		case ReferenceDeleted :
			removeReference((ReferenceDeleted)msg);
			return;
		default:
			break;
		}
	}

	private void addMatch(InputMessage message, TestcasesModel.A source, reactionContainer.Agent target) {
		EdgeMatch match = new EdgeMatch(source, target);
		if(!matches.add(match))
 			return;
 				
		for(Port<EdgeMatch> port : ports) {
			port.sendAdd(message, match);
		}
		
		Set<EdgeMatch> sourceMatches = sourceElements.get(source);
		if(sourceMatches == null) {
			sourceMatches = new HashSet<EdgeMatch>();
			sourceElements.put(source, sourceMatches);
		}
		
		Set<EdgeMatch> targetMatches = targetElements.get(target);
		if(targetMatches == null) {
			targetMatches = new HashSet<EdgeMatch>();
			targetElements.put(target, targetMatches);
		}
		
		sourceMatches.add(match);
		targetMatches.add(match);
		
	}
	
	private void addPendingMatch(Object source, Object target) {
		Set<TestcasesModel.A> sourcePending = pending.get(target);
		if(sourcePending == null) {
			sourcePending = new HashSet<TestcasesModel.A>();
			pending.put((reactionContainer.Agent) target, sourcePending);
		}
		sourcePending.add((TestcasesModel.A) source);
	}
	
	private void leftAdded(NodeAddedLeft<TestcasesModel.A> message) {
		if(sourceElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
			
		sourceElements.put(message.input, null);
		reactionContainer.Agent target = (reactionContainer.Agent) message.input.getA_b();
		if(targetElements.containsKey(target))
			addMatch(message.initialMessage, message.input, target);
		else
			addPendingMatch(message.input, target);
		message.initialMessage.decrement();
	}

	private void rightAdded(NodeAddedRight<reactionContainer.Agent> message) {
		if(targetElements.containsKey(message.input)) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.put(message.input, null);
		if(pending.containsKey(message.input)) {
			Set<TestcasesModel.A> pendingsSources = pending.get(message.input);
			for(TestcasesModel.A source : pendingsSources) {
				addMatch(message.initialMessage, source, message.input);
			}
			pending.remove(message.input);
		}
		message.initialMessage.decrement();
	}

	private void leftRemoved(NodeDeletedLeft<TestcasesModel.A> message) {
		Set<EdgeMatch> sourceMatches = sourceElements.get(message.input);
		if(sourceMatches == null) {
			message.initialMessage.decrement();
			return;
		}
		
		sourceElements.remove(message.input);
		matches.removeAll(sourceMatches);
		
		for(EdgeMatch match : sourceMatches) {
			Set<EdgeMatch> targetMatches = targetElements.get(match.target());
			if(!targetMatches.remove(match))
				continue;
			
			for(Port<EdgeMatch> port : ports) {
				port.sendRemove(message.initialMessage, match);
			}
			
			// remove waiting source from pending matches
			Set<TestcasesModel.A> sourcePending = pending.get(match.target());
			if(sourcePending == null) continue;
			sourcePending.remove(match.source());
		}
		message.initialMessage.decrement();
	}

	private void rightRemoved(NodeDeletedRight<reactionContainer.Agent> message) {
		Set<EdgeMatch> targetMatches = targetElements.get(message.input);
		if(targetMatches == null) {
			message.initialMessage.decrement();
			return;
		}
		
		targetElements.remove(message.input);
		matches.removeAll(targetMatches);
		
		for(EdgeMatch match : targetMatches) {
			Set<EdgeMatch> sourceMatches = sourceElements.get(match.source());
			if(!sourceMatches.remove(match))
				continue;
			
			for(Port<EdgeMatch> port : ports) {
				port.sendRemove(message.initialMessage, match);
			}	
							
			// restore pending matches, since target is gone
			addPendingMatch(match.source(), match.target());
		}
		message.initialMessage.decrement();
	}

	private void addReference(ReferenceAdded<TestcasesModel.A, reactionContainer.Agent> message) {
		if (sourceElements.containsKey(message.source)) {
			if (targetElements.containsKey(message.target)) {
				addMatch(message.initialMessage, message.source, message.target);
			}
			else {
				addPendingMatch(message.source, message.target);
			}
		}
		message.initialMessage.decrement();
	}
	
	private void removeReference(ReferenceDeleted<TestcasesModel.A, reactionContainer.Agent> message) {
		Set<TestcasesModel.A> pendingSources = pending.get(message.target);
		if(pendingSources != null) {
			pendingSources.remove(message.source);
		}
		
		EdgeMatch newMatch = new EdgeMatch(message.source, message.target);
		EdgeMatch match = matches.removeElement(newMatch);
		
		if(match == null) {
			message.initialMessage.decrement();
			return;
		}
		
		for(Port<EdgeMatch> port : ports) {
			port.sendRemove(message.initialMessage, match);
		}		
		
		Set<EdgeMatch> sourceMatches = sourceElements.get(message.source);
		Set<EdgeMatch> targetMatches = targetElements.get(message.target);
		
		if(sourceMatches != null) sourceMatches.remove(match);
		if(targetMatches != null) targetMatches.remove(match);

		message.initialMessage.decrement();
	}
	
	private void changeAttribute(AttributeChanged<?> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
						
		if(message.node instanceof TestcasesModel.A) {
			leftChanged(message);
		}
		else {
			rightChanged(message);
		}
		message.initialMessage.decrement();
	}
	
	private void leftChanged(AttributeChanged<?> message) {
		if(!sourceElements.containsKey(message.node)) {
			return;
		}
		
		Set<EdgeMatch> sourceMatches = sourceElements.get(message.node);
		if(sourceMatches == null) {
			return;
		}
		
		for(EdgeMatch match : sourceMatches) {
			for(Port<EdgeMatch> port : ports) {
				port.sendAttributeChanged(message, match);
			}
		}
	}
	
	private void rightChanged(AttributeChanged<?> message) {
		if(!targetElements.containsKey(message.node)) {
			return;
		}
		
		Set<EdgeMatch> targetMatches = targetElements.get(message.node);
		if(targetMatches == null) {
			return;
		}
		
		for(EdgeMatch match : targetMatches) {
			for(Port<EdgeMatch> port : ports) {
				port.sendAttributeChanged(message, match);
			}
		}
	}
	
	private boolean returnTrue(Object o) {
		return true;
	}
	
	public boolean check_constraint_1(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_73(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_33(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_64(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_60(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_37(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_78(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_79(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_15(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_19(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_7(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_11(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_23(EdgeMatch edge) {
		TestcasesModel.A src = (TestcasesModel.A) edge.source();
		reactionContainer.Agent trg = (reactionContainer.Agent) edge.target();
		boolean predicate = !src.equals(trg);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_41(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_49(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_52(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_55(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_58(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	
	public boolean check_constraint_68(EdgeMatch edge) {
		TestcasesModel.A a = (TestcasesModel.A) edge.source();
		reactionContainer.Agent a_b_local = (reactionContainer.Agent) edge.target();
		boolean predicate = !a.equals(a_b_local);
		edge.setConstraintSatisfied(predicate);
		return predicate;
	}
	

}

