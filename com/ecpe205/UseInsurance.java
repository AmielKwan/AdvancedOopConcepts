package com.ecpe205;

import java.util.Scanner;

public class UseInsurance 
{
	
	public static void main(String[] args)
	{
			Scanner input = new Scanner(System.in);
			System.out.println("Please choose Insurance type: (1=Life, 2=Health)");
			int a = input.nextInt();
			if (a == 1)
			{
				Life lifeInsurance = new Life(null, 0);
				lifeInsurance.display();
			}
			else
			{
				Health healthInsurance = new Health(null, 0);
				healthInsurance.display();
			}
			
		
	}
}