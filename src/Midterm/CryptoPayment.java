package Midterm;

import java.util.Scanner;

public class CryptoPayment extends Payment{

	 //Fields
		protected String walletAddress;
		
		
			public CryptoPayment(double subtotal, double salesTax, double taxRate, double total, String walletAddress) {
			super(subtotal, salesTax, taxRate, total);
			this.walletAddress = walletAddress;
		}


			
			//override toString()
			@Override
			public String toString() {
				return "CryptoPayment [walletAddress=" + walletAddress +  "]";
			}
			
			

			
			
			//Methods
			
			//This method takes in user wallet address as well as the private key to validates the length of the string. 

			public static void walletAddress() {
				Scanner scan = new Scanner(System.in);
				
				
				System.out.println("Please enter your wallet address:");
				String address = scan.nextLine();
				
				
				while(address.length() < 23 || address.length() > 35){
					
					
					if(address.length() < 23 || address.length() > 35) {
						System.out.println("Please enter a valid address:");
						address = scan.nextLine();
						}	
				}
				scan.close();
			}


			//getters / setters
			public String getWalletAddress() {
				return walletAddress;
			}
			
			public void setWalletAddress(String walletAddress) {
				this.walletAddress = walletAddress;
			}



			@Override
			public void pay() {
			
				
			}

		

}
