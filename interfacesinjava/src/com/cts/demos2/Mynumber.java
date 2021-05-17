package com.cts.demos2;
/*
 *    A class can implement multiple interfaces 
 *    though a class cannot extend multiple classes
 * 
 */


public class Mynumber implements Calculator,Calculator2 {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
