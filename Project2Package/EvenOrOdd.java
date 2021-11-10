package Project2Package;
//Question 6
public class EvenOrOdd {
	public static String evenSteven(int h) {
		String ans = "";
        if(h == 0){
            ans = "even";
        }
        else if(h == 1){
            ans = "odd";
        }
        else if(h > 1){
            for(int i = h; i >= 0; i -= 2){
                if(i == 0){
                    ans = "even";
                }
                else if( i == 1){
                    ans = "odd";
                }
            }
        }

        return ans;
	}
}
