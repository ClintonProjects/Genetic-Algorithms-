package GeneticAlgorithm;


import java.util.ArrayList;

import GeneticAlgorithm.Individual;
import Singleton.Singleton;

public class Population {
	
	int speciesNum = Singleton.getInstance().SPECIES_NUM;
	ArrayList<Individual> population = new ArrayList<Individual>();

	public Population() {
		createPopulation();
	}

	void createPopulation() {
		for (int i = 0; i < speciesNum; i++) {
			population.add(new Individual());
		}
	}

	void add(Individual newIndividual, int index) {
		population.set(index, new Individual());
	}

	public ArrayList<Individual> getPopulation() {
		return population;
	}
}