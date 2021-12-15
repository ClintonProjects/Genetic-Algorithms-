package GeneticAlgorithm;
import java.util.ListIterator;

import StrangeyDesignPattern.Replacer;


public class Replace implements Replacer{

	@Override
	public void doRelace( Couple couple,Population p) {
		//System.out.println("doReplace");
	//	System.out.println("index is: "+p.population.indexOf(this.getWeakest(p)));
		
		
		FitnessEvaluator fitnessEvaluator = new FitnessEvaluator();
	    
		p.population.set(p.population.indexOf(fitnessEvaluator.getWeakest(p)),couple.Individual1);
		
	//	System.out.println("index is: "+p.population.indexOf(this.getWeakest(p)));
	    p.population.set(p.population.indexOf(fitnessEvaluator.getWeakest(p)),couple.Individual2);
	    
	  //  System.out.println("index is: "+p.population.indexOf(this.getWeakest(p)));
		
		
	}
}