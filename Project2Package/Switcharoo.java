package Project2Package;
import java.util.Scanner;
import java.util.*;
//Question 14
public class Switcharoo {
	
	
	    public static void main(String args[]) {
	    	switching();
	    }
	    
	    public static void switching() {
	    	Scanner x = new Scanner(System.in);    
	        System.out.println("What feature do you want to access?");
	        
	        String func = x.nextLine();
	        
	        switch(func){
	            case "square root":
	                Scanner y = new Scanner(System.in);
	                System.out.println("Please enter the number.");
	                
	                double num = y.nextInt();
	                
	                num = Math.sqrt(num);
	                System.out.println(num);
	                break;
	            case "Date" :
	            	Date date=java.util.Calendar.getInstance().getTime();
	            	System.out.println(date);
	            	break;
	            	
	            case "Split":
	            	String some = "I am learning Core Java";
	            	String [] parts = some.split("//s");
	            	
	            	for(String s: parts) 
	            		System.out.println(s);
	            	break;
	            	
	            	default:
	            		System.out.println("Function not available.");
	            		break;
	            	
	                
	            
	        }
	}
}
