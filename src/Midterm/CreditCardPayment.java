package Midterm;

import java.util.Scanner;

public class CreditCardPayment extends Payment {

	// fields
	// cardNumber
	// expiration
	// cvvCode

	protected String cardNumber;
	protected String expiration;
	protected String cvvCode;
	// getters - do we need setters as we are not storing this information within
	// the system????

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

	// Constructor
	public CreditCardPayment(double subtotal, double salesTax, double taxRate, double total) {
		super(subtotal, salesTax, taxRate, total);
		
	}

	public void runCredit() {
		Scanner scan = new Scanner(System.in);
		// regex card type validators
		
		// Visa cards begin with a 4 and 16 digits
		String visa = "[4]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String visaSpaced = "[4]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";
		
		// Mastercard cards begin with a 5 and has 16 digits
		String masterCard = "[5]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String masterCardSpaced = "[5]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";
		
		// American Express cards begin with a 3, followed by a 4 or a 7 has 15 digits
		String amex = "[3][47]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String amexSpaced = "[3][47]\\d\\d\\s\\d\\d\\d\\d\\d\\d\\s\\d\\d\\d\\d\\d";
		
		// Discover cards begin with a 6 and have 16 digits - do we want to add?
		String discoverCard = "[6]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
		String discoverCardSpaced = "[6]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";
		
		// date formats MM/YY or MMYY
		String date = "\\d\\d\\/\\d\\d";
		String dateNoSlash = "\\d\\d\\d\\d";
		
		// CVV formats 3 or 4 digits
		String cvvCode3 = "\\d\\d\\d";
		String cvvCode4 = "\\d\\d\\d\\d";
		
		
		
		// assure that its correctly formatted or the right type of numbers and/or the
		// right type of card?
		// validate that card number style matches the cards we want to take
		// (visa/mastercard/amex)
		// take in credit card info
		// are the numbers valid???
		boolean cardAccepted = false;
		boolean dateAccepted = false;
		boolean cvvAccepted = false;
		
		String cardType = "";
		// card number validation
		while (cardAccepted == false) {
			System.out.println("Please enter your credit card number:");
			setCardNumber(scan.nextLine());
			if (getCardNumber().matches(visa)) {
				cardType = "Visa";
				cardAccepted = true;
			} else if (getCardNumber().matches(visaSpaced)) {
				cardType = "Visa";
				cardAccepted = true;
			} else if (getCardNumber().matches(masterCard)) {
				cardType = "Mastercard";
				cardAccepted = true;
			} else if (getCardNumber().matches(masterCardSpaced)) {
				cardType = "Mastercard";
				cardAccepted = true;
			} else if (getCardNumber().matches(amex)) {
				cardType = "American Express";
				cardAccepted = true;
			} else if (getCardNumber().matches(amexSpaced)) {
				cardType = "American Express";
				cardAccepted = true;
			} else if (getCardNumber().matches(discoverCard)) {
				cardType = "Discover";
				cardAccepted = true;
			} else if (getCardNumber().matches(discoverCardSpaced)) {
				cardType = "Discover";
				cardAccepted = true;
			} else {
				System.out.println("Declined.");
				System.out.println(
						"Your credit card number does not match either Visa, MasterCard, Discover or American Express, please try again or select a new payment method.");
				cardAccepted = false;
			}
		}

		// expiration date validation
		while (dateAccepted == false) {
			System.out.println("Please enter the expiration date on your card:");
			setExpiration(scan.nextLine());
			if (getExpiration().matches(date)) {
				dateAccepted = true;
			} else if (getExpiration().matches(dateNoSlash)) {
				dateAccepted = true;
			} else {
				System.out.println("Please enter a valid expiration date in MM/YY or MMYY format:");
				dateAccepted = false;
			}
		}
		
		// cvv validation - ensure that the cvv type matches card type (all but amex take a 3 digit cvv, amex takes 4)
		while (cvvAccepted == false) {
			System.out.println("Please enter the CVV code:");
			setCvvCode(scan.nextLine());
			if (getCvvCode().matches(cvvCode3) && ((cardType.matches("Mastercard"))) || (cardType.matches("Visa")) || (cardType.matches("Discover"))) {
				cvvAccepted = true;
			} else 	if ((getCvvCode().matches(cvvCode4)) && ((cardType.matches("American Express")))) {
				cvvAccepted = true;
			} else {
				System.out.println("Your CVV Code is invalid, please enter the 3 or 4 security digit code.");
			}
			
		}
		
		System.out.println("Processing...");
		System.out.println("Your transaction has been approved.");
		
		scan.close();
	
	}
	
	// override toString()
	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber + ", expiration=" + expiration + ", cvvCode=" + cvvCode
				+ ", toString()=" + super.toString() + ", getSubtotal()=" + getSubtotal() + ", getSalesTax()="
				+ getSalesTax() + ", getTaxRate()=" + getTaxRate() + ", getTotal()=" + getTotal() + "]";
	}

}
