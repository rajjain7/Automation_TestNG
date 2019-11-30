package Groupid.Automation_TestNG;

  abstract class Base {
	
	public void method() {
	
	System.out.println("This is base method");
	} 
	
	public int test(int a,int b) {
		return a+b;
		
	}
	

 static class derived extends Base{
	
	public void method() {
		
		System.out.println("This is derived method");
	}
	
	public double test(int a,int b,double c) {
		return a+b+c;
		
	}
	

 }
public static void main(String[] args){  
		
	
		derived b=new derived();
		b.method();
		System.out.println(b.test(1, 2, 5.60));
		
}
}

