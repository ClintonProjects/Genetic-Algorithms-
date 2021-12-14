package Runner;

import java.io.IOException;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProvider;
import GenerticAlgorithmA.TourmentSelection;
import GenerticAlgorithmA.TwoPointCrossover;
import GenerticAlgorithmOnePoint.OnePointCrossover;
import GenerticAlgorithmOnePoint.OnePointMutation;
import GeneticAlgorithm.*;
import GeneticAlgorithm.Individual;
//import Re_constr.onePointCrossover;
import GeneticAlgorithm.Population;
import StrategyPattern.*;

public class test {

	public static void main(String... args) throws ClassNotFoundException, IOException {
		
//		Individual ind1= new Individual();
//		Individual ind2= new Individual();
//
////		ind1.printRate();
////		ind2.printRate();
//		
//		Couple cou=new Couple(ind1,ind2);
//	    cou.Individual1.printRate();
//	    cou.Individual2.printRate();
//	    
//	    Couple cou1=cou.deepCopy();
//	
//	    cou.Individual1.genes.set(0, "11");
//	      cou.Individual1.printRate();  
//	    cou1.Individual1.printRate();
//	    cou1.Individual2.printRate();
//	    
	    
	    
//		Couple cou=new Couple(ind1,ind2);
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

	//	
		//ind1.getGenes().forEach(i -> System.out.println(i));
	//	System.out.println(new TourmentSelection().selection(new Population()).size());
		
		
		
		
//		Individual ind1 = new Individual();
//		Individual ind2 = new Individual();
//		Couple cou1 = new Couple(ind1, ind2);
//	//	cou1.Individual1.printRate();
//	//	cou1.Individual2.printRate();
//		
//		
//		TwoPointCrossover cros1 = new TwoPointCrossover();
//		Couple newcouple=cros1.doCross(cou1);
//		cou1.Individual1.printRate();
//		cou1.Individual2.printRate();
//		
//		newcouple.Individual1.printRate();
//		newcouple.Individual2.printRate();
		
		
//		Individual ind1 = new Individual();
//		OnePointMutation mu1=new OnePointMutation();
//		Individual ind2=mu1.mutate(ind1);
//		ind1.printRate();
//		ind2.printRate();
		
		OnePointMutation mu1=new OnePointMutation();
		Individual ind1 = new Individual();
		Individual ind2 = new Individual();
		Couple cou0=new Couple(ind1,ind2);      
		cou0.Individual1.printRate();
        cou0.Individual2.printRate();
		Couple cou1=mu1.mutate(cou0);

	
        cou1.Individual1.printRate();
        cou1.Individual2.printRate();

	}

}
