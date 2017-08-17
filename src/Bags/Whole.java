package Bags;

import java.util.Scanner;

public class Whole {
	public void options()
	{
		int a;
		System.out.println("Choose the option you want to perform:\n"
				+ "1--View Inventory\n"
				+ "2--Adjust inventory\n"
				+ "3--Add Stock\n"
				+ "4--Place order\n");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		switch(a)
		{
		case 1:
			//category();
			break;
		case 2:
			//adjust();
			break;
		case 3:
			//add();
			break;
		case 4:
			//remove();
			break;
		default:
			System.out.println("Enter options between 1 to 4");
			break;
		}
		
		
	}
	

}
