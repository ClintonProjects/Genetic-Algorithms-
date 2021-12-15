package StrangeyDesignPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Population;

//Class Name: Selection
//Description:
//This is the interface associated with the StatngeyDesignPattern
//Authors(s): Clinton, Wang

public interface Selection { 
	Couple select(Population population);
}
