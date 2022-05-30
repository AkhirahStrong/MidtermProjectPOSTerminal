//package Midterm;
//
//import java.util.Scanner;
//
//public class DebitPayment extends CreditCardPayment{
//
//	protected String userPin = "";
//	
//	public DebitPayment(double subtotal, double salesTax, double taxRate, double total) {
//		super(subtotal, salesTax, taxRate, total);
//		// TODO Auto-generated constructor stub
//		
//	}
//	
//	public void runDebit() {
//		Scanner scan = new Scanner(System.in);
//		String pin = "\\d\\d\\d\\d";
//		boolean pinAccepted = false;
//		
//		// acting fucky
//		do {
//		System.out.println("Please enter your 4 digit pin:");
//		System.out.println("Remember to protect your pin!");
//		String userPin = scan.nextLine();
//		setUserPin(userPin);
//		if (getUserPin().matches(pin)) {
//			pinAccepted = true;
//			System.out.println("true test");
//		} else {
//			
//			System.out.println("Incorrect pin, please try again.");
//		} 
//		
//		} while (pinAccepted == false);
//		
//	
//		scan.close();
//		
//	}
//
//	public String getUserPin() {
//		return userPin;
//	}
//
//	public void setUserPin(String userPin) {
//		this.userPin = userPin;
//	}
//
//
//}
