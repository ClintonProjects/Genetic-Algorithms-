package StrangeyDesignPattern;

import GaAbstractFactory.FactoryProvider;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

//Class Name: Crossover
//Description:
//This is the interface associated with the StatngeyDesignPattern
//Authors(s): Clinton, Wang

public interface Crossover {
	Couple doCross(Couple couple);
}
