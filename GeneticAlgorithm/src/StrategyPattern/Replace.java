package StrategyPattern;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.*;

public interface Replace {
  void relace(Population p, Couple couple);
}
