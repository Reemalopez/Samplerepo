package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericexample {

	public static void main(String[] args) {
		List S1=new ArrayList<>();
		S1.add("Jane");// to add each item to the list
		S1.add(1234);
		S1.add('A');
		S1.add(true);
		System.out.println(S1);
		
	}

}
