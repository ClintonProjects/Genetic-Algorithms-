package StrategyPattern;

import GenerticAlgorithmB.*;
import GenerticAlgorithmA.*;
import GeneticAlgorithm.*;
import Interfaces.*;
import AbstractFactory.*;

abstract public class GAOperator {
    public FactoryProvider factoryProvider ;
    public Crossover crossover; 
    public Mutation Mutation;
    public 	Selection selection;
	

}
