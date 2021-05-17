package com.cts.demos2;

/*
 * In interfaces prior to java 8 , all the methods are abstract
 * as all the methods are abstract we cannot create an object of
 * interfaces , what we cannot do is 
 * Calculator calc=new Calculator();
 * 
 */
public interface Calculator {
   int add(int a,int b);
   int subtract(int a,int b);
}
