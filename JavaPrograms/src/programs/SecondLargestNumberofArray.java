package programs;

import java.util.Arrays;

public class SecondLargestNumberofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {34,76,12,43,35,10,54};
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for(int i = n-2;i>=0;i--) {
			if(arr[i]!=arr[n-1]) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
