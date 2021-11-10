package Project2Package;
import Project2Package.AbstractClass;
import java.util.Scanner;
//Question 18
class ImplementAbstract extends AbstractClass {
	public boolean caseCheck(String input) {
		boolean checker = false;
		int i = 0;
		while(checker = false || i < input.length()) {
		
			if(Character.isUpperCase(input.charAt(i))) {
				checker = true;
			}
		}
		return checker;
	}
	
	public String lowerToUpper(String input) {
		return input.toUpperCase();
	}
	
	public void addToString(String num) {
		System.out.println(Integer.parseInt(num));
	}
	
	
}

class SeeItHappen {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a word and press enter to check for uppercase letters");
	String inputC = input.nextLine();
	caseCheck(inputC);
	
	Scanner anotherOne = new Scanner(System.in);
	System.out.println("Enter a word and we will make all the letters uppercase.");
	String inputU= anotherOne.nextLine();
	lowerToUpper(inputU);
	
	Scanner yetAnother = new Scanner(System.in);
	System.out.println("Enter a string number.");
	String num = yetAnother.nextLine();
	
}
