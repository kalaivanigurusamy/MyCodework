package week4.day2;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		
		List<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(3);
		lst1.add(2);
		lst1.add(11);
		lst1.add(4);
		lst1.add(6);
		lst1.add(7);
		System.out.println(lst1);
		Collections.sort(lst1);
		System.out.println("Sorted array is "+lst1);
		System.out.println("The second largest num is: "+lst1.get(4));
		
		
		

	}

}