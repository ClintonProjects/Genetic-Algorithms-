package DesignPatterns;

public class Singleton {

	private static Singleton instance;

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
