package Midterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class POSTest {

	@Test
	void changeTest() {
		CashPayment test = new CashPayment(0, 0, 0, 20);
		double expected = 11;
		double result = test.changeBack(31);
		assertEquals(expected, result);
		
	}
	@Test
	void changeTest2() {
		CashPayment test = new CashPayment(11, 45, 32, 55);
		double expected = 45;
		double result = test.changeBack(100);
		assertEquals(expected, result);
		
	}
	@Test
	void walletAddressTest1() {
		CryptoPayment test1 = new CryptoPayment(0, 0, 0, 0, "12345678901234567890123456");
		String expected = "12345678901234567890123456";
		String result = test1.walletAddress;
		assertEquals(expected, result);
		
	}
	@Test
	void walletAddressTest2() {
		CryptoPayment test2 = new CryptoPayment(0, 1, 2, 3, "12345678901234567890123456");
		String expected = "12345678901234567890123456";
		String result = test2.walletAddress;
		assertEquals(expected, result);
		
	}
	
	

}
