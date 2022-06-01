package Midterm;

import java.util.ArrayList;

public class Products {
	
	//name category description price  size 
	
	protected String name;
	protected String description;
	protected String category;
	protected double price;
	protected String size; 
	protected int amountOfProduct;
	
	
	
	//Constructor
	public Products(String name, String description, String category, double price, String size, int amountOfProduct) {
		
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.size = size;
		this.amountOfProduct = amountOfProduct; 
	}
	
	public void printInfo() {
		System.out.println(getCategory() + ": " + getName() + ", " + getSize() + ", " + getDescription()+ ", $" + String.format("%.2f", getPrice()));
	}
	public String itemsOrdered() {
		return(getName() + ", " + getCategory() + ", " + String.format("%.2f", getPrice()));
	}
	
	//Method for storing
	public static ArrayList<Products> productList() {
		
	    ArrayList<Products> list = new ArrayList<Products>();
		Products blankStarter = new Products(" ", " ", " ", 0.0, " ", 0);
		list.add(blankStarter);
		Products baseballCap1 = new Products("Tigers Limited", "Blue and White", "Baseball Cap", 150.00, "One Size Fits All", 4);
		list.add(baseballCap1);
		Products baseballCap2 = new Products("Lions", "Blue and Grey", "Baseball Cap", 25.00, "One Size Fits All", 1);
		list.add(baseballCap2);
		Products baseballCap3 = new Products("Red Wings", "Red and White", "Baseball Cap", 30.00, "One Size Fits All", 2);
		list.add(baseballCap3);
		Products baseballCap4 = new Products("Pistons", "Red and Blue", "Baseball Cap", 15.00, "One Size Fits All", 4);
		list.add(baseballCap4);
		Products beanie1 = new Products("Nike", "Black", "Beanie", 10.00, "Large", 3);
		list.add(beanie1);
		Products beanie2 = new Products("Adidas", "Red", "Beanie", 10.00, "Medium", 2);
		list.add(beanie2);
		Products beanie3 = new Products("Puma", "Black and White", "Beanie", 10.00, "Small", 1);
		list.add(beanie3);
		Products beanie4 = new Products("Carhartt", "Beige", "Beanie", 25.00, "Large", 2);
		list.add(beanie4);
		Products fitted1 = new Products("Patagonia", "Orange", "Fitted", 35.00, "Large", 3);
		list.add(fitted1);
		Products fitted2 = new Products("Izod", "Green", "Fitted", 40.00, "Medium", 1);
		list.add(fitted2);
		Products fitted3 = new Products("Columbia", "Gray", "Fitted", 30.00, "Small", 4);
		list.add(fitted3);
		Products fitted4 = new Products("New Era", "Red and White", "Fitted", 25.00, "Large", 3);
		list.add(fitted4);
		return list;
	}
public static ArrayList<Products> productListDisplay() {
		
	    ArrayList<Products> list = new ArrayList<Products>();
		Products blankStarter = new Products(" ", " ", " ", 0.0, " ", 0);
		list.add(blankStarter);
		Products baseballCap1 = new Products("Tigers Limited", "Blue and white", "Baseball Cap", 150.00, "One Size Fits All", 4);
		list.add(baseballCap1);
		Products baseballCap2 = new Products("Lions", "Blue and Grey", "Baseball Cap", 25.00, "One Size Fits All", 1);
		list.add(baseballCap2);
		Products baseballCap3 = new Products("Red Wings", "Red and White", "Baseball Cap", 30.00, "One Size Fits All", 2);
		list.add(baseballCap3);
		Products baseballCap4 = new Products("Pistons", "Red and Blue", "Baseball Cap", 15.00, "One Size Fits All", 4);
		list.add(baseballCap4);
		Products beanie1 = new Products("Nike", "Black", "Beanie", 10.00, "Large", 3);
		list.add(beanie1);
		Products beanie2 = new Products("Adidas", "Red", "Beanie", 10.00, "Medium", 2);
		list.add(beanie2);
		Products beanie3 = new Products("Puma", "Black and White", "Beanie", 10.00, "Small", 1);
		list.add(beanie3);
		Products beanie4 = new Products("Carhartt", "Beige", "Beanie", 25.00, "Large", 2);
		list.add(beanie4);
		Products fitted1 = new Products("Patagonia", "Orange", "Fitted", 35.00, "Large", 3);
		list.add(fitted1);
		Products fitted2 = new Products("Izod", "Green", "Fitted", 40.00, "Medium", 1);
		list.add(fitted2);
		Products fitted3 = new Products("Columbia", "Gray", "Fitted", 30.00, "Small", 4);
		list.add(fitted3);
		Products fitted4 = new Products("New Era", "Red and White", "Fitted", 25.00, "Large", 3);
		list.add(fitted4);
		
		list.get(1).printInfo();
		list.get(2).printInfo();
		list.get(3).printInfo();
		list.get(4).printInfo();
		list.get(5).printInfo();
		list.get(6).printInfo();
		list.get(7).printInfo();
		list.get(8).printInfo();
		list.get(9).printInfo();
		list.get(10).printInfo();
		list.get(11).printInfo();
		list.get(12).printInfo();
		return list;
	}


	//getters / setters
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public double getPrice() {
		
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public int getAmountOfProduct() {
		return amountOfProduct;
	}



	public void setAmountOfProduct(int amountOfProduct) {
		this.amountOfProduct = amountOfProduct;
	}
	
	//Method for displaying
	
	//override toString()
	public void currencyRound() {
		
	}

}
