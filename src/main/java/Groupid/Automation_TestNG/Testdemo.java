package Groupid.Automation_TestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testdemo {
	  
	  public static void main(String[] args) {
	    
	   // System.out.println("Hello Codiva");
	   
	    List<Student> list = new ArrayList<Student>();
	    list.add(new Student("Raj",102));
	    list.add(new Student("Ajay",110));
	    list.add(new Student("Vijay",107));
	    System.out.println(list);
	    Iterator itr=list.iterator();
	    while(itr.hasNext()) {
	    	if(itr.next().toString().equalsIgnoreCase("Vijay"));
	    	list.remove(itr);
	    }
	    System.out.println(list);
	  }
	  
	}

	class Student{
	  
	  Student(String name, int rono){
	    this.name=name;
	    this.rono=rono;
	  }
	  String name;
	  int rono;
	  public String toString(){
	    return "R No: "+ rono+" Name: " + name+"\n";
	  }
	}

