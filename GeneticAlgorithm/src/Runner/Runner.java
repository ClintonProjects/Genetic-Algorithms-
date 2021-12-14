package Runner;

import GeneticAlgorithm.*;

public class Runner {

	public static void main(String... args) {
		
		
		
		
		/*
		 * Population
		 * Selection
		 * Crossover
		 * mutation
		 * Fitness
		 * replacement back into the population
		 * 
		 * 
		 * example
		 * 
		 * Population = new Popualtion();
		 * Selection = new Selection(Population);
		 * Mutation = new Mutation();
		 * Fitness f = new Fitness();
		 * Replacement  r= new Replacement();
		 * 
		 * This should all run in a loop.
		 * 
		 * 
		 * Grading Scheme:
		 * 
		 * Data abstraction used appropriately throughout
		 * 
		 * Information hiding present and appropriate throughout
		 * 
		 * Separation of behavior and implementation particularly with respect to the Strategy & Factory design patterns
		 * 
		 * Multiple-file or multiple-module programming solution submitted - classes, subclasses (class hierarchies/inheritance), generics and polymorphism used appropriately to reuse existing design and code throughout.
		 * 
		 * Programming solution submitted creates data structures that can be objectively judged to be cohesive (facilitate maintenance), facilitate reuse/extensibility, adhere to the principle of substitutability and the open-closed principle � and reuse existing libraries where appropriate.
		 *
		 *
		 *Singleton pattern correctly applied to allow a single instance of a class to be created only.
		 *
		 *Strategy pattern correctly applied to allow dynamic change of behaviour at runtime
		 *
		 *Factory pattern correctly applied to handle instantiation of GA operator objects.
		 *
		 */
		
		Population p1=new Population();
		//get the population
		
		GAcontroller GA1=new GAcontroller();
		//get a controller, which can get all of the Algorithm and also this Algorithm can be set
		
	//	GA1.setSelection("Tournament");
		// we can change the the strategy of selection Algorithm
		Individual bestRate=GA1.run(p1);
		System.out.println(" runner best");
		bestRate.printRate();
		//get best Individual
		
		//bestRate.printRate();
}
}
