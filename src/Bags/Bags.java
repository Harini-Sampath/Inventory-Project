package Bags;

//import java.util.LinkedList;

public class Bags {
	private int quantity, price;
	private String brand;

	public int id = 0;

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/*
	 * public void setId(int price) { this.id = id; }
	 */

	public Bags(String brand, int price, int quantity) {

		setBrand(brand);
		setQuantity(quantity);
		setPrice(price);

		id++;

	}

	// public void setData()
	// {

	// LinkedList<String> ll=new LinkedList<String>();

	// ll.add(arg0)

	// }

}
