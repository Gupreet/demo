package searlization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("D:\\testdata\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("D:\\testdata\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d2.i+" \ntransient :"+d2.j+" \ntransient static :"+d2.k+" \ntransient final :"+d2.l);		
	}
	
}
