package Genes;

import java.util.ArrayList;
import java.util.Random;

import Singleton.ConfigurationFileSingleton;

public class GenesB implements GenesCreation {

	public ArrayList<String> genes = new ArrayList<String>();

	@Override
	public ArrayList<?> createByRandomGenes() {
		for (int i = 0; i < ConfigurationFileSingleton.getInstance().CITY_NUM; i++)
			genes.add(String.valueOf(i));

		ArrayList<String> result = new ArrayList<String>();
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
