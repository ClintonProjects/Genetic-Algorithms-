package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Singleton.ConfigurationFile;
import Singleton.Singleton;

public class Individual {
	// ConfigurationFile;
	ConfigurationFile ConfigurationFile_ins = Singleton.getInstance();
	ArrayList<String> genes = new ArrayList<String>();

	float fitness;//

	public Individual() {
		genes = (ArrayList<String>) Arrays.asList(new String[ConfigurationFile_ins.CITY_NUM]);
		createByRandomGenes();
		this.fitness = updateFitness();
		// System.out.println(this.fitness); only for test
	}

	void createByRandomGenes() {
		for (int i = 0; i < genes.size(); i++) {
			genes.add(Integer.toString(i + 1));
		}

		// get random seed
		Random rand = new Random();
		// make the every position of gene ie. sequence of the city to be random
		for (int j = 0; j < genes.size(); j++) {
			int num = j + rand.nextInt(genes.size() - j);

			// swap(genes[num],genes[j])
			String tmp = genes.get(num);
			genes.set(num, genes.get(j));
			genes.set(j, tmp);
		}
	}

	float updateFitness() {
		float totalDis = 0.0f;
		for (int i = 0; i < ConfigurationFile_ins.CITY_NUM; i++) {
			int curCity = Integer.parseInt(this.genes.get(i)) - 1;// the maptable of mind from 1, but in reality from 0
			int nextCity = Integer.parseInt(this.genes.get((i + 1) % ConfigurationFile_ins.CITY_NUM)) - 1;
			// use i+1 %max ==0 to go back to initial

			totalDis += ConfigurationFile_ins.disMap[curCity][nextCity];
		}

		this.fitness = totalDis;
		return this.fitness;
	}

	void printRate() {
		System.out.print("the route ：");
		for (int i = 0; i < genes.size(); i++)
			System.out.print(genes.get(i) + "->");
		System.out.print(genes.get(0) + "\n");
		System.out.println("the current distance：" + updateFitness());
	}

}
