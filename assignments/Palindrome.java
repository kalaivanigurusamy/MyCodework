package week2.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		
				int input = 121;
				
				String outputString = "";
				String inputString = Integer.toString(input);
				
				for(int i=inputString.length()-1 ; i >=0 ; i--) {
					
					outputString = outputString + inputString.charAt(i);
				}
				System.out.println(inputString);
			
				if(inputString.equals(outputString)) {
					
					System.out.println("The value "+ input +" is  palindrome");
				}
				else {
					
					System.out.println("The value "+input +" is not palindrome");
				}

	}

}