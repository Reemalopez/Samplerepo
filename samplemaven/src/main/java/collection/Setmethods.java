package collection;

import java.util.HashSet;
import java.util.Set;

public class Setmethods {

	public static void main(String[] args) {
		Set<String>S1=new HashSet<String>();
		S1.add("Black");
		S1.add("White");
		S1.add("Grey");
		Set<String>S2=new HashSet<String>();
		S2.add("Red");
		S2.add("Green");
		S2.add("Blue");
		System.out.println(S1);
		System.out.println(S2);
		S1.addAll(S2);
		System.out.println(S1);
		System.out.println(S1.contains("Purple"));
		System.out.println(S1.containsAll(S2));
		System.out.println(S2.containsAll(S1));
		System.out.println(S1.remove("Black"));
		System.out.println(S1.removeAll(S1));
		System.out.println(S1.isEmpty());
		
	
		

	}

}
