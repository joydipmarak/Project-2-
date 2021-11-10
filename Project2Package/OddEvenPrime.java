package Project2Package;
import java.util.*;
//Question 19
public class OddEvenPrime {
	ArrayList<Integer> num = new ArrayList<Integer>();
	
	for(int i= 0; i <= 10; i++) {
		num.add(i);
	};
	
	int evenSum = 0;
	int oddSum = 0;
	
	for(int j = 0; j < num.size(); j++) {
		 if(num.get(j) > 1){
            for(int i = num.get(j); i >= 0; i -= 2){
                if(i == 0){
                    evenSum += num.get(j);
                }
                
                else if( i == 1) {
                	oddSum += num.get(j);
            }
        }
	};
	
	System.out.println(evenSum);
	
	
    for(int i = num.size() - 1; i > 0; i--){
        
        int counter = 0;
      for(int k = 1; k < num.size()-1 ; k++ ){
          int s = i % k;
          if(s == 0){
              counter++;
          }
      };
      if(counter == 2){
              num.remove(i);
          };
  };
  
  for(int j = 0; j < num.size(); j++){
      System.out.println(num.get(j));
  };
  
	
}
}
