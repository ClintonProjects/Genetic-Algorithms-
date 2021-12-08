package GenerticAlgorithmB;

import java.util.ArrayList;
import java.util.Random;

import GeneticAlgorithm.Couple;
import Re_constr.Population;

public class TourmentSelection implements GenerticAlgorithmB {

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

	public ArrayList<Integer> TouramentSelection() {
//		Individual IndividualA = new Individual();
//		Individual IndividualB = new Individual();
//		Individual[] listOfPopulation = population.getPopulation();
//		ArrayList<Individual> newList = (ArrayList<Individual>) Arrays.asList(listOfPopulation);

		// This code will be change from to the actual Algorithm, it just temp

		Random rand = new Random();

		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Couple> listOfCouples = new ArrayList<Couple>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < 10000; i++) {
			int tempComparer = rand.nextInt(10000000);
			if (!newList.contains(tempComparer)) newList.add(rand.nextInt(10000000));
		}

		// making sure the population count is an even number, this will cause issue
		// since it going to remove 1 item
		int selectionReturnSize = newList.size() / 2;
		if (selectionReturnSize % 2 == 1) selectionReturnSize = -1;

		// Choosing two random individuals from the population:
		for (int i = 0; i < selectionReturnSize / 2; i++) {
			// sets two random members to indivuals
			Integer indAToBeReturned = newList.get(rand.nextInt(newList.size()));
			Integer indBToBeReturned = newList.get(rand.nextInt(newList.size()));

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

		for (Couple i : listOfCouples) {
			double randomNumber = Math.abs(rand.nextDouble()) % 2;
			// Chooses are winner:, we biased the probability towards the fitter indivual
//			if (i.getA() > i.getB())
//				if (randomNumber < 0.75)
//					result.add(i.getA());
//				else
//					result.add(i.getB());
//			else if (randomNumber < 0.75)
//				result.add(i.getB());
//			else
//				result.add(i.getA());
		}

		System.out.println("size: " + result.size());
//		return result;
	}

}
