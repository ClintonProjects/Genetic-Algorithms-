package StrangeyDesignPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Population;

public interface Selection { 
	Couple select(Population population);
}
