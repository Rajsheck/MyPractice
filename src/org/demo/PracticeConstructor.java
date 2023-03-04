
package org.demo;

public class PracticeConstructor {
	//Instance variable or Global variable
	
	public PracticeConstructor(int x) {
		this.x=x;
		
		this.name="raja";
		this.x=10000000;
		
		
		
	}
	
	
	public PracticeConstructor() {
		// TODO Auto-generated constructor stub
	}


	int x;
	String name;
	
	
	private void display() {
		
		System.out.println(x+  "---->"+ name);
		
	}
	
	public static void main(String[] args) {
		
		PracticeConstructor obj = new PracticeConstructor(1000);
		
	//	obj.display();
		
PracticeConstructor obj1 = new PracticeConstructor();
		
		obj1.display();
		
		
	}
}
