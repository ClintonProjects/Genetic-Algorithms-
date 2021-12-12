package AbstractFactory;

import GenerticAlgorithmA.GeneticAlgorithmFactoryA;
import GenerticAlgorithmOnePoint.*;
import GenerticAlgorithmOnePoint.GeneticAlgorithmFactoryOnePoint;


public class FactoryProvider {
 
	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("TWo Point")) {
			return new GeneticAlgorithmFactoryA();
		} else if (choice.equalsIgnoreCase("One Point")) {
			return new GeneticAlgorithmFactoryOnePoint();
		}
		return null;
	}

}
