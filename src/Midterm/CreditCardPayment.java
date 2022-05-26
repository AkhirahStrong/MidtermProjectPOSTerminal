package Midterm;



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
		// print the total - this might wind up being done in the 
		System.out.println("The total for your purchase is: $" + getTotal()); 
		// take in credit card info
		// assure that its correctly formatted or the right type of numbers and/or the right type of card? ie do we take AMEX?/Discover or just Visa/Mastercard
		
	
	}
	 
	//override toString()
	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber + ", expiration=" + expiration + ", cvvCode=" + cvvCode
				+ ", toString()=" + super.toString() + ", getSubtotal()=" + getSubtotal() + ", getSalesTax()="
				+ getSalesTax() + ", getTaxRate()=" + getTaxRate() + ", getTotal()=" + getTotal() + "]";
	}
	

}
