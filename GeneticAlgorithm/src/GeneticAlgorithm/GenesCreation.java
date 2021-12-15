package GeneticAlgorithm;

import java.util.ArrayList;

//Class Name: GenesCreation
//Description:
//These is the Genes for our project, 
//This is a generic class as this is parent class as genes can be made up of multiple values, such as
//an Integer or a String.
//Authors(s): Clinton, Wang


public interface GenesCreation<T> {
	/**
	 * get the genes 
	 * 
	 * @param 
	 * @return T
	 * @see
	 */
	ArrayList<T> getGenes();
	
	/**
	 * Create the gense by random
	 * 
	 * @param 
	 * @return T
	 * @see
	 */
	ArrayList<T> createByRandomGenes();

}
