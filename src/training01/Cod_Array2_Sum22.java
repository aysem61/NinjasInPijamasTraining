package training01;

public class Cod_Array2_Sum22 {

	public static void main(String[] args) {
		/*
		 * 
		 * Given an array of ints, return true if the sum of all the 2's in the array is
		 * exactly 8.
		 * 
		 * 
		 * sum28([2, 3, 2, 2, 4, 2]) → true sum28([2, 3, 2, 2, 4, 2, 2]) → false
		 * sum28([1, 2, 3, 4]) → false
		 */
		
		
		
	}
	public static boolean  arrays(int[] sum) {
		
		int top=0;
		int count=0;
		
		for(int i=0; i<sum.length; i++) {
			
			if(sum[i]==2 ) {
				count++;
			}
			
		}
		
		if(count==4) {
			return true;
		}else {
			return false;
		}
	}

}
