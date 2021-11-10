package Project2Package;
//Question 4
public class Factorial {
    static int factorial(int x){
        int jelly = 1;
            if(x == 1){
                return x;
            }
            else{
                jelly = x * factorial(x-1);
            }
            
           return jelly;
            
        
    }
}
