package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayandLinkedList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	al.add(10);
	al.add("name");
	al.add(18.6);
	System.out.println(al);
	
	Set<Object> b = new HashSet<>();
	b.add(100);
	b.add(null);
	
	System.out.println(b);	
	
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	m.put(1, "Apple");
	m.put(2, "Orange");
	m.put(3, "Banana");
	System.out.println(m);
	
	LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
	lm.put(10, 20);
	System.out.println(lm);
	
	
	int a = 10;
	lm.put(a/2, 2);
	try {
	System.out.println(lm);
	}
	catch(Exception e) {
		System.out.println("we can not divide a number by zero");
		e.printStackTrace();
	}
		
	finally {
		System.out.println("Exception check completed");
	}
		
	lm.put(20, 10+10);
	System.out.println(lm);
		
		
		
		
		
		
		
	
		

	}

}
