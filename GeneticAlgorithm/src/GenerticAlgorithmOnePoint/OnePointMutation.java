package GenerticAlgorithmOnePoint;

import java.util.Random;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import Inheritance.Crossover;
import Inheritance.Mutation;
import Singleton.ConfigurationFile;
import Singleton.ConfigurationFileSingleton;

public class OnePointMutation implements Mutation {

	ConfigurationFile ConfigurationFile_ins = ConfigurationFileSingleton.getInstance();
	
	public Couple mutate(Couple couple) {
		Couple newCouple= couple.deepCopy();
		newCouple.Individual1=this.mutate(newCouple.Individual1);
		newCouple.Individual2=this.mutate(newCouple.Individual2);
		return newCouple;
	}
	
	public Individual mutate(Individual individual) {
		
		Individual newIndividual= individual.deepCopy();
		Random rand = new Random();
		float rate = (float) Math.random();

		if(rate < ConfigurationFile_ins.pm) {
			int left = rand.nextInt(ConfigurationFile_ins.CITY_NUM);
			int right = rand.nextInt(ConfigurationFile_ins.CITY_NUM);
			if(left > right)
			{
				int tmp;
				tmp=left;
				left=right;
				right=tmp;
			}
		//	System.out.println("left is"+left+ " right is " +right);
			while(left < right)
			{
				String tmp;
				tmp=newIndividual.genes.get(left);
				newIndividual.genes.set(left,newIndividual.genes.get(right));
				newIndividual.genes.set(right, tmp);
				left++;
				right--;
			}
			
		}
		
		
		return newIndividual;
	}
	

}
