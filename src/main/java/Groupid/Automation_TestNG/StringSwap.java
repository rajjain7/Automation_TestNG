package Groupid.Automation_TestNG;

public class StringSwap {
	
	public static void  stringswap(String s1,String s2) {
		
		System.out.println("Before swap :"+s1+ " " + s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After swap :"+s1+ " " + s2);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSwap.stringswap("love", "you");

	}

}
