package Project2Package;
//Question 5
public class MiniString {
	   static String smallString(int y, String d){
	        String lastThing= "";
	     
	        
	        for(int i = 0; i <= y; i++){
	            lastThing = lastThing + d.charAt(i);
	        }
	        return lastThing;
	    }
}
