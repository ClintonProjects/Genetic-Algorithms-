package StrategyPattern;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;

public interface Replace {
  void relace(Population p, Individual  individual);
}
