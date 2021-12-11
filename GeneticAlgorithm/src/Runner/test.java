package Runner;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProvider;
import GenerticAlgorithmA.TourmentSelection;
import GeneticAlgorithm.*;
import GeneticAlgorithm.Individual;
//import Re_constr.onePointCrossover;
import GeneticAlgorithm.Population;
import Singleton.ConfigurationFile;
import StrategyPattern.*;

public class test {

	public static void main(String... args) {
		
		AbstractFactory onePointFactory =  new FactoryProvider().getFactory("A");
	    Crossover crossover; 
	    Mutation Mutation;
	    Selection selection;
		
		crossover = onePointFactory.getCrossover(); 
		Mutation mutation = onePointFactory.getMutation();
		Selection se=onePointFactory.getSelection();
		
		ConfigurationFile ConfigurationFile_ins = ConfigurationFile.getInstance();
		
		int DEVELOP_NUM=ConfigurationFile_ins.DEVELOP_NUM;
		
		Individual bestIndividualofAll =new Individual();
	
		GAcontroller onePoint=new GAcontroller();
		onePoint.setSelection("Tournament");
//		
//		//get Population
//		Population p1=new Population();
//		// get Operator
//		GAOperatorOnePoint GaOperatorOnePoint =new GAOperatorOnePoint();
//		GaOperatorOnePoint.se
//	// Start 	
//	while( DEVELOP_NUM < 0){
//
//	
//		Couple parent = GaOperatorOnePoint.selection.selection(p1);
//		
//		Individual child =GaOperatorOnePoint.crossover.crossover(parent);
//		
//		Individual newChild=GaOperatorOnePoint.Mutation.Mutation(child);
//		
//	
//		// do a replace or just add to p1; 
//		
//		
//		DEVELOP_NUM--;
//		
//		//Individual bestOfthisgeiration = getBest(p1);
//	//	if(bestIndividualofall.getFitness()<)
//			
//		
//		}
		
	//bestIndividualofall.print.
	
		
		
		
	//	GaOperatorOnePoint.Mutation.Mutation(null);
		
		
//		ArrayList<Integer> TouramentSelection = new TourmentSelection().TouramentSelection();
//		TouramentSelection.forEach(i -> System.out.println(i));

		/*
		 * ////test for ConfigurationFile ConfigurationFile
		 * f1=ConfigurationFile.getInstance();
		 * 
		 * System.out.println(f1.DEVELOP_NUM);
		 * 
		 * 
		 * System.out.println(f1.disMap[0][1]); System.out.println(f1.disMap[0][1]);
		 */

		// test for individual
		// Individual ind1= new Individual();
		// System.out.println(ind1.fitness);
		// ind1.printRate();
		// ----------

		// test for population
//		Individual ind1= new Individual();
//	    System.out.println(ind1.fitness);
//	    ind1.printRate();
//		Population p1= new Population();
//		p1.add(ind1, 0);
//        for(int i=0;i<19;i++)
//		   {System.out.println(p1.population[i].fitness);
//        p1.population[i].printRate();
//		   }

	//	Individual ind1 = new Individual();
		//ind1.getGenes().forEach(i -> System.out.println(i));
	//	System.out.println(new TourmentSelection().selection(new Population()).size());
		
		
		
		
		
//		ind1.printRate();
//		Individual ind2 = new Individual();
//		Couple cou1 = new Couple(ind1, ind2);
//		cou1.Individual1.printRate();
//		cou1.Individual2.printRate();
//		onePointCrossover cros1 = new onePointCrossover();
//		cros1.doCross(cou1);
//		cou1.Individual1.printRate();
//		cou1.Individual2.printRate();

	}

}
