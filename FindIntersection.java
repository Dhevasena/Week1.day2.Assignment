package week1.day1.assignment;

public class FindIntersection{
	
	public static void main(String[] args) {
		//declared two array varible
		int[] arr1={3,2,11,4,6,7};
		int[] arr2={1,2,8,4,9,7};
		//Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr2.length; i++) {
	    //Compare Both the arrays using a condition statement
			if(arr1[i]==arr2[i])
			{
				//Print the first array (should match item in both arrays)
				System.out.println(arr1[i]);	
			}		
		}	
	}

}
