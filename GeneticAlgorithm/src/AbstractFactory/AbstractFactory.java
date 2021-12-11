package AbstractFactory;

import StrategyPattern.Crossover;
import StrategyPattern.Mutation;
import StrategyPattern.Selection;

public interface AbstractFactory  {
	public Crossover getCrossover();
	public Mutation getMutation();
	public Selection getSelection();
}
