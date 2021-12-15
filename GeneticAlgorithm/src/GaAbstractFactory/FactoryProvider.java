package GaAbstractFactory;

import GeneticAlgorithm.Mode;

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
	public static AbstractFactory getFactory(Mode choice) {

		if (choice == Mode.TwoPoint) {
			return new GeneticAlgorithmFactoryTwoPoint();
		} else if (choice == Mode.OnePoint) {
			return new GeneticAlgorithmFactoryOnePoint();
		}
		return null;
	}

}
