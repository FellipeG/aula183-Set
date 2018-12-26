package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("HashSet"); // Have no order
		System.out.println();

		Set<String> set = new HashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("TreeSet"); // Have an order and it's specified in CompareTo or Comparator
		System.out.println();
		
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Notebook");
		set2.add("Tablet");
		
		System.out.println(set2.contains("Notebook"));
		
		set2.removeIf(x -> x.length() >= 3);
		
		for(String p : set2) {
			System.out.println(p);
		}
		
		
		System.out.println();
		System.out.println("LinkedHashSet"); // Have an order, its's the order of insertion
		System.out.println();
		
		
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Tv");
		set3.add("Notebook");
		set3.add("Tablet");
		
		System.out.println(set3.contains("Notebook"));
		
		
		set3.remove("Tablet");
		
		for(String p : set3) {
			System.out.println(p);
		}
		

	}

}
