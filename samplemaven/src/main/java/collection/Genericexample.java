package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Genericexample {


	
	public static void main(String[] args) {
		List<String> S1=new ArrayList<String>();
		S1.add("Apple");// to add each item to the list
		S1.add("Orange");
		S1.add("Banana");
		S1.add("Kiwi");
		
		System.out.println(S1);//to print the whole list
		System.out.println(S1.get(1));//to get the value stored in the first position
		S1.set(1, "Grapes");//to replace element in the 1st position
		System.out.println(S1);
		System.out.println(S1.indexOf("Grapes"));//to get the First position of the element
		System.out.println(S1.get(1));
		S1.add("Grapes");
		System.out.println(S1);
		System.out.println(S1.lastIndexOf("Grapes"));//to get the last position of the element
		S1.remove(1);
		System.out.println(S1);
		System.out.println(S1.contains("Grapes"));
		System.out.println(S1.isEmpty());
		System.out.println(S1.size());
		
	}

}
