package com.cts.demos1;

/*
 * We cannot create an object of interface but we can
 * create a reference variable of interface
 * So in the demo below calc is the reference variable of
 * Calculator and which is storing the reference of MyNumber class's
 * object as MyNumber is implementing Calculator
 */
public class NumberMain {

	public static void main(String[] args) {
		
		    Calculator calc=new Mynumber();
		    System.out.println(calc.add(3, 4));
		    System.out.println(calc.subtract(4, 1));
	}

}
