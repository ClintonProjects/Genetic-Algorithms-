package StrangeyDesignPattern;

import GaAbstractFactory.FactoryProvider;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Crossover {
	Couple doCross(Couple couple);
}
