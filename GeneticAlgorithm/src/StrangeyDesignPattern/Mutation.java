package StrangeyDesignPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

//Class Name: Couple
//Description:
//This is for the abstract factory.
//Authors(s): Clinton, Wang

public interface Mutation {
	Couple mutate(Couple couple);
}
