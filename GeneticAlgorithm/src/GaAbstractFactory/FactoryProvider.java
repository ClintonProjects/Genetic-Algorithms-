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
	public static AbstractFactory getFactory(FactoryControllor choice) {

		if (choice == FactoryControllor.TwoPoint) {
			return new GeneticAlgorithmFactoryTwoPoint();
		} else if (choice == FactoryControllor.OnePoint) {
			return new GeneticAlgorithmFactoryOnePoint();
		}
		return null;
	}

}
