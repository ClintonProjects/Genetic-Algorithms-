package StrangeyDesignPattern;

import java.util.ArrayList;
import java.util.ListIterator;

import GaAbstractFactory.AbstractFactory;
import GaAbstractFactory.FactoryControllor;
import GaAbstractFactory.FactoryProvider;
import GaAbstractFactory.Mode;
import GeneticAlgorithm.Couple;
import GeneticAlgorithm.FitnessEvaluator;
import GeneticAlgorithm.Individual;
import GeneticAlgorithm.Population;
import GeneticAlgorithm.Replace;
import Singleton.ConfigurationFile;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang

public class GAcontroller {

	String mode;
	AbstractFactory OpratorFactory;

	Crossover crossover;
	Mutation mutator;
	Selection selector;
	Replacer Replacer;
	Individual bestIndividualOfAll = new Individual();

	public ArrayList<Float> generationBestFitness = new ArrayList<Float>();

	public GAcontroller(String mode) {
		this.mode = mode;
		FactoryControllor s = mode.equalsIgnoreCase("One Point") ? FactoryControllor.OnePoint : FactoryControllor.TwoPoint;
		OpratorFactory = FactoryProvider.getFactory(s);
		crossover = OpratorFactory.getCrossover();
		mutator = OpratorFactory.getMutation();
		selector = OpratorFactory.getSelection();

	}

	public GAcontroller() {

		OpratorFactory = FactoryProvider.getFactory(FactoryControllor.OnePoint);
		crossover = OpratorFactory.getCrossover();
		mutator = OpratorFactory.getMutation();
		selector = OpratorFactory.getSelection();

	}

	public Individual run(Population population) {
		int DEVELOP_NUM = ConfigurationFile.getInstance().DEVELOP_NUM;

		while (DEVELOP_NUM > 0) {
			if (selector.getClass().getSimpleName().equals("TourmentSelection")) elistic(population);
			// System.out.println(population.getPopulation().size());
			Couple parent = doSelection(population);

			Couple child = crossover.doCross(parent);

			child = mutator.mutate(child);

			doReplace(child, population);

			Individual bestIndiviOfNew = new FitnessEvaluator().getBest(population);

			// bestIndiviOfNew.printRate();
			generationBestFitness.add(bestIndiviOfNew.getFitness());

			if (bestIndividualOfAll.getFitness() > bestIndiviOfNew.getFitness())

				bestIndividualOfAll = bestIndiviOfNew;

			DEVELOP_NUM--;

		}
		return bestIndividualOfAll;
	}

	Couple doSelection(Population p) {

		Couple parent = selector.select(p);
		return parent;

	}

	void doReplace(Couple couple, Population p) {
		Replacer = new Replace();
		Replacer.doRelace(couple, p);
	}

	public void setMutation(String mode) {
		FactoryControllor s = mode.equalsIgnoreCase("One Point") ? FactoryControllor.OnePoint : FactoryControllor.TwoPoint;

		if (s == FactoryControllor.TwoPoint) {
			OpratorFactory = FactoryProvider.getFactory(FactoryControllor.TwoPoint);
			mutator = OpratorFactory.getMutation();
		} else if (s == FactoryControllor.OnePoint) {
			OpratorFactory = FactoryProvider.getFactory(FactoryControllor.OnePoint);
			mutator = OpratorFactory.getMutation();
		}

		System.out.println("The current Mutation is " + mutator.getClass().getSimpleName());
	}

	public void setCrossover(String mode) {
		FactoryControllor s = mode.equalsIgnoreCase("One Point") ? FactoryControllor.OnePoint : FactoryControllor.TwoPoint;
		if (s == FactoryControllor.TwoPoint) {
			OpratorFactory = FactoryProvider.getFactory(FactoryControllor.TwoPoint);
			crossover = OpratorFactory.getCrossover();
		} else if (s == FactoryControllor.OnePoint) {
			OpratorFactory = FactoryProvider.getFactory(FactoryControllor.OnePoint);
			crossover = OpratorFactory.getCrossover();
			;
		}
		System.out.println("The current Crossover is " + crossover.getClass().getSimpleName());

	}

	public void setSelection(String mode) {
		Mode s = mode.equalsIgnoreCase("Tournament") ? Mode.Tourment : Mode.Roulette;
		if ( s == Mode.Tourment) {
			OpratorFactory = FactoryProvider.getFactory(FactoryControllor.TwoPoint);
			selector = OpratorFactory.getSelection();
		} else if (s == Mode.Roulette) {
			OpratorFactory = FactoryProvider.getFactory(FactoryControllor.OnePoint);
			selector = OpratorFactory.getSelection();
		}

		System.out.println("The current selection is " + selector.getClass().getSimpleName());

	}

	public void PrintFitness(ArrayList p) {
		ListIterator<Float> P_iterator = p.listIterator();

		while (P_iterator.hasNext()) {
			System.out.println(" population fitness is" + P_iterator.next());

		}
	}

	void elistic(Population population) {

		FitnessEvaluator fitnessEvaluator = new FitnessEvaluator();
		Individual BestSpecies = fitnessEvaluator.getBest(population);
		int talentNum = (int) 2;

		for (int i = 1; i <= talentNum; i++) {
			Individual newSpecies = BestSpecies.deepCopy();
			population.getPopulation().add(newSpecies);

		}
	}

}
