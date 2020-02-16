package org.reaction.generalTest.utils;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TestcasesModel.A;
import TestcasesModel.P_s;
import TestcasesModel.T;
import TestcasesModel.TestcasesModelFactory;
import TestcasesModel.U_s;
import TestcasesModel.X;
import reactionContainer.Agent;
import reactionContainer.Container;
import reactionContainer.ReactionContainerFactory;

public class ModelGenerator {
	
	public static Resource createAndSaveModel(String outputPath, int option) {

		URI uri = URI.createFileURI(outputPath);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();

		Resource resource = rs.createResource(uri);
		Container container = createContainer(option);
		resource.getContents().add(container);

		try {
			GeneratorUtils.saveModelContainer(resource, outputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Model could not be stored at the given location.");
		}

		return resource;
	}

	public static Resource loadModel(String path) {
		try {
			return GeneratorUtils.loadResource(path);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Model could not be loaded from the given location.");
			return null;
		}
	}

	private static Container createContainer(int instanceOption) {
		TestcasesModelFactory entityfactory = TestcasesModelFactory.eINSTANCE;
		ReactionContainerFactory containerFactory = ReactionContainerFactory.eINSTANCE;
		Container container = containerFactory.createContainer();
		U_s us = entityfactory.createU_s();
		P_s ps = entityfactory.createP_s();
		container.getStates().add(us);
		container.getStates().add(ps);

		List<Agent> agents = new LinkedList<>();
		// Create free agents
		boolean tUnphosDone = false;
		for (int i = 0; i < 100; i++) {
			A a = entityfactory.createA();
			X x = entityfactory.createX();
			if (!tUnphosDone) {
				a.setA_c_u(us);
				x.setX_z_u(us);
			} else {
				a.setA_c_p(ps);
				x.setX_z_p(ps);
			}
			if (i == 49) {
				tUnphosDone = true;
			}
			agents.add(a);
			agents.add(x);
		}

		// create bound configurations
		// TODO: Maybe some state configurations
		for (int i = 0; i < 10; i++) {
			A a1 = entityfactory.createA();
			X x1 = entityfactory.createX();
			a1.setA_b(x1);
			x1.setX_y(a1);

			A a2 = entityfactory.createA();
			X x2 = entityfactory.createX();
			a2.setA_b(x2);
			x2.setX_z(a2);

			A a3 = entityfactory.createA();
			X x3 = entityfactory.createX();
			a3.setA_c(x3);
			x3.setX_y(a3);

			A a4 = entityfactory.createA();
			X x4 = entityfactory.createX();
			a4.setA_c(x4);
			x4.setX_z(a4);

			A at1 = entityfactory.createA();
			T t1 = entityfactory.createT();
			at1.setA_b(t1);
			t1.setT_i(at1);

			A at2 = entityfactory.createA();
			T t2 = entityfactory.createT();
			at2.setA_b(t2);
			t2.setT_i(at2);
		}

		container.getAgents().addAll(agents);
		return container;
	}

}
