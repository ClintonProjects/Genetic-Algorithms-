package GeneticAlgorithm;

//Class Name: Couple

//Description:
//This class is for the creation of couples, 
//this is essentially 2 individuals which are combined into a single class.
//Authors(s): Clinton, Wang

public class Couple {

	public Individual Individual1;
	public Individual Individual2;

	public Couple() {
	}

	/**
	 * A couple is 2 Individuals
	 * 
	 * @param Individual, Individual
	 * @return
	 * @see
	 */
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

	/**
	 * This allows for to return a new couple that's not the same object as the
	 * original.
	 * 
	 * @param
	 * @return Couple
	 * @see
	 */
	public Couple deepCopy() {
		Couple dest = new Couple();
		dest.Individual1 = this.Individual1.deepCopy();
		dest.Individual2 = this.Individual2.deepCopy();
		return dest;

	}
}
