package StrategyPattern;

import GenerticAlgorithmB.GeneticAlgorithmFactoryB;
import Interfaces.Mutation;
import Interfaces.Selection;

public class GAOperatorOnePoint extends GAOperator {

	public GAOperatorOnePoint() {
		crossover = new GeneticAlgorithmFactoryB().getCrossover();
		Mutation Mutation;
		Selection selection;
	}

}
