package Groupid.Automation_TestNG;

import java.util.Arrays;

public class StringAnagram {
	
	@SuppressWarnings("unused")
	public void isAnagram(String s1,String s2) {
		
		String str1=s1.replaceAll("\\s", "");
		String str2=s1.replaceAll("\\s", "");
		
		boolean status;
		
		if(str1.length()!=str2.length()) {
			status=false;	
		}
		else {
			char[] str1char=str1.toLowerCase().toCharArray();
			char[] str2char=str2.toLowerCase().toCharArray();
			
			Arrays.sort(str1char);
			Arrays.sort(str2char);
			
			status=Arrays.equals(str1char, str2char);
			
		}
		
		if(status==true) {
			System.out.println("Given strings are anagram");
		}
		else {
			System.out.println("Given strings are not anagram");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringAnagram sa=new StringAnagram();
		sa.isAnagram("keep", "peakaaa");
		
	
	}

}
