package GenerticAlgorithmA;

import AbstractFactory.AbstractFactory;

public class GeneticAlgorithmFactoryA implements AbstractFactory<GenerticAlgorithmA> {

	@Override
	public GenerticAlgorithmA create(String gaMethod) {
		if ( gaMethod.equalsIgnoreCase("RouletteWheelSelection"))
			return new RouletteWheelSelection();
		else if ( gaMethod.equalsIgnoreCase("TwoPointMutation")) 
			return new TwoPointMutation();
		if ( gaMethod.equalsIgnoreCase("TwoPointCrossOver")) 
			return new TwoPointCrossOver();
		return null;
	}
}
