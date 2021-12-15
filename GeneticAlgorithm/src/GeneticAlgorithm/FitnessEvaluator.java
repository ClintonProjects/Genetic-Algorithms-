package GeneticAlgorithm;

import java.util.ListIterator;

import Singleton.ConfigurationFile;

public class FitnessEvaluator {

	
	public FitnessEvaluator() {
		
	}
	
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
	
	
	public void updateFitness(Couple couple) {
		updateFitness(couple.Individual1);
		updateFitness(couple.Individual2);
	}
	
	public void updateFitness(Population population) {
		ListIterator<Individual> P_iterator =population.getPopulation().listIterator();
		while(P_iterator.hasNext()) {
			updateFitness(P_iterator.next());
		}

	}
	
	
	
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
