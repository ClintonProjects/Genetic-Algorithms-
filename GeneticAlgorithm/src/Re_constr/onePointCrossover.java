package Re_constr;

import java.util.Random;

import GeneticAlgorithm.Couple;
import Singleton.ConfigurationFile;
import Singleton.Singleton;

public class onePointCrossover {

	ConfigurationFile ConfigurationFile_ins = Singleton.getInstance();

	public onePointCrossover() {

	}

	public void doCross(Couple couple) {
		float rate = (float) Math.random();
		Random rand = new Random();
		System.out.println("perpare cross");
		if (rate > ConfigurationFile_ins.pcl && rate < ConfigurationFile_ins.pch) {
			int begin = rand.nextInt(ConfigurationFile_ins.CITY_NUM);
			System.out.println("begin cross");
			for (int i = 5; i < ConfigurationFile_ins.CITY_NUM; i++) {
				// find the position "fir, "where
				// couple.Individual1.genes[fir]=couple.Individual2.genes[i]
				// find the position "sec, "where
				// couple.Individual2.genes[sec]=couple.Individual1.genes[i]

				int fir, sec;
				for (fir = 0; !couple.Individual2.genes.get(fir).equals(couple.Individual2.genes.get(i)); fir++)
					;
				for (sec = 0; !couple.Individual2.genes.get(sec).equals(couple.Individual2.genes.get(i)); sec++)
					;
				// swap
				String tmp;
				tmp = couple.Individual1.genes.get(i);
				couple.Individual1.genes.set(i, couple.Individual2.genes.get(i));
				couple.Individual2.genes.set(i, tmp);

				// eliminate the repeat city
				couple.Individual1.genes.set(fir, couple.Individual2.genes.get(i));
				couple.Individual2.genes.set(sec, couple.Individual2.genes.get(i));
			}
		}

	}

}
