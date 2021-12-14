package Genes;

import java.util.ArrayList;
import java.util.Random;

import Singleton.ConfigurationFileSingleton;

public class GenesA implements GenesCreation {

		public ArrayList<Integer> genes = new ArrayList<Integer>();

		@Override
		public ArrayList<?> createByRandomGenes() {
			for (int i = 0; i < ConfigurationFileSingleton.getInstance().CITY_NUM; i++)
				genes.add(i);

			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int j = 0; j < ConfigurationFileSingleton.getInstance().CITY_NUM; j++) {
				int num = Math.abs(new Random().nextInt(genes.size()));
				result.add(genes.get(num));
				genes.remove(num);
			}
			
			genes.clear();
			genes.addAll(result);
			return genes;
		}

		@Override
		public ArrayList<?> getGenes() {
			return genes;
		}

}
