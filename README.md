# The Hat Shop POS

The Hat Shop POS class project that allows customers to chose from an array of hats that is tracked by our inventory system.  

**How the POS Works**

1. Present a menu to the user and let them choose an item number.
2. Allow the user to choose a quantity for the item ordered.
3. Give the user a line total (item price * quantity).
4. Through separate question, allow them to re-display the menu and to complete the purchase.
5. We Ask for payment type—cash, credit, check, and Crypto currency. 
6. Once the receipt is displayed, the menu is redisplayed. 

As a group assignment, we were instructed to Write a cash register or self-service terminal for a fictitious retail location. 

**Special Features** 
What makes our code different is that we decided to modernize our POS system, and chose to accept Crypto Currency as a payment option.  We also added loyalty points for returning customers. 

**Special Functions**

This function allows the customer to add loyalty points for future discounts. 

```
public static void loyaltyCard() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your customer loyalty card number:");
		String cardNum = scan.nextLine();
		System.out.println("The points you've earned today will print on your receipt!");
		}
```

This function allows customers to use digital currency.

```
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
```








