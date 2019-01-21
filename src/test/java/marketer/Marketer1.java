package marketer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Marketer1 {
	
	Marketer marketer = new Marketer("Scott");
	MarketerPay marketerPay = new MarketerPay();
	
	@Before
	public void setUp() throws Exception {
		marketer.setAnnualSalary(60000);
		marketer.setMonthSales(6000);
		marketer.setYTDSales(120000);
		marketer.setGoals(100000);
	}


	@Test
	public void testCalculateBasePay() {
		// Base Pay is the annual salary divided by 12, to get monthly salary
		double basePay = marketerPay.calculateBasePay(marketer);
		assertEquals(5000, basePay, 0.0);
	}

	@Test
	public void testCalculateComm() {
		// Marketer receives 1% Commission on sales for the month
		double comm = marketerPay.calculateComm(marketer);
		assertEquals(60, comm, 0.0);
	}

	@Test
	public void testCheckMetGoals() {
		// Check to see if Marketer has met goals for the year.
		assertTrue(marketerPay.hasMetGoals(marketer));
	}

	@Test
	public void testCalcBonus() {
		// Marketer receives 2% bonus on sales for the month if YTD Goals have been met
		double bonus = marketerPay.calculateBonus(marketer);
		assertEquals(120, bonus, 0.0);
	}
	
}
