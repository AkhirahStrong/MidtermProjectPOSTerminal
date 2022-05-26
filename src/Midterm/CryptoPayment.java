package Midterm;

import java.util.Scanner;

public class CryptoPayment {
	// Akhirah
	
	
		//Fields
		protected String walletAddress;
		protected String privateKey;
		
		
		//constructor
		public CryptoPayment(String walletAddress, String privateKey) {
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
		public static String walletAddress() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter your waller address");
			String address = scan.nextLine();
			String keyReturn = privateKey();
			
			if(address.length() >= 10 || address.length()> 20) {
				return "The walet address you entered is invalet (not enough characters)";
			}else if(address.length() < 10 || address.length()<= 20){
				return keyReturn;
			}else {
				scan.close();
			return address;
			}
		}
		
		//This method takes in user private key and validates the length of the string.
		public static String privateKey() {
			String key;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your private key");
			 key = scan.nextLine();
			if(key.length() < 10 || key.length()> 20) {
				return "The private key you entered is invalet (the length is incorrect)";
			}else {
			return key;
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
