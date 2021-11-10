package Project2Package;
// Question 1
public class BubbleSort {
	public int[] bubble(){
	int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
	int sub = 0;
	 
	 for(int i = 0; i < arr.length; ++i) {
		 for(int j = i+1; j < arr.length; ++j) {
			 if(arr[i] > arr[j]) {
				 sub = arr[i];
				 arr[i] = arr[j];
				 arr[j] = sub;
			 }
			
		 }
		 
	 }
	
	 return  arr;
	 
	}
	
	 
}


