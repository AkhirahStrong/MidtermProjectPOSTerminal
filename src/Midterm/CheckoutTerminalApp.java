package Midterm;

public class CheckoutTerminalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Products.productList();
		CashPayment test = new CashPayment(0, 0, 0, 20);
		//test.change();
		CheckPayment cheque = new CheckPayment(85, 77, 88, 99);
		cheque.check();
		

//		CryptoPayment pay = new CryptoPayment("1234567890", "ahky1234564578");
//		System.out.println(pay);
		
	//	CryptoPayment.walletAddress();


	}

}
