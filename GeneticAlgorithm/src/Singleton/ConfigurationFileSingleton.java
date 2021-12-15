package Singleton;

public class ConfigurationFileSingleton {
	// push
	private static volatile ConfigurationFile instance;

	//Double locking singleton to prevent thread issues.
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
