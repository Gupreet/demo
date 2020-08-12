package singletion;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {

	public static void main(String[] args) throws NoSuchMethodException,SecurityException,InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton objOne = Singleton.getInstance();
		Singleton objTwo = null;
		
	    Constructor<Singleton> cons = Singleton.class.getDeclaredConstructor();
		cons.setAccessible(true);
		
		objTwo = (Singleton)cons.newInstance();
		
		System.out.println(objOne.equals(objTwo)+" | "+objOne+" | "+objTwo);
	}
}
