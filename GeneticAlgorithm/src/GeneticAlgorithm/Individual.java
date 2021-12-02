package GeneticAlgorithm;

public class Individual {
	
	private String[] genes = new String[3];
	private double fitness; // distance
	
	public Individual(String[] genes, double fitness) {
		super();
		this.genes = genes;
		this.fitness = fitness;
	}

	public String[] getGenes() {
		return genes;
	}

	public void setGenes(String[] genes) {
		this.genes = genes;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
}
