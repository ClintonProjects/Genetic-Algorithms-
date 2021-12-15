package StrangeyDesignPattern;

import java.util.ArrayList;
import java.util.Random;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;

//Class Name: TourmentSelection
//Description:Tournament Selection
//This is for the abstract factory.
//Authors(s): Clinton, Wang

public class TourmentSelection implements Selection {

	Population population;

	public TourmentSelection() {
		super();
	}

	TourmentSelection(Population population) {
		this.population = population;
	}


	
	/**
	 * Tourney select.
	 * 
	 * @param Population population
	 * @return Couple
	 * @see
	 */
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
