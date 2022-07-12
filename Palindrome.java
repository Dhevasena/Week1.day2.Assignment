package week1.day1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		//Declare A String value as"madam"
		String str1="madam";
		String str2="";
		int len=str1.length();
		//Iterate over the String in reverse order
		for (int j = len-1; j >=0;  j--)
		{		
			str2=str2+str1.charAt(j);
		}
        //Compare the original String with the reversed String, if it is same then print palinDrome 
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println(str1+"Its a palindrome");
		}
		else {
			System.out.println(str1+"Its not a palindrome");
		}
		

	}

}
