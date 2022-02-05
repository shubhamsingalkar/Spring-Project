package com.springcore.ref_Injection;

public class B {
	
	private int y;

	public B(int y) {
		super();
		this.y = y;
	}

	public B() {
		super();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

	
}
