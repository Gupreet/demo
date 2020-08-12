package searlization;

import java.io.Serializable;

public class Dog implements Serializable{
	int i =10;
	transient int j=20;
	transient static int k=30;
	transient final int l=30;
}
