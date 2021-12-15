package GenerticAlgorithmOnePoint;

import AbstractFactory.AbstractFactory;
import GenerticAlgorithmTwoPoint.TourmentSelection;
import Inheritance.Crossover;
import Inheritance.Mutation;
import Inheritance.Selection;

public class GeneticAlgorithmFactoryOnePoint implements AbstractFactory {

	
	// 
	
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
