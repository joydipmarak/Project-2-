package Project2Package;
import java.util.ArrayList;

// Question 9
public class ArrayPrime {
	public static void main(String args[]) {
        prime();
    };
    
    public static void prime(){
       
        ArrayList primeList = new ArrayList();
        
        for(int i = 100; i > 0; i--){
            
              int counter = 0;
            for(int k = 1; k < 100 ; k++ ){
                int s = i % k;
                if(s == 0){
                    counter++;
                }
            };
            if(counter == 2){
                    primeList.add(i);
                };
        };
        
        for(int j = 0; j < primeList.size(); j++){
            System.out.println(primeList.get(j));
        };
    }
}
