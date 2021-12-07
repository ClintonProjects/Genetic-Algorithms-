package Re_constr;



import java.util.Random;


public class Individual {
	//ConfigurationFile;
	ConfigurationFile ConfigurationFile_ins =ConfigurationFile.getInstance();
	String[] genes;
	
	float fitness;//
	
	Individual() {
		
		this.genes=new String[ConfigurationFile_ins.CITY_NUM];
		createByRandomGenes();
		this.fitness=updateFitness();
		//System.out.println(this.fitness); only for test
	}
	
	void createByRandomGenes()
	{
		for(int i = 0;i < genes.length;i++)
		{
			genes[i]=Integer.toString(i+1);
		}
		
		//get random seed
		Random rand=new Random();
        //make the every position of gene ie. sequence of the city to be random
		for(int j=0;j<genes.length;j++)
		{
			int num= j + rand.nextInt(genes.length-j);
			
			//swap(genes[num],genes[j])
			String tmp=genes[num];
			genes[num]=genes[j];
			genes[j]=tmp;
		}
	}
	
	
	float updateFitness()
	{
		float totalDis=0.0f;
		for(int i = 0;i < ConfigurationFile_ins.CITY_NUM;i++)
		{
			int curCity=Integer.parseInt(this.genes[i])-1;//  the maptable of mind from 1, but in reality from 0
			int nextCity=Integer.parseInt(this.genes[(i+1) % ConfigurationFile_ins.CITY_NUM])-1;
			                                              // use i+1 %max ==0 to go back to initial 

			totalDis += ConfigurationFile_ins.disMap[curCity][nextCity];
		}
		
	
		this.fitness=totalDis;
		return this.fitness;
	}
	
	void printRate()
	{
		System.out.print("the route ：");
		for(int i=0;i<genes.length;i++)
			System.out.print(genes[i]+"->");
		System.out.print(genes[0]+"\n");
		System.out.println("the current distance：" + updateFitness());
	}
	
	
}
