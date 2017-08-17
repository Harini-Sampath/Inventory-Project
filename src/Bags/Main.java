package Bags;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		//Whole w = new Whole();
		//Inventory i = new Inventory();
		//Adjust a = new Adjust();
		Bags b1 = new Bags("x", 10, 5);
		Bags b2 = new Bags("y", 20, 10);
		ArrayList<Bags> ll = new ArrayList<Bags>();
		ll.add(b1);
		ll.add(b2);
		
		System.out.print(b1.getId());
		System.out.print("\t" + b1.getBrand());
		System.out.print("\t" + b1.getPrice());
		System.out.print("\t" + b1.getQuantity());
//System.out.println(b2.getId());
		// w.options();

	}

}
