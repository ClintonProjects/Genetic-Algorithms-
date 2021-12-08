package Interfaces;

import GeneticAlgorithm.Population;

public interface Selection<T> {
	T selection(Population population );
}
