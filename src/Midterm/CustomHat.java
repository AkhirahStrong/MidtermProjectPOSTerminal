package Midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomHat extends Products {

	public CustomHat(int menuNumber, String name, String description, String category, double price, String size,
			int amountOfProduct) {
		super(menuNumber, name, description, category, price, size, amountOfProduct);
		
		this.menuNumber = menuNumber; 
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.size = size;
		this.amountOfProduct = amountOfProduct; 
		
		
	}
	public void runCustomHat() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Let's create your custom hat order.");
		System.out.println("What type of hat would you like? Options include Baseball Cap, Beanie or Fitted:");
		String category = scan.nextLine();
		category = category.substring(0, 1).toUpperCase() + category.substring(1);
		setCategory(category);
		System.out.println("Choose a color:");
		String description = scan.nextLine();
		description = description.substring(0, 1).toUpperCase() + description.substring(1);
		setDescription(description);
		System.out.println("What do you want on your hat? Describe the design and/or words that you would like featured:");
		String name = scan.nextLine();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		setName(name);
		if (!getCategory().equalsIgnoreCase("Fitted") ) {
		System.out.println("What size would you like? S/M/L/XL:");
		String size = scan.nextLine().toUpperCase();
		setSize(size);
		}
		ArrayList<Products> hat = new ArrayList<Products>();
		Products custom = new Products(0, getName(), getDescription(), getCategory(), 45, getSize(), 1);
		hat.add(custom);
		
	}
	
	
	public void printInfo() {
		System.out.println("(" + getMenuNumber() + ") " + getCategory() + ": " + getName() + ", " + getSize() + ", " + getDescription()+ ", $" + String.format("%.2f", getPrice()));
	}
	public String itemsOrdered() {
		return(getName() + ", " + getCategory() + ", " + String.format("%.2f", getPrice()));
	}

}
