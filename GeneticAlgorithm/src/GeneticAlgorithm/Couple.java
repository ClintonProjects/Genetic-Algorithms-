package GeneticAlgorithm;



public class Couple {

	//A couple is 2 Individuals
	public Individual Individual1;
	public Individual Individual2;

	public Couple(Individual parent1, Individual parent2) {
		this.Individual1 = parent1;
		this.Individual2 = parent2;
	}

	public Individual getIndividual1() {
		return Individual1;
	}

	public void setIndividual1(Individual individual1) {
		Individual1 = individual1;
	}

	public Individual getIndividual2() {
		return Individual2;
	}

	public void setIndividual2(Individual individual2) {
		Individual2 = individual2;
	}
}

