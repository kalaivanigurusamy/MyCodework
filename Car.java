package week2.day1;

public class Car {
	
	public void applybreak() {
		System.out.println("Applied break");
		
	}
	public void soundHorn() {
		System.out.println("sound Horn");
		
	}

	public static void main(String[] args) {
		Car carobj=new Car();
		carobj.applybreak();
		carobj.soundHorn();
		

	}

}
