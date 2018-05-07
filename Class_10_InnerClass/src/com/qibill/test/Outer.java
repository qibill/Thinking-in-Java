package com.qibill.test;

public class Outer {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.getInner();
	}
	
	class Inner {
		
	}
	
	public Inner getInner() {
		return new Inner();
	}
}
