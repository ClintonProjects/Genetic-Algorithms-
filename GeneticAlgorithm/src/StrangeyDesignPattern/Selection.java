package StrangeyDesignPattern;

import GeneticAlgorithm.Couple;
import GeneticAlgorithm.Population;

//Class Name: Couple
//Description: This is the parent of all the selections, this is used so all methods must have x,y,z, methods in this class
//Authors(s): Clinton, Wang

public interface Selection { 
	Couple select(Population population);
}
