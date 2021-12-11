package StrategyPattern;

import AbstractFactory.FactoryProvider;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

public interface Crossover {
	
	Couple crossover(Couple couple);

}
