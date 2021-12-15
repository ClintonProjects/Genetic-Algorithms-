package GeneticAlgorithm;


import java.util.ArrayList;
import GeneticAlgorithm.Individual;
import Singleton.ConfigurationFile;

//Class Name: Population
//Description: 
//
//Authors(s): Clinton, Wang

public class Population {
	
	int speciesNum = ConfigurationFile.getInstance().SPECIES_NUM;
	ArrayList<Individual> population = new ArrayList<Individual>();

	/**
	* Creates the population and calls the create method.
	* 
	* @param 
	* @param  
	* @return 
	* @see   
	*/
	public Population() {
		createPopulation();
	}

	
	/**
	* Creates the population.
	* 
	* @param 
	* @return 
	* @see   
	*/
	void createPopulation() {
		for (int i = 0; i < speciesNum; i++) {
			population.add(new Individual());
		}
	}
	
	
	/**
	* Adds an Indivual to the population list
	* 
	* @param  Individual newIndividual, int index 
	* @return 
	* @see   
	*/

	void add(Individual newIndividual, int index) {
		population.set(index, new Individual());
	}

	public ArrayList<Individual> getPopulation() {
		return population;
	}
}