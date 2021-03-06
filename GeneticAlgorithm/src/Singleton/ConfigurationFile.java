package Singleton;

//Class Name: Couple

//Description:
//This file is mainly used for configurating the static (as in always the same no static in java terms)
//items throughout are project that will always be the same, sort of like the settings
//Authors(s): Clinton, Wang

public class ConfigurationFile {

	public final int SPECIES_NUM = 100;
	public final int DEVELOP_NUM = 1000;// 1000
	// public final float pcl = 0.6f;
	public final float pcl = 0.0f;

	public final float pch = 0.95f;
	// public final float pm = 0.4f;
	public final float pm = 0.99f;

	int[][] cityPosition = { { 60, 200 }, { 180, 200 }, { 80, 180 }, { 140, 180 }, { 20, 160 }, { 100, 160 }, { 200, 160 }, { 140, 140 }, { 40, 120 },
			{ 100, 120 }, { 180, 100 }, { 60, 80 }, { 120, 80 }, { 180, 60 }, { 20, 40 }, { 100, 40 }, { 200, 40 }, { 20, 20 }, { 60, 20 },
			{ 160, 20 } };// 20 best: 870）

	public int CITY_NUM = cityPosition.length;
	public float[][] disMap = new float[CITY_NUM][CITY_NUM];

	public ConfigurationFile() {
		// canculate the distance between every two city , get a CITY_NUM*CITY_NUM table
		for (int i = 0; i < CITY_NUM; i++) {
			for (int j = i; j < CITY_NUM; j++) { // sqrt of (x1-x2)^2+(y1-y2)^2
				float dis = (float) Math
						.sqrt(Math.pow((cityPosition[i][0] - cityPosition[j][0]), 2) + Math.pow((cityPosition[i][1] - cityPosition[j][1]), 2));
				// here is symmetry by the diagonal
				this.disMap[i][j] = dis;
				this.disMap[j][i] = disMap[i][j];
			}
		}
	}

	private static volatile ConfigurationFile instance;

	/**
	 * A singleton is a design pattern that is restricted to be initialized once,
	 * this means it can only be one of these objects in the runtime environment.
	 * This is mainly used for items such as databases or items which can only be
	 * called one. In our example below we used double-check locking for
	 * configuration as we only need one instance of it. This is because we use
	 * synchronized which will only one thread to be run and wait on till this
	 * thread task is done before handling another task from this method.
	 * 
	 * @param
	 * @return T
	 * @see
	 */
	public static ConfigurationFile getInstance() {
		if (instance == null) {
			synchronized (ConfigurationFile.class) {
				if (instance == null) {
					instance = new ConfigurationFile();
				}
				return instance;
			}
		}
		return instance;
	}

}
