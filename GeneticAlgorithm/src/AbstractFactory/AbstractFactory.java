package AbstractFactory;

import Interfaces.Crossover;
import Interfaces.Mutation;
import Interfaces.Selection;

public interface AbstractFactory  {
	public Crossover getCrossover();
	public Mutation getMutation();
	public Selection getSelection();
}
