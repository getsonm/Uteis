package com.getson.uteis;

public class ClasseExtendidaSobrepor {

	static class Extendida
	{
		int x=20,y=15;
		Extendida(int a, int b)
		{
			x = a;
			y = b;
		}
	
		void display()
		{
			System.out.println("Extendida x de ClasseExtende.....:" + x);
			System.out.println("Extendida y de ClasseExtende.....:" + y);
		}
	}

	static class ClasseExtende extends Extendida
	{
		int a,b,sobrepor;
		ClasseExtende(int a, int b, int c)
		{
			super(a,b);
			sobrepor = c * a * b;
		}
		void display()
		{
			super.display();
			System.out.println("ClasseExtende terceiro parametro.:" + sobrepor);
		}
	}

	public static void main(String args[])
	{
		ClasseExtende sc = new ClasseExtende(100, 200, 3);
		sc.display();
	}

}
