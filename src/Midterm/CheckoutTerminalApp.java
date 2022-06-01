package Midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutTerminalApp {

	public static void main(String[] args) {
		int menuRepeat;
		Scanner scan = new Scanner(System.in);
//		do {
		System.out.println("Welcome to The Hat Shop! \nHere's what we have for sale: \n");
		// added a new line between "here's what we have for sale" and product display so it doesn't look so clustered - sam
		Products.productListDisplay();
		// if we are telling them to select a number, we need to provide a number somewhere within the array list that we are drawing from -sam
		System.out.println("\nPlease select which hat you would like to purchase (1-12):");
		int select = scan.nextInt();
		System.out.println("Excellent choice! You ordered our:");
		Products.productList().get(select).printInfo();
		String itemsOrdered = Products.productList().get(select).itemsOrdered();
		
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
		System.out.println("Would you like to order anything else? (Press 1 for Yes or press 2 to continue to checkout)");
		int yn = scan.nextInt();

		if (yn == 1) {
			orderItems(lineTotal, itemsOrdered);
		} else if (yn == 2) {
			double salesTax = lineTotal * 0.06;
			double subTotal = lineTotal * 1.06;
			System.out.printf("Total: $%.2f", lineTotal);
			System.out.printf("\n" + "Sales Tax: $%.2f", + salesTax);
			System.out.printf("\n" + "SubTotal: $%.2f", + subTotal);
			System.out.println("\nHow would you like to pay today?\n1. Credit\n2. Cash\n3. Check\n4. Crypto");
			String paySelect = " ";
			int payNum = scan.nextInt();
			if(payNum == 1) {
				paySelect = "Credit";
				 CreditCardPayment creditCardPay = new CreditCardPayment(lineTotal, 0, 0, 25.00);
				 creditCardPay.runCredit();
			}else if(payNum == 2) {
				paySelect = "Cash";
				CashPayment cashPay = new CashPayment(subTotal, 0, 0, 20);
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
			receipt(lineTotal, subTotal, paySelect, itemsOrdered);
		} else {
			System.out.println("Error! Please enter a valid number");
		}
	//	System.out.println("Would you like to redisplay the menu and make a new order? (Press 1 for yes, 2 for no)");
	//	 menuRepeat = scan.nextInt();
	//	}while(menuRepeat ==1);
		
		scan.close();
	}

	public ArrayList<Products> orderList(ArrayList<Products> list, int quantity) {
		//System.out.println(ArrayList<Products> orderList.get(Select) + "Amount: " + quantity);
		
		return orderList(list, quantity);
	}

	
	public static void orderItems(double lineTotal, String itemsOrdered) {
		// similar methodology to what's written in the main, but as it's in a method the
		// machine won't get confused
		Scanner scan = new Scanner(System.in);
		System.out.println();
		Products.productListDisplay();
		System.out.println("\nPlease select which hat you would like to purchase (1-12):");
		int select = scan.nextInt();
		System.out.println("Excellent choice! You ordered our:");
		Products.productList().get(select).printInfo();
		String itemsOrdered2 = Products.productList().get(select).itemsOrdered() + "\n" + itemsOrdered;
		System.out.println("How many of this style would you like?");
		int quantity = scan.nextInt();
		if (Products.productList().get(select).getAmountOfProduct() >= quantity) {
			System.out.println("You've ordered " + quantity + " hats");
		} else {
			System.out.println("Error! We only have " + Products.productList().get(select).getAmountOfProduct()
					+ " of this style in stock, please select an amount in range");
			System.out.println("How many of this style would you like?");
			 quantity = scan.nextInt();
			 System.out.println("You've ordered " + quantity + " hats.");
		}
		double totalFinal = (Products.productList().get(select).getPrice() * quantity + lineTotal);
		// (sam) i think we have a sales tax field in the payment method we can pull from but how to do it...? we could potentially have this class extend Payment as well?
		double salesTax = totalFinal * 0.06;
		double subTotal = totalFinal * 1.06;
		System.out.printf("\n" +"Total: $%.2f", totalFinal);
		System.out.printf("\n" + "Sales Tax: $%.2f", salesTax);
		System.out.printf("\n" + "SubTotal: $%.2f", subTotal);
		System.out.println("\nHow would you like to pay today?\n1. Credit\n2. Cash\n3. Check\n4. Crypto");
		String paySelect = " ";
		int payNum = scan.nextInt();
		if(payNum == 1) {
			paySelect = "Credit";
			 CreditCardPayment creditCardPay = new CreditCardPayment(lineTotal, 0, 0, 25.00);
			 creditCardPay.runCredit();
		}else if(payNum == 2) {
			paySelect = "Cash";
			CashPayment cashPay = new CashPayment(subTotal, 0, 0, 20);
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
		receipt(totalFinal, subTotal, paySelect, itemsOrdered2);
	}
	public static void receipt(double total, double subTotal, String paySelect, String itemsOrdered) {
		System.out.println("\nRECIEPT INFO");
		System.out.println("Items ordered: " + "\n" + itemsOrdered);
		System.out.println("Total: " + total);
		System.out.println("Subtotal: " + subTotal);
		System.out.println("Payment Method: " + paySelect);
		
	}
	

}
