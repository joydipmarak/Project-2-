package Project2Package;
//Question 10
public class WhichMin {
	 public static void main(String args[]) {
	        System.out.println(maxMin(3, 1));
	  }
	  
	  public static int maxMin(int x, int y){
	      int result = 0;
	      result = x == y ? x : y;
	      result = x < y ? x : y;
	      result = y < x ? y : x;
	      
	      return result;
	  }
}
