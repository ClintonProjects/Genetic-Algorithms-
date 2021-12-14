package StrategyPattern;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.*;

public interface Replacer {
	//
  void relace(Couple couple, Population p);
}
