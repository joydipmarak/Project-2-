package Project2Package;
import java.util.Scanner;
public class AdditionApp {
	public static void main(String args[]) {
		System.out.println(additionTool());
	}	
	public static int additionTool(){
	    Scanner scanner = new Scanner(System.in);
	    int c = 0;
	    try{
	    System.out.println("Please enter first number");
	    
	    int a = scanner.nextInt();
	    
	    System.out.println("Please enter second number");
	    int b = scanner.nextInt();
	    
	    c = a + b;
	    } 
	    catch(Exception e){
	        System.out.println("Come on bruh... Stop Playing!");
	    }
	    return c;
	    
	}
}

    
