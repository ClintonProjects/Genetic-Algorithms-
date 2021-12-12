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
		newCouple.Individual1=this.selectIndvidual(population).deepCopy();
		
		newCouple.Individual2=this.selectIndvidual(population).deepCopy();
		
		return newCouple;
		
	}
	public Individual selectIndvidual(Population population) {
		// TODO Auto-generated method stub
		FitnessEvaluator fitnessEvaluator=new FitnessEvaluator();
		fitnessEvaluator.updateFitness(population);
		
		Individual talentSpecies=null;
		
		Individual SelectedIndiv=null;
		
		ListIterator<Individual> P_iterator =population.getPopulation().listIterator();
		float talentDis=Float.MAX_VALUE;
		float totalDis=0;
		while(P_iterator.hasNext())
		{
			if(talentDis > P_iterator.next().getFitness())
			{
				talentDis=P_iterator.next().getFitness();
				talentSpecies=P_iterator.next().deepCopy();
			}
		}

	
		int talentNum=(int)(population.getPopulation().size()/5);
		for(int i=1;i<=talentNum;i++)
		{
			Individual newSpecies=talentSpecies.deepCopy();
			population.getPopulation().add(newSpecies);
	
		}
		fitnessEvaluator.updateFitness(population);
		P_iterator =population.getPopulation().listIterator();
		while(P_iterator.hasNext()) {
		totalDis+=P_iterator.next().getFitness();
		}
		
		float r = (float) (Math.random()*totalDis);
		
		P_iterator =population.getPopulation().listIterator();
		while(P_iterator.hasNext()&&P_iterator.next()!=talentSpecies){
			float sum = 0;
			sum+=P_iterator.next().getFitness();
			if(sum>r) {
				SelectedIndiv=P_iterator.previous().deepCopy();
				break;
			}			
		}
		
		return SelectedIndiv;
		
	}

}
