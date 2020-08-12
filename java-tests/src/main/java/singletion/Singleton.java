package singletion;


public class Singleton {
  private static Singleton instance = null;
	private Singleton() {
		if(instance != null) {
			  throw new RuntimeException("Instance already created");
		}
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}
