package com.springcore.constructor_Ambiguity;

public class Addition {
	
	int a,b;
	
	public Addition(int a, int b) {
		System.out.println("con: int, int");
		this.a=a;
		this.b=b;
	}
	public Addition(String a, String b) {
		System.out.println("con: String, String");
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
	}
	
	public void show() {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("Addition is :"+ (this.a+this.b));
		
	}
	

}
