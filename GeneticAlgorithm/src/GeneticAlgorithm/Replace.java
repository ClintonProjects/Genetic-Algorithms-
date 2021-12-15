package GeneticAlgorithm;

import StrangeyDesignPattern.Replacer;
/*Class Name: Replace
*Description:
*one strategy of replace,the reproduction produce two child。 
*Here code selects the two weakest individual to be replaced by the child.
*Authors(s): Clinton, Wang
*/

public class Replace implements Replacer {

	@Override
	public void doRelace(Couple couple, Population p) {
		FitnessEvaluator fitnessEvaluator = new FitnessEvaluator();
		p.population.set(p.population.indexOf(fitnessEvaluator.getWeakest(p)), couple.Individual1);
		p.population.set(p.population.indexOf(fitnessEvaluator.getWeakest(p)), couple.Individual2);


	}
}