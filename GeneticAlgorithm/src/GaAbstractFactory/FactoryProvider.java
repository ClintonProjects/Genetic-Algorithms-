package GaAbstractFactory;


public class FactoryProvider {
 
	//Factory provider for the abstract factory method.
	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("Two Point")) {
			return new GeneticAlgorithmFactoryTwoPoint();
		} else if (choice.equalsIgnoreCase("One Point")) {
			return new GeneticAlgorithmFactoryOnePoint();
		}
		return null;
	}

}