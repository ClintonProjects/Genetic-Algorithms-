package GaAbstractFactory;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang

public class FactoryProvider {
 
	/**
	* Factory provider for the abstract factory method.
	* @param 
	* @return String choice
	* @see   
	*/	
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("Two Point")) {
			return new GeneticAlgorithmFactoryTwoPoint();
		} else if (choice.equalsIgnoreCase("One Point")) {
			return new GeneticAlgorithmFactoryOnePoint();
		}
		return null;
	}

}
