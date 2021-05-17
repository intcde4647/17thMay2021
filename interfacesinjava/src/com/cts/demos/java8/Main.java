package com.cts.demos.java8;

public class Main {

	public static void main(String[] args) {
		MyInterface mi=new MyClass();
		mi.abstractMethod();
		System.out.println("----------------");
		mi.newMethod();
		System.out.println("---------------------");
		MyInterface.staticMethod();
	}

}
