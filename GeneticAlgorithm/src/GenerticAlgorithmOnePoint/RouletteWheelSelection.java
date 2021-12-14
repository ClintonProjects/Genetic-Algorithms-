package GenerticAlgorithmOnePoint;

import java.util.ArrayList;
import java.util.ListIterator;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.FitnessEvaluator;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import StrategyPattern.Selection;


public class RouletteWheelSelection implements  Selection {


	@Override
	
	
	public Couple select(Population population) {
		Couple newCouple= new Couple();
		newCouple.Individual1=this.selectIndvidual(population);
		
		newCouple.Individual2=this.selectIndvidual(population);
		
		return newCouple;
		
	}
	public Individual selectIndvidual(Population population) {
		// TODO Auto-generated method stub
		FitnessEvaluator fitnessEvaluator=new FitnessEvaluator();
		
		fitnessEvaluator.updateFitness(population);

		Individual SelectedIndiv=null;
		
		ListIterator<Individual> P_iterator =population.getPopulation().listIterator();
		
		float totalDis=0;
		

		while(P_iterator.hasNext()) {
			
		totalDis+=P_iterator.next().getFitness();
	    
		}
		
		float r = (float) (Math.random()*totalDis);
		float sum = 0;
		//System.out.println("totalDis is: "+totalDis);
		
		
		P_iterator =population.getPopulation().listIterator();
		
		while(P_iterator.hasNext()){
			
			 
			sum+=P_iterator.next().getFitness();
			
			//System.out.println("sum is: "+sum);
			// System.out.println("r is: "+r);
			if(sum>r) {
			//	System.out.println("new sum is: "+sum);
			//	 System.out.println("new r is: "+r);
				SelectedIndiv=P_iterator.previous().deepCopy();
				break;
			}			
		}
		
		return SelectedIndiv;
		
	}
	
	void elistic(Population population) {
		ListIterator<Individual> P_iterator =population.getPopulation().listIterator();
		float talentDis=Float.MAX_VALUE;
	
		Individual talentSpecies=null;
		while(P_iterator.hasNext())
		{
			if(talentDis > P_iterator.next().getFitness())
			{
				talentDis=P_iterator.previous().getFitness();
				talentSpecies=P_iterator.next().deepCopy();
			}
		}
		
		int talentNum=(int)(population.getPopulation().size()/5);
		for(int i=1;i<=talentNum;i++)
		{
			Individual newSpecies=talentSpecies.deepCopy();
			population.getPopulation().add(newSpecies);
	
		}
	}

}
