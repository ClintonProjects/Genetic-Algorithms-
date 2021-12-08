package GenerticAlgorithmB;

import AbstractFactory.AbstractFactory;

public class GeneticAlgorithmFactoryB implements AbstractFactory<GenerticAlgorithmB> {

	@Override
	public GenerticAlgorithmB create(String gaMethod) {
		if ( gaMethod.equalsIgnoreCase("Selection"))
			return new TourmentSelection();
		else if ( gaMethod.equalsIgnoreCase("Crossover")) 
			return new OnePointMutation();
		if ( gaMethod.equalsIgnoreCase("Mutation")) 
			return new OnePointCrossover();
		return null;
	}
}
