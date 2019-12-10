package Groupid.Automation_TestNG;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	
		
		System.out.println("Enter a string to reverse");
		@SuppressWarnings("resource")
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String reverse=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		
		System.out.println("Reverse string is "+reverse);
		
		if(reverse.equalsIgnoreCase(str)) {
			System.out.println("String is palindrome");
		}
			else{
				System.out.println("String is not palindrome");
			}
			
		}
		

	}


