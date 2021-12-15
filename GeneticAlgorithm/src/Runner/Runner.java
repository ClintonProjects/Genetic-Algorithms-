package Runner;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Mode;
import GeneticAlgorithm.Population;
import StrangeyDesignPattern.GAcontroller;

//Class Name: Couple
//Description:
//
//Authors(s): Clinton, Wang


public class Runner {

	public static void main(String... args) {

		Population p1 = new Population();
		// get the population

		GAcontroller GA1 = new GAcontroller();
		// get a controller, which can get all of the Algorithm and also this Algorithm
		// can be set

		GA1.setSelection(Mode.Tournament);
		//GA1.setMutation("one Point");
		//GA1.setCrossover("one Point");
		
		//GA1.setSelection("RouletteWheel");
		GA1.setMutation(Mode.TwoPoint);
		GA1.setCrossover(Mode.TwoPoint);
		// we can change the the strategy of selection Algorithm
		Individual bestRate = GA1.run(p1);
		System.out.println("The Best Route Is Below");
		bestRate.printRate();
		System.out.println("The Best Individual of the every generation show below: ");
		GA1.PrintFitness(GA1.generationBestFitness);

		// get best Individual

		bestRate.printRate();
		
	
		
		
	}
}
