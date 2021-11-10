package Project2Package;
import java.util.ArrayList;
//Question 12
public class EnhancedLoop {
	 public static void main(String args[]) {
	        loopy();
	    }
	    
	    public static void loopy(){
	        ArrayList<Integer> arr = new ArrayList();
	        for(int i = 0; i <= 100; i++){
	            arr.add(i);
	        };
	        
	        for(int x: arr){
	            if(x%2 == 0){
	                System.out.println(x);
	            };
	        };
	    }
	}

