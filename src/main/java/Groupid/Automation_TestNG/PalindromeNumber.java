package Groupid.Automation_TestNG;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to check palindrome");
		@SuppressWarnings("resource")
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		int temp,r,sum=0;
		
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;	
		}
		
		if(temp==sum) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
		
	

	}

}
