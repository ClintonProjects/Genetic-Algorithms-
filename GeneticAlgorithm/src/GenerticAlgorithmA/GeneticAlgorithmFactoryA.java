package GenerticAlgorithmA;

import AbstractFactory.AbstractFactory;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import Interfaces.Crossover;
import Interfaces.Mutation;
import Interfaces.Selection;

public class GeneticAlgorithmFactoryA implements AbstractFactory {

	@Override
	public Crossover getCrossover() {
		// TODO Auto-generated method stub
		return new TwoPointCrossOver();
	}

	@Override
	public Mutation getMutation() {
		// TODO Auto-generated method stub
		return new TwoPointMutation();
	}

	@Override
	public Selection getSelection() {
		// TODO Auto-generated method stub
		return new RouletteWheelSelection();
	}


}
