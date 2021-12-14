package Runner;
import java.util.ArrayList;
import java.util.ListIterator;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProvider;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.FitnessEvaluator;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import GeneticAlgorithm.Replace;
import Singleton.ConfigurationFile;
import Singleton.ConfigurationFileSingleton;
import StrategyPattern.*;


public class GAcontroller {
	
	String[] mode;
	AbstractFactory OpratorFactory;

    Crossover crossover; 
    Mutation  mutator;
    Selection selector;
    Replacer  Replacer;
    Individual bestIndividualOfAll=new Individual() ;
	ConfigurationFile ConfigurationFile_ins = ConfigurationFileSingleton.getInstance();
	
	public ArrayList<Float> generationBestFitness = new ArrayList<Float>();
	

	public GAcontroller(String[] mode){
		this.mode=mode;	
	    OpratorFactory= FactoryProvider.getFactory(mode[1]);
		crossover =  OpratorFactory.getCrossover(); 
		mutator = OpratorFactory.getMutation();
		selector= OpratorFactory.getSelection();
		
	}
	
	public GAcontroller(){
		
	    OpratorFactory= FactoryProvider.getFactory("One Point");
		crossover =  OpratorFactory.getCrossover(); 
		mutator = OpratorFactory.getMutation();
		selector= OpratorFactory.getSelection();
		
	}
	Individual run(Population population)
	{
		int DEVELOP_NUM=ConfigurationFile_ins.DEVELOP_NUM;
		
		while( DEVELOP_NUM > 0){
			elistic(population);
		System.out.println(population.getPopulation().size());
    	Couple  parent = doSelection(population);
 
    	Couple  child =crossover.doCross(parent);
    	
    	child=mutator.mutate(child);
    	
    	doReplace(child,population);
    	
    	Individual bestIndiviOfNew=getBest(population);
    	
    	
    	//bestIndiviOfNew.printRate();
    	generationBestFitness.add(bestIndiviOfNew.getFitness());
    	
    	if(bestIndividualOfAll.getFitness()>bestIndiviOfNew.getFitness())
    		
    	bestIndividualOfAll=bestIndiviOfNew;	

    	DEVELOP_NUM--;
    	
		}
		return bestIndividualOfAll;	
    }
    
    Couple doSelection(Population p){
    	
        Couple parent = selector.select(p);
        return parent;

      }
    
	void doReplace(Couple couple, Population p){
		Replacer= new Replace();
		Replacer.doRelace(couple, p);
	}
	
	void setSelection(String mode){
		
		
		if(mode.equals("Two Point")) {
			OpratorFactory= FactoryProvider.getFactory("Two Point");
		    mutator=OpratorFactory.getMutation();}
		else if(mode.equals("One Point")) {
			OpratorFactory= FactoryProvider.getFactory("One  Point");
	         mutator=OpratorFactory.getMutation();
		    }
		else {
			System.out.println("You input a wrong mode, it shold be Two Point or Two Point");
		}
		
		
		
	}
	
	void setMutation(String mode){
		if(mode.equals("Two Point")) {
			OpratorFactory= FactoryProvider.getFactory("Two Point");
			crossover=OpratorFactory.getCrossover();}
		else if(mode.equals("One Point")) {
			OpratorFactory= FactoryProvider.getFactory("One Point");
			crossover=OpratorFactory.getCrossover();;
	 }
	    else {
				System.out.println("You input a wrong mode, it shold be Tournament or RouletteWheel");
			}	
	}
	void setCrossover(String mode){
		if(mode.equals("Two Point")) {
			OpratorFactory= FactoryProvider.getFactory("Two Point");
		    selector=OpratorFactory.getSelection();}
		else if(mode.equals("One Point")) {
				OpratorFactory= FactoryProvider.getFactory("One Point");
			selector=OpratorFactory.getSelection();
			    }
	    else {
				System.out.println("You input a wrong mode, it shold be Tournament or RouletteWheel");
			}	
	}
	Individual getBest(Population p)
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
	
	 void PrintFitness(ArrayList p) {
		 ListIterator<Float> P_iterator =p.listIterator();

			while(P_iterator.hasNext())
			{	System.out.println(" population fitness is"+ P_iterator.next());	
				
			}
       }
	 
	 
		void elistic(Population population) {
			
			FitnessEvaluator fitnessEvaluator=new FitnessEvaluator();
			Individual BestSpecies=fitnessEvaluator.getBest(population);
			int talentNum=(int)2;
			
			
			for(int i=1;i<=talentNum;i++)
			{
				Individual newSpecies=BestSpecies.deepCopy();
				population.getPopulation().add(newSpecies);
		
			}
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
