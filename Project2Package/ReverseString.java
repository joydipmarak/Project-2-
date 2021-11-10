package Project2Package;
//Question 3 
public class ReverseString {
	public String reverse(String x) {
		char[] arr;
		String y = " ";
		
		for(int i = 0; i < x.length(); ++i) {
			arr[i] = x.charAt(i);
			
		}
		
		for(int j = x.length()-1; j >= 0; j--) {
			y += arr[j];
		}
		return y
	}
}
