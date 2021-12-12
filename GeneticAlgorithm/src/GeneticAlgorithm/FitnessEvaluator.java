package GeneticAlgorithm;

import java.util.ListIterator;

public class FitnessEvaluator {

	
	public void updateFitness(Individual individual) {
		float totalDis = 0.0f;
		for (int i = 0; i < individual.ConfigurationFile_ins.CITY_NUM; i++) {
			int curCity = Integer.parseInt(individual.genes.get(i));// the maptable of mind from 1, but in reality from 0
			int nextCity = Integer.parseInt(individual.genes.get((i + 1) % individual.ConfigurationFile_ins.CITY_NUM));
			// use i+1 %max ==0 to go back to initial
			totalDis += individual.ConfigurationFile_ins.disMap[curCity][nextCity];
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
	
	
}
