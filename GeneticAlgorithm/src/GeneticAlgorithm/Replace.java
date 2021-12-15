package GeneticAlgorithm;
import java.util.ListIterator;

import StrangeyDesignPattern.Replacer;
/*Class Name: Replace
*Description:
*one strategy of replace,the reproduction produce two child。 
*Here code selects the two weakest individual to be replaced by the child.
*Authors(s): Clinton, Wang
*/

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