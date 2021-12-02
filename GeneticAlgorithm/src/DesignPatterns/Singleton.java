package DesignPatterns;

public class Singleton {
	//push
	private static volatile Singleton instance;

	public Singleton getInstance() {
		if (instance == null) {
			synchronized (this) {
				if (instance == null) {
					instance = new Singleton();
				}
				return instance;
			}
		}
		return instance;
	}
}
