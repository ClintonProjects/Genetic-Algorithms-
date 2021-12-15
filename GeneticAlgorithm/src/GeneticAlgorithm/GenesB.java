package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.Random;

//Class Name: GenesB
//Description:
//This is the Genes for an String. This is implementing a generic class.
//We do this by filling the genes with variables that are randomly generated.
//Authors(s): Clinton, Wang

import Singleton.ConfigurationFile;

public class GenesB implements GenesCreation<String> {

	public ArrayList<String> genes = new ArrayList<String>();

	@Override
	public ArrayList<String> createByRandomGenes() {
		for (int i = 0; i < ConfigurationFile.getInstance().CITY_NUM; i++)
			genes.add(String.valueOf(i));

		ArrayList<String> result = new ArrayList<String>();
		for (int j = 0; j < ConfigurationFile.getInstance().CITY_NUM; j++) {
			int num = Math.abs(new Random().nextInt(genes.size()));
			result.add(genes.get(num));
			genes.remove(num);
		}
		
		genes.clear();
		genes.addAll(result);
		return genes;
	}

	@Override
	public ArrayList<String> getGenes() {
		return genes;
	}

}
