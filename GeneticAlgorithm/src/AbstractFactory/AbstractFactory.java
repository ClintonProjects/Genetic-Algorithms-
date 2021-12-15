package AbstractFactory;

import Inheritance.Crossover;
import Inheritance.Mutation;
import Inheritance.Selection;

public interface AbstractFactory  {
	//abstract factory provider for the abstract factory method.
	public Crossover getCrossover();
	public Mutation getMutation();
	public Selection getSelection();

}
