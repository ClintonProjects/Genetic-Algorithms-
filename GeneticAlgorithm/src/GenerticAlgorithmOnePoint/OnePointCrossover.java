package GenerticAlgorithmOnePoint;

import java.util.Random;

import GeneticAlgorithm.Couple;
import Singleton.ConfigurationFile;
import Singleton.ConfigurationFileSingleton;
import StrategyPattern.Crossover;

public class OnePointCrossover implements Crossover {

	ConfigurationFile ConfigurationFile_ins = ConfigurationFileSingleton.getInstance();

	@Override
	public Couple doCross(Couple couple) {
		float rate = (float) Math.random();
		Random rand = new Random();
		
		Couple newCouple= couple.deepCopy();
		
		//System.out.println("perpare cross");
		
		if (rate > ConfigurationFile_ins.pcl && rate < ConfigurationFile_ins.pch) {
			
			int begin = rand.nextInt(ConfigurationFile_ins.CITY_NUM);
			
			//System.out.println("begin cross");
		//	System.out.println("firstPoint is :"+begin);
			for (int i = begin; i < ConfigurationFile_ins.CITY_NUM; i++) {
				// find the position "fir, "where
				// newCouple.Individual1.genes[fir]=newCouple.Individual2.genes[i]
				// find the position "sec, "where
				// newCouple.Individual2.genes[sec]=newCouple.Individual1.genes[i]

				int fir, sec;
				for (fir = 0; !newCouple.Individual1.genes.get(fir).equals(newCouple.Individual2.genes.get(i)); fir++)
					;
				for (sec = 0; !newCouple.Individual2.genes.get(sec).equals(newCouple.Individual1.genes.get(i)); sec++)
					;
				// swap
				String tmp;
				tmp = newCouple.Individual1.genes.get(i);
				newCouple.Individual1.genes.set(i, newCouple.Individual2.genes.get(i));
				newCouple.Individual2.genes.set(i, tmp);

				// eliminate the repeat city
				newCouple.Individual1.genes.set(fir, newCouple.Individual2.genes.get(i));
				newCouple.Individual2.genes.set(sec, newCouple.Individual1.genes.get(i));
			}
		}

		return newCouple;

	}

}
