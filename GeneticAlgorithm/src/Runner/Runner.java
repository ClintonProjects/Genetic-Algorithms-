package Runner;

import java.util.ArrayList;

import GenerticAlgorithmB.SelectionB;
import GeneticAlgorithm.Population;

public class Runner {

	
	public static void main(String... args) {
		ArrayList<Integer> TouramentSelection = new SelectionB().TouramentSelection();
		TouramentSelection.forEach(i -> System.out.println(i));
	
		
		
	}
	
	
}
