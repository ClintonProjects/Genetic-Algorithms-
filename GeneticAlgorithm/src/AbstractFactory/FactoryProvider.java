package AbstractFactory;

import GenerticAlgorithmA.GeneticAlgorithmFactoryA;
import GenerticAlgorithmB.GeneticAlgorithmFactoryB;


public class FactoryProvider {
 
	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("A")) {
			return new GeneticAlgorithmFactoryA();
		} else if (choice.equalsIgnoreCase("B")) {
			return new GeneticAlgorithmFactoryB();
		}
		return null;
	}

}
