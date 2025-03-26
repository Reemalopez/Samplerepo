package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorexmple {

	public static void main(String[] args) {
		
		List<String> S1=new ArrayList<String>();
		S1.add("Apple");
		S1.add("Orange");
		S1.add("Banana");
		S1.add("Kiwi");
		System.out.println(S1);
		Iterator i1=S1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		i1.remove();
		System.out.println(S1);

	}

}
