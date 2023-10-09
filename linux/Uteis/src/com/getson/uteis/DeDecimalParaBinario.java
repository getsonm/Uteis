package com.getson.uteis;

public class DeDecimalParaBinario {

	public void Convert(int num1)
	{
		int bin[] = new int[40];
		int ind = 0;

		while(num1 >0) {
		bin[ind++] = num1%2;
		num1 = num1/2;
		}
	
		for(int x=ind-1; x>=0; x--)	{
			System.out.print(bin[x]);
		}
	}

	public static void main(String args[])

	{

		DeDecimalParaBinario dtb = new DeDecimalParaBinario();
		System.out.println("Dia 19.........: ");
		dtb.Convert(19);
		System.out.println("\nMês 9..........: ");
		dtb.Convert(9);
		System.out.println("\nAno 1968.......: ");
		dtb.Convert(1968);
		System.out.println("\nData invertida.: "); // com zero no mês 
		dtb.Convert(19680919);

	}

}
