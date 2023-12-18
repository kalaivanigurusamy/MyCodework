package week4.day2;

import java.util.*;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> lst1 = new ArrayList<Integer>();
		List<Integer> lst2 = new ArrayList<Integer>(); 
		lst1.add(3);
		lst1.add(2);
		lst1.add(11);
		lst1.add(6);
		lst1.add(7);
		System.out.println(lst1);
		lst2.add(1);
		lst2.add(2);
		lst2.add(8);
		lst2.add(4);
		lst2.add(9);
		lst2.add(7);
		System.out.println(lst2);
		lst1.retainAll(lst2);
		System.out.println( lst2);

	}

}