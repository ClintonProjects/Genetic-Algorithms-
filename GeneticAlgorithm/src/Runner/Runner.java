package Runner;

import GeneticAlgorithm.*;

public class Runner {

	public static void main(String... args) {
		
		Population p1=new Population();
		//get the population
		
		GAcontroller GA1=new GAcontroller();
		//get a controller, which can get all of the Algorithm and also this Algorithm can be set
		
		GA1.setSelection("Tournament");
		// we can change the the strategy of selection Algorithm
		Individual bestRate=GA1.run(p1);
		//get best Individual
		
		bestRate.printRate();
}
}
