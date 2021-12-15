package GaAbstractFactory;

import StrangeyDesignPattern.Crossover;
import StrangeyDesignPattern.Mutation;
import StrangeyDesignPattern.Selection;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang


public interface AbstractFactory  {
	//abstract factory provider for the abstract factory method.
	public Crossover getCrossover();
	public Mutation getMutation();
	public Selection getSelection();

}
