package StrategyPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Mutation {
	
	Individual mutate(Individual  individual );
}
