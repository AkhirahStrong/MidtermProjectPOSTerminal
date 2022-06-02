package Midterm;

import java.util.Scanner;

//implemented initial methods and fields + getters n setters
public class CashPayment extends Payment {

	protected double amountTendered;
	protected double changeDue;

	
	public CashPayment(double subtotal, double salesTax, double taxRate, double total) {
		super(subtotal, salesTax, 0.06, total);

	}
	
	public void change() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cash amount:");
		double amountTendered = scan.nextDouble();
		changeBack(amountTendered);
		System.out.println("Your change due is: $" + changeDue);
//		scan.close();
	}
	
	// Method: take amount of money and give change
	public double changeBack(double amountTendered) {
		changeDue = amountTendered - getSubtotal();

		return changeDue;

	}

	public double getAmountTendered() {
		return amountTendered;
	}

	public void setAmountTendered(double amountTendered) {
		this.amountTendered = amountTendered;
	}

	public double getChangeDue() {
		return changeDue;
	}

	public void setChangeDue(double changeDue) {
		this.changeDue = changeDue;
	}


	
}
