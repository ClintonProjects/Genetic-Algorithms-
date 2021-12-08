package AbstractFactory;

import Interfaces.Crossover;
import Interfaces.Mutation;
import Interfaces.Selection;

public interface AbstractFactory  {
	Crossover getCrossover();
	Mutation getMutation();
	Selection getSelection();
}
