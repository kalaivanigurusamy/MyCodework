package week2.day1;

public class Mobile {
	
	public void makecall() {
		String mobilemodel="Samsung";
		float mobileweight=2.3f;
		System.out.println("This is my mobile");
		System.out.println("Mobile model is :" +mobilemodel + " and weight is :" +mobileweight);
		
		
	}
	
	public void sendmsg() {
		boolean IsFullCharged=true;
		int mobilecost=15000;
		System.out.println("Is mobile fully charged:" +IsFullCharged + " and mobile cost is :" +mobilecost);
		
	}

	public static void main(String[] args) {
		Mobile Mob=new Mobile();
		Mob.makecall();
		Mob.sendmsg();
		

	}

}
