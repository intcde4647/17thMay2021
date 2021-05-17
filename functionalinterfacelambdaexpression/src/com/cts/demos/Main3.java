package com.cts.demos;

public class Main3 {

	public static void main(String[] args) {
	FunctionalInterface3 fi=num->System.out.println(++num);
    fi.increment(4);
	
	}

}
