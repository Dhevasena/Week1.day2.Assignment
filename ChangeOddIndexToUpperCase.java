
/*
Pseudo Code
* Declare String Input as Follow
* String test = "changeme";
* a) Convert the String to character array
* b) Traverse through each character (using loop)
* c)find the odd index within the loop (use mod operator)
* d)within the loop, change the character to uppercase, if the index is odd else don't change
*/
package week1.day1.assignment;
import java.util.Iterator;
public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
		//declare input variable
		String test="changeme";
		//Convert the string into array
		char[] changecase=test.toCharArray();
		//Traverse through each character
		for (int i = 0; i < changecase.length; i++) {
			//check the odd one
			if(i%2!=0)
			{
				//Print the Odd one in Uppercase
				System.out.print(Character.toUpperCase(changecase[i]));
			}
			else
			{
				System.out.print((changecase[i]));	
			}
			
		}		
	}
}
