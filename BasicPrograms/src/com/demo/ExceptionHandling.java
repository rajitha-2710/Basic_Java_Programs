package com.demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		Boolean x;
		x=false;
		while(x=true)
		{
			try
			{
				int a=5;
				int b=0;
				int c;
				c=a/b;
				System.out.println(c);
				int dc=a+b;
				System.out.println(dc);
				x=false;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);

			}
			System.out.println("ghf");
		}
	}

}
