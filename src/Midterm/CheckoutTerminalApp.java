package Midterm;

public class CheckoutTerminalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Products.productList();
		CashPayment test = new CashPayment(0, 0, 0, 20);
		test.change();
	}

}
