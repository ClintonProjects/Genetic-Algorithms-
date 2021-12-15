package GeneticAlgorithm;
import java.util.ListIterator;

import StrangeyDesignPattern.Replacer;


public class Replace implements Replacer{

	@Override
	public void doRelace( Couple couple,Population p) {
		//System.out.println("doReplace");
	//	System.out.println("index is: "+p.population.indexOf(this.getWeakest(p)));
		
	
		p.population.set(p.population.indexOf(this.getWeakest(p)),couple.Individual1);
		
	//	System.out.println("index is: "+p.population.indexOf(this.getWeakest(p)));
	    p.population.set(p.population.indexOf(this.getWeakest(p)),couple.Individual2);
	    
	  //  System.out.println("index is: "+p.population.indexOf(this.getWeakest(p)));
		
		
	}


Individual getWeakest(Population p)
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

		 void PrintFitness(Population p) {
			 ListIterator<Individual> P_iterator =p.getPopulation().listIterator();
	
				while(P_iterator.hasNext())
				{
					
					System.out.println(" population fitness is"+ P_iterator.next().getFitness());	
					}
				}
 }

