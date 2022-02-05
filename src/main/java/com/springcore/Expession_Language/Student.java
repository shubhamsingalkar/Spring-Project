package com.springcore.Expession_Language;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value ("#{11+12}")
	int x;
	
	@Value ("#{8>7?45:12}")
	int y;
	
	@Value("#{T(java.lang.Math).PI}") //static variable calling using expression (it uses with @Value annotation) 
	double z;                           //syntax==> @Value("#{T(ClassName).VariableName}")

	@Value("#{T(com.springcore.stereotype.Boys).getname()}") //static method calling
	String name;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + "]";
	}

	
	
	
	
	
	
}
