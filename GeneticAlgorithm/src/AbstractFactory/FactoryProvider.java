package AbstractFactory;

import GenerticAlgorithmOnePoint.*;
import GenerticAlgorithmOnePoint.GeneticAlgorithmFactoryOnePoint;
import GenerticAlgorithmTwoPoint.GeneticAlgorithmFactoryTwoPoint;


public class FactoryProvider {
 
	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("TWo Point")) {
			return new GeneticAlgorithmFactoryTwoPoint();
		} else if (choice.equalsIgnoreCase("One Point")) {
			return new GeneticAlgorithmFactoryOnePoint();
		}
		return null;
	}

}
