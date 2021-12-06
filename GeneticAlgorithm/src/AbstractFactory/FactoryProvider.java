package AbstractFactory;

import AnimalFamily.GeneticAlgorithmFactoryA;


public class FactoryProvider {

	public static AbstractFactory<?> getFactory(String choice) {

		if (choice.equalsIgnoreCase("A")) {
			return new GeneticAlgorithmFactoryA();
		} else if (choice.equalsIgnoreCase("B")) {
			return new GeneticAlgorithmFactoryA();
		}
		return null;
	}

}
