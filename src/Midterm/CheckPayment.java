package Midterm;

//jack
import java.util.Scanner;

public class CheckPayment extends Payment {

	public CheckPayment(double subtotal, double salesTax, double taxRate, double total) {
		super(subtotal, salesTax, taxRate, total);

	}


@Override
	public void pay() {
		System.out.println("Please input a check number: ");
		Scanner scan = new Scanner(System.in);
		String checkNum;
		do {
			checkNum = scan.nextLine();

			if (checkNum.length() >= 3 && checkNum.length() <= 5) {
				System.out.println("Check number is accepted");
			} else {
				System.out.println("Error! Please enter a valid check ID number. (3-5 digits)");
			}

		} while (checkNum.length() < 3 || checkNum.length() > 5);
//		scan.close();
	}

}
