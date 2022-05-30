package Midterm;

public abstract class Payment {
	
	//Fields 
	protected double subtotal;
	protected double salesTax;
	// should taxRate be a final variable?
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
	
	
	//Getters/Setters
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
		// added formula to calculate sales tax
		salesTax = getSubtotal() * getTaxRate(); 
		this.salesTax = salesTax;
	}

	public double getTaxRate() {
		return taxRate;
	}
	// should not need this setter as the tax rate is static
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		// added formula to calculate total
		total = getSubtotal() + getSalesTax();
		this.total = total;
	}
	
			
}
