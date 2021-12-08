package Interfaces;

import java.util.ArrayList;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;

public interface Selection {
	ArrayList<Couple> selection(Population population);
}
