package Groupid.Automation_TestNG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Generics {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		for(int i:list) {
			System.out.println("for each loop "+i);
		}
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println("Iterator "+itr.next());
		}
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("A", 1);
		hm.put("A", 2);
		
		//System.out.println("Get is "+hm.get("A"));
		
		Iterator<Entry<String, Integer>> itr1=hm.entrySet().iterator();
		while(itr1.hasNext()){
			Entry<String,Integer> itr2 =itr1.next();
			System.out.println("Keys: "+itr2.getKey()+ " Values: "+itr2.getValue());
			
		}
		
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("RST", 1);
		tm.put("XYZ", 2);
		tm.put("ABC", 3);
		
		Iterator<Entry<String,Integer>> itr4=tm.entrySet().iterator();
		while(itr4.hasNext()) {
			Entry<String,Integer> itr5=itr4.next();
			System.out.println(" Treemap Keys: "+itr5.getKey()+ " Treemap Values: "+itr5.getValue());
			
			}
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(1);
		ll.add(3);
		
		Iterator<Integer> itr6=ll.iterator();
		while(itr6.hasNext()) {
			System.out.println("Linked List "+itr6.next());
		}
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("raj", 1);
		ht.putIfAbsent("raj", 1);
		System.out.println(ht.get("raj"));
		
		TreeMap<String,Integer> tm1=new TreeMap<String,Integer>();
		tm1.put("s", 1);
		tm1.put("S", 2);
		
		Iterator<Entry<String,Integer>> itr7=tm1.entrySet().iterator();
		while(itr7.hasNext()) {
			Entry<String,Integer> itr8=itr7.next();
			System.out.println("Keys: "+itr8.getKey()+ " Values: "+itr8.getValue());
		}
		
		

	}

}
