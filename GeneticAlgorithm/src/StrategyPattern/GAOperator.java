package StrategyPattern;

import GenerticAlgorithmB.*;
import GenerticAlgorithmA.*;
import GeneticAlgorithm.*;
import Interfaces.*;
abstract public class GAOperator {

	Crossover crossover; 
	Mutation Mutation;
	Selection selection = new GeneticAlgorithmFactoryA().getSelection();
	

}
