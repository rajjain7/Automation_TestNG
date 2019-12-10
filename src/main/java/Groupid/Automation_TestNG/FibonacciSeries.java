package Groupid.Automation_TestNG;

import java.util.Scanner;

public class FibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		int t1=0,t2=1;
		
		for(int i=1;i<=num;i++) {
			System.out.println(t1 + "+");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}
		

	}

}
