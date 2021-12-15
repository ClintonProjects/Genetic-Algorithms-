package GeneticAlgorithm;

//Class Name: GenesB
//Description:
//This is the Genes for an Integer. This is implementing a generic class.
//We do this by filling the genes with variables that are randomly generated.
//Authors(s): Clinton, Wang


import java.util.ArrayList;
import java.util.Random;

import Singleton.ConfigurationFile;

public class GenesA implements GenesCreation<Integer> {

		public ArrayList<Integer> genes = new ArrayList<Integer>();

		@Override
		public ArrayList<Integer> createByRandomGenes() {
			for (int i = 0; i < ConfigurationFile.getInstance().CITY_NUM; i++)
				genes.add(i);

			ArrayList<Integer> result = new ArrayList<Integer>();
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
		public ArrayList<Integer> getGenes() {
			return genes;
		}

}
