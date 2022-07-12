package week1.day1.assignment;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		//declare the String
		String s1 = "I AM A SOFTWARE TESTER";
		//Spliting the String without space
		String[] s2 = s1.split(" ");
		//Traverse through each string
		for(int i=0;i<s2.length;i++) {
			//Find odd string
			if(i%2!=0) {
				//convert the String to char
				char[] arr = s2[i].toCharArray();
				//Traverse through each char
				for(int j=arr.length-1;j>=0;j--) {
					//Print odd Char in reverse
					System.out.print(arr[j]);
				}
			}
			else {
				//Print Even String with Space
				System.out.print(" " +s2[i]+ " ");
			}
		}
}
}


