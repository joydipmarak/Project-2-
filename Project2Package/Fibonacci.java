package Project2Package;
//Question 2
public class Fibonacci {
	public int fibonacciSequence(int x) {
		int y;
		if(x <= 1) {
			return x;
		}
		else {
			y = fibonacciSequence(x-1) + fibonacciSequence(x-2);
		}
		return y;
	}
	
	
}
