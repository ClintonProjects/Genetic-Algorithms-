package GeneticAlgorithm;

import java.util.ListIterator;

import Singleton.ConfigurationFile;

/*Class Name: FitnessEvaluator
*Description:
*This is FitnessEvaluator, which have methods to update the fitness of individual,couple,and population based on polymorphism
*Besides, it also provides the methods of get individual which has a longest or shortest distance ie.fitness from a population 
*Authors(s): Clinton, Wang
*/



public class FitnessEvaluator {

	
	public FitnessEvaluator() {
		
	}

	/**
	* Update the fitness of an Individual 
	* it will add a distance between two cities to get a sum, the sum will be the fitness 
	* @param 
	* @param Individual individual
	* @return void
	* @see   
	*/	
	public void updateFitness(Individual individual) {
		float totalDis = 0.0f;
		for (int i = 0; i < ConfigurationFile.getInstance().CITY_NUM; i++) {
			int curCity = Integer.parseInt(individual.genes.get(i));// the maptable of mind from 1, but in reality from 0
			int nextCity = Integer.parseInt(individual.genes.get((i + 1) % ConfigurationFile.getInstance().CITY_NUM));
			// use i+1 %max ==0 to go back to initial
			totalDis += ConfigurationFile.getInstance().disMap[curCity][nextCity];
		}
		individual.setFitness(totalDis);
	}
	
	//Update the fitness for a Couple 
	
	
	/**
	* Update the fitness for a Couple 
	* @param Couple couple
	* @return void
	* @see   
	*/	
	public void updateFitness(Couple couple) {
		updateFitness(couple.Individual1);
		updateFitness(couple.Individual2);
	}

	/**
	* Update the fitness for a Population
	* @param Population population
	* @return void
	* @see   
	*/	
	public void updateFitness(Population population) {
		ListIterator<Individual> P_iterator =population.getPopulation().listIterator();
		while(P_iterator.hasNext()) {
			updateFitness(P_iterator.next());
		}

	}
	
	

	/**
	* get individual which has biggest fitness from a population
	* @param Population p
	* @return void
	* @see   
	*/	
	public Individual getWeakest(Population p)
	  {
		float distance=0;
		Individual bestSpecies=null;
		ListIterator<Individual> P_iterator =p.getPopulation().listIterator();
		//System.out.println(" new fitness is"+ P_iterator.next().getFitness());
		while(P_iterator.hasNext())
		{
			if(P_iterator.next().getFitness()>distance)
			{
				bestSpecies=P_iterator.previous();
				//System.out.println(" new fitness is"+ P_iterator.next().getFitness());
				//distance=P_iterator.previous().getFitness();	
			distance=P_iterator.next().getFitness();		
			}
		}
		P_iterator =p.getPopulation().listIterator();
		//PrintFitness(p);
		return bestSpecies;
	  }
	// get individual which has shortest fitness from a population
	public Individual getBest(Population p)
	  {
		float distance=Float.MAX_VALUE;
		Individual bestSpecies=null;
		ListIterator<Individual> P_iterator =p.getPopulation().listIterator();
		//System.out.println(" new fitness is"+ P_iterator.next().getFitness());
		while(P_iterator.hasNext())
		{
			if(P_iterator.next().getFitness()<distance)
			{
				bestSpecies=P_iterator.previous();
			//	System.out.println(" new fitness is"+ P_iterator.next().getFitness());
				distance=P_iterator.next().getFitness();		
			}
		}
		return bestSpecies;
	  }
	
	
	
	
	
}
