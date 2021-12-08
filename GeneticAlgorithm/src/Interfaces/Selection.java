package Interfaces;

import java.util.ArrayList;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;

public interface Selection {
	ArrayList<Individual> selection(Population population);
}
