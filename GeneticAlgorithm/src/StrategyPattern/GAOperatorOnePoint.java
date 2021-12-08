package StrategyPattern;


import GenerticAlgorithmB.*;
import GenerticAlgorithmA.*;
import GeneticAlgorithm.*;
import Interfaces.*;

public class GAOperatorOnePoint extends GAOperator{
	
	
	public GAOperatorOnePoint() {
		
		crossover = new OnePointCrossover(); 
		Mutation Mutation;
		Selection selection;
		
		
	}
	
	
	

}
