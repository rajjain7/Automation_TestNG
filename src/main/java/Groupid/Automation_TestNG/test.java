package Groupid.Automation_TestNG;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.openqa.selenium.SearchContext;


public abstract class test implements SearchContext {

	public static void main(String[] args) throws IOException {
		
		int[] a= {1,2,3};
		int[] b=new int[2];
		
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		h1.put("a", 1);
		System.out.println(h1.containsKey("a"));
		
		
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(1);
		
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		Runtime runTime=Runtime.getRuntime();
		try {
			runTime.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String filepath="C:\\Users\\hp\\Desktop\\test1.txt\\";
		FileWriter fw=new FileWriter(filepath);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("abcdefgh");
		bw.flush();
		bw.newLine();
		bw.write(12345);
		bw.close();
		

	}
	
	

}
