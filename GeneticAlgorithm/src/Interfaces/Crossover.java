package Interfaces;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Crossover {

	Individual crossover(Couple couple);

}
