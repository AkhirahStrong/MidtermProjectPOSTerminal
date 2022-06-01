package Midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutTerminalApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to The Hats Shop! \nHere is our menu");
		Products.productListDisplay();
		System.out.println("Please select which hat you would like to purchase (1-12)");
		int select = scan.nextInt();
		System.out.println("Excellent choice! You ordered our:");
		Products.productList().get(select).printInfo();
		
			System.out.println("How many of this style would you like?");
			int quantity = scan.nextInt();
			if (Products.productList().get(select).getAmountOfProduct() >= quantity) {
				System.out.println("You've ordered " + quantity + " hats");
			} else {
				System.out.println("Error! We only have " + Products.productList().get(select).getAmountOfProduct()
						+ " of this style in stock, please select an amount in range");
				System.out.println("How many of this style would you like?");
				 quantity = scan.nextInt();
				 System.out.println("You've ordered " + quantity + " hats");
			}
		
		double lineTotal = (Products.productList().get(select).getPrice() * quantity);
		System.out.println("Your running total is: " + lineTotal);
		System.out
				.println("Would you like to order anything else? (Press 1 for Yes or press 2 to continue to checkout)");
		int yn = scan.nextInt();

		if (yn == 1) {
			orderItems(lineTotal);
		} else if (yn == 2) {
			double salesTax = lineTotal * 0.06;
			double subTotal = lineTotal * 1.06;
			System.out.println("Total: " + lineTotal);
			System.out.println("Sales Tax: " + salesTax);
			System.out.println("SubTotal: " + subTotal);
		} else {
			System.out.println("Error! Please enter a valid number");
		}
		System.out.println("How would you like to pay today?\n1. Credit\n2. Cash\n3. Check\n4. Crypto");
		String paySelect;
		int payNum = scan.nextInt();
		if(payNum == 1) {
			paySelect = "Credit";
			 CreditCardPayment creditCardPay = new CreditCardPayment(lineTotal, 0, 0, 25.00);
			 creditCardPay.runCredit();
		}else if(payNum == 2) {
			paySelect = "Cash";
			CashPayment cashPay = new CashPayment(0, 0, 0, 20);
			cashPay.change();
		}else if(payNum == 3) {
			paySelect = "Check";
			CheckPayment checkPay = new CheckPayment(85, 77, 88, 99);
			checkPay.check();
		}else if(payNum == 4) {
			paySelect = "Crypto";
			CryptoPayment.walletAddress();
			CryptoPayment.goodBye();
		}

	}

	public ArrayList<Products> orderList(ArrayList<Products> list, int quantity) {

		return orderList(list, quantity);
	}

	public static void orderItems(double lineTotal) {
		// similar methodology to what's written in the main, but as it's in a method the
		// machine won't get confused
		Scanner scan = new Scanner(System.in);
		Products.productListDisplay();
		System.out.println("Please select which hat you would like to purchase (1-12)");
		int select = scan.nextInt();
		System.out.println("Excellent choice! You ordered our:");
		Products.productList().get(select).printInfo();
		System.out.println("How many of this style would you like?");
		int quantity = scan.nextInt();
		if (Products.productList().get(select).getAmountOfProduct() >= quantity) {
			System.out.println("You've ordered " + quantity + " hats");
		} else {
			System.out.println("Error! We only have " + Products.productList().get(select).getAmountOfProduct()
					+ " of this style in stock, please select an amount in range");
			System.out.println("How many of this style would you like?");
			 quantity = scan.nextInt();
			 System.out.println("You've ordered " + quantity + " hats");
		}
		double totalFinal = (Products.productList().get(select).getPrice() * quantity + lineTotal);
		double salesTax = totalFinal * 0.06;
		double subTotal = totalFinal * 1.06;
		System.out.println("Total: " + totalFinal);
		System.out.println("Sales Tax: " + salesTax);
		System.out.println("SubTotal: " + subTotal);

	}

}
