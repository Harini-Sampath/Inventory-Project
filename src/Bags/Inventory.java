package Bags;

import java.util.Scanner;

public class Inventory {
	public void categories()
	{
		int b;
		System.out.println("Choose the category you want to display:"
				+ "1--Backpacks"
				+ "2--Hand bags"
				+ "3--Luggage bags");
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		switch(b)
		{
		case 1:
			//bp.display();
			break;
		case 2:
			//hb.display();
			break;
		case 3:
			//lb.display();
			break;
		default:
			System.out.println("Enter options between 1 to 3");
			break;
		}
		
	}

}
