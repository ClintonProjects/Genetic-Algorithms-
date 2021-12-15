package GeneticAlgorithm;

import java.util.ArrayList;

//Class Name: GenesCreation
//Description:
//These is the Genes for our project, 
//This is a generic class as this is parent class as genes can be made up of multiple values, such as
//an Integer or a String.
//Authors(s): Clinton, Wang


public interface GenesCreation<T> {
	//This is parent generic class for genes, as genes could be of multiple types of veribles,
	//as an id for a var 
	ArrayList<T> getGenes();
	ArrayList<T> createByRandomGenes();

}
