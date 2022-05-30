package Midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutTerminalApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
//		CashPayment test = new CashPayment(0, 0, 0, 20);
//		//test.change();
//		CheckPayment cheque = new CheckPayment(85, 77, 88, 99);
//		cheque.check();
//		
	//	CreditCardPayment creditCardPayment = new CreditCardPayment(0, 0, 0, 25.00);
		//creditCardPayment.runCredit();
		
//	CryptoPayment pay = new CryptoPayment("1234567890", "ahky1234564578");
//	System.out.println(pay);
		
//  	CryptoPayment.walletAddress();
	//	ArrayList<Products> orderList = new ArrayList<Products>();
		
		System.out.println("Welcome to The Hats Shop! \nHere is our menu");
		Products.productListDisplay();
		System.out.println("Please select which hat you would like to purchase (1-12)");
		int select = scan.nextInt();
		System.out.println("Excellent choice! You ordered our:");
	    Products.productList().get(select).printInfo();
	    System.out.println("How many of this style would you like?");
	    int quantity = scan.nextInt();	    
	    if(Products.productList().get(select).getAmountOfProduct() >= quantity) {
	    		    	
	    	System.out.println("You've ordered " + quantity + " hats");
	    }else {
	    	System.out.println("Error! We only have " + Products.productList().get(select).getAmountOfProduct() + " hats!" );
	    }
	 
	    double lineTotal = (Products.productList().get(select).getPrice() * quantity);
	    System.out.println("Your running total is: " + lineTotal);
	    System.out.println("Would you like to order anything else (Y/N)");
	    
	   
	    
	    
	    
	    
	    
		
		
		
		



	}
	public ArrayList<Products> orderList(ArrayList<Products> list, int quantity){
		
		return orderList(list, quantity);
	}

}
