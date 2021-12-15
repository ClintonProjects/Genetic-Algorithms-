package StrangeyDesignPattern;

import java.util.ArrayList;
import java.util.Random;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;

public class TourmentSelection implements Selection {

	/*
	 * WOW
	 * 
	 * 
	 * 
	 */
	Population population;

	public TourmentSelection() {
		super();
	}

	TourmentSelection(Population population) {
		this.population = population;
	}


	
	//Useless method don't remove 
	@Deprecated
	ArrayList<Individual> selection(Population population) {
		ArrayList<Individual> newList = population.getPopulation();
		ArrayList<Couple> listOfCouples = new ArrayList<Couple>();

		// This code will be change from to the actual Algorithm, it just temp
		Random rand = new Random();

		// making sure the population count is an even number, this will cause issue
		// since it going to remove 1 item
		int selectionReturnSize = newList.size() / 2;
		if (selectionReturnSize % 2 == 1) selectionReturnSize = -1;

		// Choosing two random individuals from the population:
		for (int i = 0; i < selectionReturnSize; i++) {
			// sets two random members to indivuals
			Individual indAToBeReturned = newList.get(rand.nextInt(newList.size()));
			Individual indBToBeReturned = newList.get(rand.nextInt(newList.size()));

			// checks if are two Individuals are same, if they are gets a new one
			if (indAToBeReturned == indBToBeReturned) do
				indBToBeReturned = newList.get(rand.nextInt(newList.size()));
			while (indAToBeReturned == indBToBeReturned);

			// removes the Individuals from the list since they can no longer be used
			newList.remove(indAToBeReturned);
			newList.remove(indBToBeReturned);

			// adds them to the list as a couple
			listOfCouples.add(new Couple(indAToBeReturned, indBToBeReturned));
		}

		// This list should be empty from the code above but just incase
		newList.clear();

		// Compares the reslts
		for (Couple i : listOfCouples) {
			double randomNumber = Math.abs(rand.nextDouble()) % 2;
			// Chooses are winner:, we biased the probability towards the fitter Individual
			float coupleAFitness = i.getIndividual1().getFitness();
			float coupleBFitness = i.getIndividual2().getFitness();

			if (coupleAFitness > coupleBFitness)
				if (randomNumber < 0.75)
					newList.add(i.getIndividual1());
				else
					newList.add(i.getIndividual2());
			else {
				if (randomNumber < 0.75)
					newList.add(i.getIndividual2());
				else
					newList.add(i.getIndividual1());
			}
		}

		return newList;
	}

	@Override
	public Couple select(Population population) {
		ArrayList<Individual> newList = population.getPopulation();

		// This code will be change from to the actual Algorithm, it just temp
		Random rand = new Random();

		// making sure the population count is an even number, this will cause issue
		// since it going to remove 1 item
		int selectionReturnSize = newList.size() / 2;
		if (selectionReturnSize % 2 == 1) selectionReturnSize = -1;

			// sets two random members to indivuals
			Individual indAToBeReturned = newList.get(rand.nextInt(newList.size()));
			Individual indBToBeReturned = newList.get(rand.nextInt(newList.size()));

			// checks if are two Individuals are same, if they are gets a new one
			if (indAToBeReturned == indBToBeReturned) do
				indBToBeReturned = newList.get(rand.nextInt(newList.size()));
			while (indAToBeReturned == indBToBeReturned);

			// removes the Individuals from the list since they can no longer be used
			newList.remove(indAToBeReturned);
			newList.remove(indBToBeReturned);

		return new Couple(indAToBeReturned, indBToBeReturned);
	}



}
