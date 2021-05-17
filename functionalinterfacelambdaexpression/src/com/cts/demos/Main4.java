package com.cts.demos;

public class Main4 {

	public static void main(String[] args) {
	FunctionalInterface1 fi=(a,b)->
	{
		if(a>0 && b>0)
		{
		   return a+b;	
		}
		else
		{
			return 0;
	    }
	};
    System.out.println(fi.add(-1, 3));
	
	}

}
