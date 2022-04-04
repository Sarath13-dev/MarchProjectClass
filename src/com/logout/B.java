package com.logout;

public class B extends A {

	@Override
	protected int Marks(int a, int b) {

		return a / b;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.Marks(10, 1));
	}
}
