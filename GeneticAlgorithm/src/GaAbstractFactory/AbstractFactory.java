package GaAbstractFactory;

import StrangeyDesignPattern.Crossover;
import StrangeyDesignPattern.Mutation;
import StrangeyDesignPattern.Selection;

public interface AbstractFactory  {
	//abstract factory provider for the abstract factory method.
	public Crossover getCrossover();
	public Mutation getMutation();
	public Selection getSelection();

}
