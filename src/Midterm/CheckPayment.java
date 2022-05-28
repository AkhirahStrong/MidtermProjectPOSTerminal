package Midterm;

//jack
import java.util.Scanner;

public class CheckPayment extends Payment {

	public CheckPayment(double subtotal, double salesTax, double taxRate, double total) {
		super(subtotal, salesTax, taxRate, total);

	}



	public void check() {
		System.out.println("Please input a check number: ");
		Scanner scan = new Scanner(System.in);
		String checkNum;
		do {
			checkNum = scan.nextLine();

			if (checkNum.length() >= 3 && checkNum.length() <= 5) {
				System.out.println("Thank you for your business!");
			} else {
				System.out.println("Error! Please enter a valid check ID number. (3-5 digits)");
			}

		} while (checkNum.length() < 3 || checkNum.length() > 5);
		scan.close();
	}

}
