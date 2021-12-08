package Interfaces;

import GeneticAlgorithm.Couple;

public interface Crossover<T> {

	Couple crossover(Couple couple);

}
