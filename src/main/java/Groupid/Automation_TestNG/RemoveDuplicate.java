package Groupid.Automation_TestNG;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a string to remove duplicate");
		@SuppressWarnings("resource")
		Scanner read=new Scanner(System.in);
		String string=read.nextLine();
		
		
		char[] chars=string.toCharArray();
		
		Set<Character> lschar=new LinkedHashSet<Character>();
		for(Character c:chars) {
			lschar.add(c);
		}
		
		StringBuilder sb=new StringBuilder();
		for(Character cs:lschar) {
			sb.append(cs);
		}
		
		System.out.println("new string is: "+sb);
				

	}

}
