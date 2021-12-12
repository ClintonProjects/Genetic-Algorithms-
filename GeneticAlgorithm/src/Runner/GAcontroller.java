package Runner;
import java.util.ListIterator;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProvider;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import Singleton.ConfigurationFile;
import StrategyPattern.*;


public class GAcontroller {
	
	String[] mode;
	AbstractFactory OpratorFactory;

    Crossover crossover; 
    Mutation  mutator;
    Selection selector;
    Replacer  Replacer;
    Individual bestIndividualOfAll;
	ConfigurationFile ConfigurationFile_ins = ConfigurationFile.getInstance();
	
	

	public GAcontroller(String[] mode){
		this.mode=mode;	
	    OpratorFactory= FactoryProvider.getFactory(mode[1]);
		crossover =  OpratorFactory.getCrossover(); 
		mutator = OpratorFactory.getMutation();
		selector= OpratorFactory.getSelection();
		
	}
	
	public GAcontroller(){
		
	    OpratorFactory= FactoryProvider.getFactory("B");
		crossover =  OpratorFactory.getCrossover(); 
		mutator = OpratorFactory.getMutation();
		selector= OpratorFactory.getSelection();
		
	}
	Individual run(Population population) {
		int DEVELOP_NUM=ConfigurationFile_ins.DEVELOP_NUM;
		
		while( DEVELOP_NUM < 0){
    	
    	Couple  parent = doSelection(population);
    	
    	Couple  child =crossover.doCross(parent);
    	
    	child=mutator.mutate(child);
    	
    	Replacer.relace(population, child);
    	Individual bestIndiviOfNew=getBest(population);
    	
    	if(bestIndividualOfAll.getFitness()<bestIndiviOfNew.getFitness())
    	bestIndividualOfAll=bestIndiviOfNew;	
    	
    	DEVELOP_NUM--;
		}
		return bestIndividualOfAll;	
    }
    
    Couple doSelection(Population p){
    	
        Couple parent = selector.select(p);
        return parent;

      }
    
	void doReplace(){};
	
	void setSelection(String mode){
		if(mode.equals("Tournament"))
			OpratorFactory= FactoryProvider.getFactory("B");
		    selector=OpratorFactory.getSelection();
	}
	
	Individual getBest(Population p)
	{
		float distance=Float.MAX_VALUE;
		Individual bestSpecies=null;
		ListIterator<Individual> P_iterator =p.getPopulation().listIterator();
		while(P_iterator.hasNext())
		{
			if(P_iterator.next().getFitness()<distance)
			{
				bestSpecies=P_iterator.previous();

				distance=P_iterator.next().getFitness();		
			}
		}
		return bestSpecies;
	}

}
