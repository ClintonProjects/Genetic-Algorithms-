package Re_constr;

import java.util.ArrayList;

import Singleton.ConfigurationFile;
import Singleton.Singleton;

public class Population {
	ConfigurationFile ConfigurationFile_ins = Singleton.getInstance();
	int speciesNum=ConfigurationFile_ins.SPECIES_NUM;//Number of individuals
	//Individual [] population=new Individual [speciesNum];
	ArrayList<Individual> population= new ArrayList<Individual>();
	
	float bestFitness;
	Individual bestIndividual;
	float totalFitness;
	
	
	public Population() {		
		createPopulation();
	}
	
	
	void createPopulation() {
		for(int i=0;i<speciesNum;i++) {
			population.set(i, new Individual());
		}
	}
	
	
	void add(Individual newIndividual,int index )
	{
		population.set(index, new Individual());
	}


	public ArrayList<?> getPopulation() {
		return population;
	}
}
