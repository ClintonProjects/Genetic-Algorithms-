package StrategyPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Mutation {
	
	Couple mutate(Couple couple );

}
