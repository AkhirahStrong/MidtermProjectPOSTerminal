package Midterm;

import java.util.Scanner;

public class CreditCardPayment extends Payment{

	//fields
		//cardNumber
		//expiration
		//cvvCode
	
	protected String cardNumber;
	protected String expiration;
	protected String cvvCode;
	//getters - do we need setters as we are not storing this information within the system????
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	
	//Constructor
	public CreditCardPayment(double subtotal, double salesTax, double taxRate, double total) {
		super(subtotal, salesTax, taxRate, total);
		// TODO Auto-generated constructor stub
	}
	
	//Method ??
	// this method will require a scanner most likely
	public void runCreditPayment () {
		Scanner scan = new Scanner(System.in);
		// print the total - this might wind up being done in the 
		System.out.println("The total for your purchase is: $" + getTotal()); 
		// take in credit card info
		// assure that its correctly formatted or the right type of numbers and/or the right type of card? ie do we take AMEX?/Discover or just Visa/Mastercard
			
			
		
		System.out.println("Please enter your credit card number:");
		String cardNumber = scan.nextLine();
		setCardNumber(cardNumber);
		// Visa cards begin with a 4 and have 13 or 16 digits - seems that the 13 digit card is way out of date though
		String visa = "[4]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String visaSpaced = "[4]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";
			// Mastercard cards begin with a 5 and has 16 digits
		String masterCard = "[5]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String masterCardSpaced = "[5]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";
		// American Express cards begin with a 3, followed by a 4 or a 7 has 15 digits
		String amex = "[3][47]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String amexSpaced = "[3][47]\\d\\d\\s\\d\\d\\d\\d\\d\\d\\s\\d\\d\\d\\d\\d";
		// Discover cards begin with a 6 and have 16 digits
		
		
		
		
		
	}
	 
	//override toString()
	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber + ", expiration=" + expiration + ", cvvCode=" + cvvCode
				+ ", toString()=" + super.toString() + ", getSubtotal()=" + getSubtotal() + ", getSalesTax()="
				+ getSalesTax() + ", getTaxRate()=" + getTaxRate() + ", getTotal()=" + getTotal() + "]";
	}
	

}
