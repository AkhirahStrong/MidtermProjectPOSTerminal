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

}
