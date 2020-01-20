package Groupid.Automation_TestNG;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		
		int[] a= {1,2,3};
		int[] b= {4,6,5};
		
		int[] c=new int[a.length+b.length];
		int pos=0;
		
		for(int i:a) {
			c[pos]=i;
			pos++;
		}
		
		for(int i:b) {
			c[pos]=i;
			pos++;
		}
		
		System.out.println(Arrays.toString(c));
		

	}

}
