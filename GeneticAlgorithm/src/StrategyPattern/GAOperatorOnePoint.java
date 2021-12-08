package StrategyPattern;


import GenerticAlgorithmB.*;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProvider;
import GenerticAlgorithmA.*;
import GeneticAlgorithm.*;
import Interfaces.*;

public class GAOperatorOnePoint extends GAOperator{
	
	
	public GAOperatorOnePoint() {
		
		AbstractFactory onePoint =  new FactoryProvider().getFactory("A");

		crossover = onePoint.getCrossover(); 
		Mutation Mutation = onePoint.getMutation();
		Selection se=onePoint.getSelection();
		
		
	}
	
	
	

}
