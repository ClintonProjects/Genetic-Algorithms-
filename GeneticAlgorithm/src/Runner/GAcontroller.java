package Runner;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProvider;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import Singleton.ConfigurationFile;
import StrategyPattern.*;


public class GAcontroller {
	
public enum Color {  
	  RED, GREEN, BLANK, YELLOW  
	} 
	String[] mode;
	AbstractFactory OpratorFactory;

    Crossover crossover; 
    Mutation  mutator;
    Selection selector;
    Replace  Replacer;
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
    	
    	Population p = new Population();
    	
    	Couple  parent = doSelection(p);
    	
    	Couple  child =crossover.crossover(parent);
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
	
}
