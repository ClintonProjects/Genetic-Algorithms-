package StrangeyDesignPattern;

import GeneticAlgorithm.Individual;
import GeneticAlgorithm.*;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang

public interface Replacer {
	void doRelace(Couple couple, Population p);
}
