package StrangeyDesignPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Individual;

//Class Name: Mutation
//Description:
//This is the interface associated with the StatngeyDesignPattern
//Authors(s): Clinton, Wang

public interface Mutation {
	Couple mutate(Couple couple);
}
