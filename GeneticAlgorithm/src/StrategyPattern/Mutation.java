package StrategyPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Mutation {
	
	Couple mutate(Individual  Couple );
}
