package GeneticAlgorithm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Individual is a single member of our population. so in are case it's a city,
 * A city is constructed with genes and fitness, fitness being it's distance from the point.
 * genes being random string which are used to identify a single city in are example.
 */
import Singleton.ConfigurationFile;

public class Individual  implements Serializable{

	public ArrayList<String> genes = new ArrayList<String>();

	private float fitness;

	
	/**
	* Individual no-args constructor
	* @param 
	* @param  
	* @return   
	* @see   
	*/
	public Individual() {
		GenesCreation<String> GC = new GenesB();
		genes = GC.createByRandomGenes();
		this.fitness = updateFitness();
		// System.out.println(this.fitness); only for test
	}

	
	/**
	* sets a fitness to each Indivual in are population 
	* @param 
	* @param  
	* @return   
	* @see   
	*/
	float updateFitness() {
		float totalDis = 0.0f;
		for (int i = 0; i < ConfigurationFile.getInstance().CITY_NUM; i++) {
			int curCity = Integer.parseInt(this.genes.get(i));// the maptable of mind from 1, but in reality from 0
			int nextCity = Integer.parseInt(this.genes.get((i + 1) % ConfigurationFile.getInstance().CITY_NUM));
			// use i+1 %max ==0 to go back to initial
			totalDis += ConfigurationFile.getInstance().disMap[curCity][nextCity];
		}
		this.fitness = totalDis;
		return this.fitness;
	}

	
	/**
	* Print route, and current distance.
	* @param 
	* @param  
	* @return   
	* @see   
	*/
	public void printRate() {
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

	public float getFitness() {
		
		return updateFitness();
	}

   public void setFitness(float dis) {
		
		this.fitness=dis;
	}

	/**
	* Copies the Individual Object
	* 
	* @param 
	* @param  
	* @return Individual
	* @see   
	*/
	public Individual deepCopy(){                    
		Individual dest = new Individual();      
		dest.fitness=this.fitness;
		dest.genes.clear();
		for(String code:this.genes ){	
			dest.genes.add(code);
		}
		return dest;       	
	}


   
}
