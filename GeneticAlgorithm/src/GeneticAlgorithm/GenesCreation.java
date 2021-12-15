package GeneticAlgorithm;

import java.util.ArrayList;

public interface GenesCreation<T> {
	//This is parent generic class for genes, as genes could be of multiple types of veribles 
	ArrayList<T> getGenes();
	ArrayList<T> createByRandomGenes();

}
