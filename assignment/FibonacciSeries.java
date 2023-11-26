package home.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count = 8, t1 = 0, t2 = 1;
		System.out.print(t1+" "+t2);

	    for (int i = 2; i < count; i++) {
	    	 int t3 = t1 + t2;
	      System.out.print(" " +t3);

	     
	      t1 = t2;
	      t2 = t3;
	    }
	  }
	}