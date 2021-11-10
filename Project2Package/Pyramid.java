package Project2Package;
import java.util.ArrayList;
//Question 13
public class Pyramid {
	public static void main(String args[]) {
        pyramidBinary();
    }
    
    public static void pyramidBinary(){
        //ArrayList<Integer> arr = new ArrayList();
        //int[] arr = [];
        int row = 0;
        int col = 1;
        int num = 1;
        
        while(row <= 3){
            ArrayList<Integer> arr = new ArrayList();
            for(int i = 0; i < col; i++){
                if(num == 1){
                    num--;
                }
                else if(num == 0){
                    num++;
                };
                arr.add(num);
            }
            System.out.println(arr);
            col++;
            row++;
        }
    }
}
