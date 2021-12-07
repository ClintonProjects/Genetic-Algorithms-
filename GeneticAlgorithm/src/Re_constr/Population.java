package Re_constr;

public class Population {
	ConfigurationFile ConfigurationFile_ins =ConfigurationFile.getInstance();
	int speciesNum=ConfigurationFile_ins.SPECIES_NUM;//Number of individuals
	Individual [] population=new Individual [speciesNum];
	
	float bestFitness;
	Individual bestIndividual;
	float totalFitness;
	
	
	public Population() {		
		createPopulation();
	}
	
	
	void createPopulation() {
		for(int i=0;i<speciesNum;i++) {
			
			population[i]=new Individual();
		}
	}
	
	
	void add(Individual newIndividual,int index )
	{
		population[index]=newIndividual;
	}

}
