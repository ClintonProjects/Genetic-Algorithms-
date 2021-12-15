package GaAbstractFactory;

import StrangeyDesignPattern.Crossover;
import StrangeyDesignPattern.Mutation;
import StrangeyDesignPattern.OnePointCrossover;
import StrangeyDesignPattern.OnePointMutation;
import StrangeyDesignPattern.RouletteWheelSelection;
import StrangeyDesignPattern.Selection;

//Class Name: Couple
//Description: 
//This is for the abstract factory.
//Authors(s): Clinton, Wang


public class GeneticAlgorithmFactoryOnePoint implements AbstractFactory {

	@Override
	/**
	* returns an interface for crossover
	* @param 
	* @param  
	* @return   
	* @see   
	*/
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
