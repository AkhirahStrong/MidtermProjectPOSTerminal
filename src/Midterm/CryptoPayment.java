package Midterm;

import java.util.Scanner;

public class CryptoPayment extends Payment{

	//Fields
	protected String walletAddress;
	protected String privateKey;
	
	
		public CryptoPayment(double subtotal, double salesTax, double taxRate, double total, String walletAddress, String privateKey) {
		super(subtotal, salesTax, taxRate, total);
		this.walletAddress = walletAddress;
		this.privateKey = privateKey;
	}


		
		//override toString()
		@Override
		public String toString() {
			return "CryptoPayment [walletAddress=" + walletAddress + ", privateKey=" + privateKey + "]";
		}
		
		

		
		
		//Methods
		
		//This method takes in user wallet address and validates the length of the string. 

		public static void walletAddress() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter your waller address");
			String address = scan.nextLine();
			
			if(address.length() < 10 || address.length() > 20) {
				System.out.println("Please inter a valid address.");
			}else if(address.length() <= 10 || address.length()<= 20){
				String key;
				
				System.out.println("Please enter your private key");
				 key = scan.nextLine();
				 if(key.length() < 10 || key.length()> 20) {
						System.out.println("Please inter a valid Key");
					}else {
					System.out.println("yes");
					}
			}
		}
		
		


		//getters / setters
		public String getWalletAddress() {
			return walletAddress;
		}


		public void setWalletAddress(String walletAddress) {
			this.walletAddress = walletAddress;
		}


		public String getPrivateKey() {
			return privateKey;
		}


		public void setPrivateKey(String privateKey) {
			this.privateKey = privateKey;
		}
		

}
