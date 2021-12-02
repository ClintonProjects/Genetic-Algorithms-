package DesignPatterns;

import GeneticAlgorithm.Crossover;
import GeneticAlgorithm.Mutation;
import GeneticAlgorithm.Selection;

public class SampleFactory extends AbstractFactoryGA {

	@Override
	GAFunucations getGAFunucations(String getGAFunucations) {
		if (getGAFunucations.equalsIgnoreCase("Selection"))
			return new Selection();
		else if (getGAFunucations.equalsIgnoreCase("Crossover")) 
			return new Crossover();
		if (getGAFunucations.equalsIgnoreCase("Mutation")) 
			return new Mutation();
		return null;
	}

}
