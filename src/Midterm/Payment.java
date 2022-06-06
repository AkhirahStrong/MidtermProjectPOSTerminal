package Midterm;

public abstract class Payment {

	// Fields
	protected double subtotal;
	protected double salesTax;
	protected double taxRate = .06;
	protected double total;

	public abstract void pay();

	// Constructor
	public Payment(double subtotal, double salesTax, double taxRate, double total) {
		this.subtotal = subtotal;
		this.salesTax = salesTax;
		this.taxRate = taxRate;
		this.total = total;
	}

	// Getters
	public double getSubtotal() {
		return subtotal;
	}

	public double getSalesTax() {

		return salesTax;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public double getTotal() {
		return total;
	}

	// ToString
	@Override
	public String toString() {
		return "Payment [subtotal=" + subtotal + ", salesTax=" + salesTax + ", taxRate=" + taxRate + ", total=" + total
				+ "]";
	}

}
