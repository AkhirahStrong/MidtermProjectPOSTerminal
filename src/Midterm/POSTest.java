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

}
