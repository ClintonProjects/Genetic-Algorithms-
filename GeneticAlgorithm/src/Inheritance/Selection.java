package Inheritance;

import java.util.ArrayList;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;

public interface Selection {
	Couple select(Population population);
}
