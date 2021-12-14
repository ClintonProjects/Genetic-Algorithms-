package GenerticAlgorithmOnePoint;

import AbstractFactory.AbstractFactory;
import GenerticAlgorithmTwoPoint.TourmentSelection;
import StrategyPattern.Crossover;
import StrategyPattern.Mutation;
import StrategyPattern.Selection;

public class GeneticAlgorithmFactoryOnePoint implements AbstractFactory {

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
		return new RouletteWheelSelection();
	}


}
