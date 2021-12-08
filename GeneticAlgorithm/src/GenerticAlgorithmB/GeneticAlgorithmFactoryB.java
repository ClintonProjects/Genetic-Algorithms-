package GenerticAlgorithmB;

import AbstractFactory.AbstractFactory;
import Interfaces.Crossover;
import Interfaces.Mutation;
import Interfaces.Selection;

public class GeneticAlgorithmFactoryB implements AbstractFactory {

	@Override
	public Crossover getCrossover() {
		// TODO Auto-generated method stub
		return new OnePointCrossover();
	}

	@Override
	public Mutation getMutation() {
		// TODO Auto-generated method stub
		return new OnePointMutation();
	}

	@Override
	public Selection getSelection() {
		// TODO Auto-generated method stub
		return new TourmentSelection();
	}



}
