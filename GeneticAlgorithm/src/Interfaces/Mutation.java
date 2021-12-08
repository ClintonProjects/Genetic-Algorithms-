package Interfaces;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Mutation<T> {
	
	Individual Mutation(Couple couple);
}
