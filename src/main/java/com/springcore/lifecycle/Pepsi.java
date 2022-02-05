package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Life cycle methods using Interfaces
public class Pepsi implements InitializingBean,DisposableBean{
//InitializingBean,DisposableBean ==> these both interfaces have a life cycle methods
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("init method named as aftyerPropertySet in Interfaces");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method of Interfaces");
	}
	
	
}
