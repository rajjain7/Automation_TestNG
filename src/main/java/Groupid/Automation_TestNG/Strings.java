package Groupid.Automation_TestNG;

public class Strings {

	public static void main(String[] args) {
		
		String s1="Raja";
		String s2="Raja";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.substring(0, 1));
		//System.out.println(s1.substring(1 ,0 ));
		
		String s3=new String("Raja").intern();
		System.out.println(s3.hashCode());
		//System.out.println(s1==s3);
		
		//System.out.println(s3.intern());
		System.out.println(s1==s3);
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("raj");
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		String digit="1111abc";
		if(digit.matches("\\d+")) {
			System.out.println("string contains only digits");
		}
		else {
			System.out.println("string does not contains only digits");
			
		}
		
	}
}
