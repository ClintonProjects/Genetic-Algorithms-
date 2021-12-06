package GenerticAlgorithmB;

import AbstractFactory.AbstractFactory;

public class GeneticAlgorithmFactoryB implements AbstractFactory<GenerticAlgorithmB> {

	@Override
	public GenerticAlgorithmB create(String gaMethod) {
		if ( gaMethod.equalsIgnoreCase("Selection"))
			return new SelectionB();
		else if ( gaMethod.equalsIgnoreCase("Crossover")) 
			return new MutationB();
		if ( gaMethod.equalsIgnoreCase("Mutation")) 
			return new CrossoverB();
		return null;
	}
}
