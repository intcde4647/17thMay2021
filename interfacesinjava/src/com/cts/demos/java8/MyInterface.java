package com.cts.demos.java8;

public interface MyInterface {

	/* 
	 * default method which we can write in java8 
	 */
	default void newMethod()
	{
		System.out.println("Newly added default method!!!!");
	}
	void abstractMethod();
	static void staticMethod()
	{
		System.out.println("I am the static method");
	}
}
