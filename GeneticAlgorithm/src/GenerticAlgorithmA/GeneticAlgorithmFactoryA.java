package GenerticAlgorithmA;

import AbstractFactory.AbstractFactory;

public class GeneticAlgorithmFactoryA implements AbstractFactory<GenerticAlgorithmA> {

	@Override
	public GenerticAlgorithmA create(String gaMethod) {
		if ( gaMethod.equalsIgnoreCase("Selection"))
			return new SelectionA();
		else if ( gaMethod.equalsIgnoreCase("Crossover")) 
			return new MutationA();
		if ( gaMethod.equalsIgnoreCase("Mutation")) 
			return new CrossoverA();
		return null;
	}
}
