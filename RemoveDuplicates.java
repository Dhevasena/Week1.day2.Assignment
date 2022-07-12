package week1.day1.assignment;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s1 = "We learn java basics as part of java sessions in java week1";
		String[] s2 = s1.split(" ");
		int lengthofs1 = s2.length;
		int count = 0;
		for (int i = 0; i < lengthofs1; i++) {
			for (int j = i+1; j <lengthofs1; j++) {
			if(s2[i].equalsIgnoreCase(s2[j])) {
				count++;
			if(count>1){
				s2[i]="";
			}
			}
			}
			System.out.print(s2[i]+"\t");
			
		}

	}

}
