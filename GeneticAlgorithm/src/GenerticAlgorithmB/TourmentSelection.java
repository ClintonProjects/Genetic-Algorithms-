package GenerticAlgorithmB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import Interfaces.Selection;

public class TourmentSelection implements GenerticAlgorithmB, Selection {

	Population population;

	public TourmentSelection() {
	}

	public TourmentSelection(Population population) {
		this.population = population;
	}

	@Override
	public String getId() {
		return "";
	};

	// https://www.youtube.com/channel/UCzvWh64GQm_OfkJXyYo7whQ
	// https://www.youtube.com/watch?v=pJ45IaGzI1c
	// https://www.youtube.com/watch?v=9OXJapW8vqM
	// https://www.youtube.com/watch?v=3JrpyuSHEWQ

	
	public ArrayList<Individual> selection(Population population) {
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



}
