package GeneticAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Singleton.ConfigurationFile;
import Singleton.Singleton;

public class Individual {
	// ConfigurationFile;
	ConfigurationFile ConfigurationFile_ins = Singleton.getInstance();
	public ArrayList<String> genes = new ArrayList<String>();

	float fitness;//

	public Individual() {
		createByRandomGenes();
		this.fitness = updateFitness();
		// System.out.println(this.fitness); only for test
	}

	void createByRandomGenes() {
		for (int i = 0; i < ConfigurationFile_ins.CITY_NUM; i++) 
			genes.add(String.valueOf(i));

		ArrayList<String> result = new ArrayList<String>();
		for (int j = 0; j < ConfigurationFile_ins.CITY_NUM; j++) {
			int num = Math.abs(new Random().nextInt(genes.size()));
			result.add(genes.get(num));
			genes.remove(num);
		}
		
		genes.clear();
		genes.addAll(result);
	}

	float updateFitness() {
		float totalDis = 0.0f;
		for (int i = 0; i < ConfigurationFile_ins.CITY_NUM; i++) {
			int curCity = Integer.parseInt(this.genes.get(i));// the maptable of mind from 1, but in reality from 0
			int nextCity = Integer.parseInt(this.genes.get((i + 1) % ConfigurationFile_ins.CITY_NUM));
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

	public ArrayList<String> getGenes() {
		return genes;
	}

	public void setGenes(ArrayList<String> genes) {
		this.genes = genes;
	}

	
	
	
}
