package GaAbstractFactory;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import StrangeyDesignPattern.Crossover;
import StrangeyDesignPattern.Mutation;
import StrangeyDesignPattern.RouletteWheelSelection;
import StrangeyDesignPattern.Selection;
import StrangeyDesignPattern.TourmentSelection;
import StrangeyDesignPattern.TwoPointCrossover;
import StrangeyDesignPattern.TwoPointMutation;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang


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
