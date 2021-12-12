package StrategyPattern;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.*;

public interface Replacer {
	//
  void relace(Population p, Couple couple);
}
