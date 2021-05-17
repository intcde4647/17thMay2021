package com.cts.demos;

@FunctionalInterface
public interface FunctionalInterface1 {
  int add(int a,int b);
  
  default String display()
  {
	  return "Hello";
	  
  }
  static String staticDisplay()
  {
	  return "static display";
  }
}
