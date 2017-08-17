package Bags;

import java.util.Scanner;

public class Adjust {
	public void adjust()
	{
		int c;
		System.out.println("Choose the option you want to perform:"
				+ "1--Add Stock"
				+ "2--Remove Stock");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		switch(c)
		{
		case 1:
			//add();
			break;
		case 2:
			//remove();
			break;
		default:
			System.out.println("Enter options 1 or 2");
			break;
		}
		
		
		
	}

}
