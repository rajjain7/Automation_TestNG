package Groupid.Automation_TestNG;

import java.util.Scanner;

public class ArmstrongNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		int r,temp,sum=0;
		
		temp=num;
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("number is armstrong number");
		}else {
			System.out.println("number is not armstrong number");
		}

	}

}
