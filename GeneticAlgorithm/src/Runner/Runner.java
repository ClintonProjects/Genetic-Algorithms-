package Runner;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import StrangeyDesignPattern.GAcontroller;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang


public class Runner {

	public static void main(String... args) {

		Population p1 = new Population();
		// get the population

		GAcontroller GA1 = new GAcontroller();
		// get a controller, which can get all of the Algorithm and also this Algorithm
		// can be set

		GA1.setSelection("Tournament");
		GA1.setMutation("Two Point");
		GA1.setCrossover("Two Point");

		// we can change the the strategy of selection Algorithm
		Individual bestRate = GA1.run(p1);
		System.out.println(" runner best");
		bestRate.printRate();
		GA1.PrintFitness(GA1.generationBestFitness);

		// get best Individual

		bestRate.printRate();
	}
}
