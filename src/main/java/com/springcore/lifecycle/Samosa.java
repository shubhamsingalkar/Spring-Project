package com.springcore.lifecycle;
// Life cycle methods using XML
public class Samosa {
	private double price;
	
	

	public Samosa() {
		super();
		
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() { // init method, method name may be anything but method signature must be same.
	                      // public void hello(){}	
		System.out.println("Im in init method of XML");
		
	}
	public void destroy() { // destroy method, method name may be anything but method signature must be same.
		
		System.out.println("I'm in destroy method of XML");
	}
	

}
