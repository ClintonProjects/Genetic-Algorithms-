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

//Class Name: Couple
//Description:
//This is single item in are population, as in a specific city
//Authors(s): Clinton, Wang

import Singleton.ConfigurationFile;

public class Individual  implements Serializable{
	// ConfigurationFile;

	public ArrayList<String> genes = new ArrayList<String>();

	private float fitness;

	public Individual() {
		GenesCreation<String> GC = new GenesB();
		genes = GC.createByRandomGenes();
		this.fitness = updateFitness();
		// System.out.println(this.fitness); only for test
	}

	

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

//deepCopy
//public Individual deepCopy()throws IOException, ClassNotFoundException{           
//		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();           
//		ObjectOutputStream out = new ObjectOutputStream(byteOut);           
//		out.writeObject(this);                  
//		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());           
//		ObjectInputStream in =new ObjectInputStream(byteIn);           
//		Individual dest = (Individual)in.readObject();           
//		return dest;       
//	} 
	public Individual deepCopy(){                    
		Individual dest = new Individual();      
		dest.fitness=this.fitness;
		dest.genes.clear();
		for(String code:this.genes ){	
			dest.genes.add(code);
		}
		return dest;       	
	}

	public Object getPopulation() {
		// TODO Auto-generated method stub
		return null;
	} 
   
}
