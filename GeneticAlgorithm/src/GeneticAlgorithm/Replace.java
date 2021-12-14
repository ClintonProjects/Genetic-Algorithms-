package GeneticAlgorithm;
import java.util.ListIterator;

import StrategyPattern.*;


public class Replace implements Replacer{

	@Override
	public void relace( Couple couple,Population p) {
		// TODO Auto-generated method stub

		
		p.population.set(p.population.indexOf(this.getWeakest(p)),couple.Individual1);
		
		p.population.set(p.population.indexOf(this.getWeakest(p)),couple.Individual2);
		
		
	}


Individual getWeakest(Population p)
  {
	float distance=Float.MAX_VALUE;
	Individual bestSpecies=null;
	ListIterator<Individual> P_iterator =p.getPopulation().listIterator();
	while(P_iterator.hasNext())
	{
		if(P_iterator.next().getFitness()>distance)
		{
			bestSpecies=P_iterator.previous();

			distance=P_iterator.next().getFitness();		
		}
	}
	return bestSpecies;
  }

}