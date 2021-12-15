package GenerticAlgorithmTwoPoint;

import AbstractFactory.AbstractFactory;
import GenerticAlgorithmOnePoint.RouletteWheelSelection;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import Inheritance.Crossover;
import Inheritance.Mutation;
import Inheritance.Selection;

public class GeneticAlgorithmFactoryTwoPoint implements AbstractFactory {

	@Override
	public Crossover getCrossover() {
		// TODO Auto-generated method stub
		return new TwoPointCrossover();
	}

	@Override
	public Mutation getMutation() {
		// TODO Auto-generated method stub
		return new TwoPointMutation();
	}

	@Override

	public Selection getSelection() {
		// TODO Auto-generated method stub
		return new TourmentSelection();
	}


}
