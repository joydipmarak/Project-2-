package Project2Package;
import java.util.ArrayList;

//Question 8

public class ArrayListPalindrome {
	 public static void main(String args[]) {

	      palindrome();
	      

	    }
	    
	    public  static void palindrome(){
	        String[] input = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
	      String[] input2 = {};
	      ArrayList arr = new ArrayList<String>();
	      ArrayList arrP = new ArrayList<String>();
	      
	      for(int i = 0; i < input.length; i++){
	          arr.add(input[i]);
	      }
	      
	      for(int j = 0; j < input.length; j++){
	          String carry = "";
	          int k= 0;
	          while(k < input[j].length() && input[j].charAt(k) == input[j].charAt(input[j].length()-1-k)){
	         
	              
	                  carry = carry + input[j].charAt(k);
	              
	              
	              k++;
	          }
	          arrP.add(carry);
	      }
	      
	      for(int d=0; d <  arrP.size(); d++){
	          System.out.println(arrP.get(d));
	      }
	      
	      for(int c = 0; c < arr.size();c++) {
	    	  System.out.println(arr.get(c));
	      }
	    }
}
