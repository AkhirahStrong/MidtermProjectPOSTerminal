package Midterm;

import java.util.Scanner;

public class CreditCardPayment extends Payment {

	// fields
	// cardNumber
	// expiration
	// cvvCode
	Scanner scan = new Scanner(System.in);
	protected String cardNumber;
	protected String expiration;
	protected String cvvCode;
	protected String userPin;

	// assure that its correctly formatted or the right type of numbers and/or the
	// right type of card?

	// validate that card number style matches the cards we want to take
	// (visa/mastercard/amex)

	// are the numbers valid???
	// regex card type validators
	// Visa cards begin with a 4 and 16 digits
	static String visa = "[4]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
	static String visaSpaced = "[4]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";

	// Mastercard cards begin with a 5 and has 16 digits
	static String masterCard = "[5]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
	static String masterCardSpaced = "[5]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";

	// American Express cards begin with a 3, followed by a 4 or a 7 has 15 digits
	static String amex = "[3][47]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
	static String amexSpaced = "[3][47]\\d\\d\\s\\d\\d\\d\\d\\d\\d\\s\\d\\d\\d\\d\\d";

	// Discover cards begin with a 6 and have 16 digits - do we want to add?
	static String discoverCard = "[6]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
	static String discoverCardSpaced = "[6]\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d\\s\\d\\d\\d\\d";

	// date formats MM/YY or MMYY -- allowing months to start with 0 or 1 and days
	// to start with 0, 1, 2, or 3
	static String date = "[01]\\d\\/[0123]\\d";
	static String dateNoSlash = "[01]\\d[0123]\\d";

	// CVV formats 3 or 4 digits
	static String cvvCode3 = "\\d\\d\\d";
	static String cvvCode4 = "\\d\\d\\d\\d";
	// pin format 4 digits
	static String pin = "\\d{4}";

	boolean cardAccepted = false;
	boolean dateAccepted = false;
	boolean cvvAccepted = false;
	boolean debitAccepted = false;
	boolean pinAccepted = false;
	String cardType = "";
	// debit variables
	int debitOrCredit = 1;

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

	public String getUserPin() {
		return userPin;
	}

	public void setUserPin(String cardNumber) {
		this.userPin = cardNumber;
	}

	// Constructor
	public CreditCardPayment(double subtotal, double salesTax, double taxRate, double total) {
		super(subtotal, salesTax, taxRate, total);

	}

	public void runCredit() {

		// card number validation
		while (cardAccepted == false) {
			creditOrDebit();
			cardNumber();

		}

		while (pinAccepted == false && debitAccepted == true) {
			enterPin();

		}

		// expiration date validation
		while (dateAccepted == false) {
			expirationDate();
		}

		// cvv validation - ensure that the cvv type matches card type (all but amex
		// takes a 3 digit cvv, amex takes 4)
		while (cvvAccepted == false) {
			cvv();
		}

		System.out.println("Processing...");
		System.out.println("Your transaction has been approved.");

		scan.close();

	}

	public void creditOrDebit() {
		// additional functionality for debit
		System.out.println("Enter 1 for Credit, Enter 2 for Debit.");
		// parseInt should fix scanner issue bypassing next scanner
		debitOrCredit = Integer.parseInt(scan.nextLine());
		if (debitOrCredit == 2) {
			debitAccepted = true;
			if (debitAccepted == true) {
				// bypass date and cvv if running as debit
				dateAccepted = true;
				cvvAccepted = true;
			}
		}
	}

	public void cardNumber() {
		System.out.println("Please enter your card number:");

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
					"We only accept Visa, MasterCard, Discover or American Express, please try again or select a new payment method.");
			cardAccepted = false;
		}

	}

	public void enterPin() {
		System.out.println("Please enter your pin:");
		setUserPin(scan.nextLine());
		if (getUserPin().matches(pin)) {
			pinAccepted = true;
		} else {
			System.out.println("Your 4 digit pin is invalid, try again.");
		}
	}

	public void expirationDate() {
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

	public void cvv() {
		System.out.println("Please enter the CVV code:");
		setCvvCode(scan.nextLine());
		if (getCvvCode().matches(cvvCode3) && ((cardType.matches("Mastercard"))) || (cardType.matches("Visa"))
				|| (cardType.matches("Discover"))) {
			cvvAccepted = true;
		} else if ((getCvvCode().matches(cvvCode4)) && ((cardType.matches("American Express")))) {
			cvvAccepted = true;
		} else {
			System.out.println("Your CVV Code is invalid, please enter the 3 or 4 security digit code.");
		}

	}

	// override toString()
	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber + ", expiration=" + expiration + ", cvvCode=" + cvvCode
				+ ", toString()=" + super.toString() + ", getSubtotal()=" + getSubtotal() + ", getSalesTax()="
				+ getSalesTax() + ", getTaxRate()=" + getTaxRate() + ", getTotal()=" + getTotal() + "]";
	}

}
