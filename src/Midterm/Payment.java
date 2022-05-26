package Midterm;

public abstract class Payment {
	
	//Fields 
	protected double subtotal;
	protected double salesTax;
	protected double taxRate = .06;
	protected double total;
	
	//Constructor
	public Payment(double subtotal, double salesTax, double taxRate, double total) {
		this.subtotal = subtotal;
		this.salesTax = salesTax;
		this.taxRate = taxRate;
		this.total = total;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Payment [subtotal=" + subtotal + ", salesTax=" + salesTax + ", taxRate=" + taxRate + ", total=" + total
				+ "]";
	}
	
	
	//Gitters/Seters
	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	

}
