package marketer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Marketer2 {

	Marketer marketer = new Marketer("Bob");
	MarketerPay marketerPay = new MarketerPay();

	@Before
	public void setUp() throws Exception {
		marketer.setAnnualSalary(42000);
		marketer.setMonthSales(2000);
		marketer.setYTDSales(20000);
		marketer.setGoals(30000);
	}
	
	@Test
	public void testCalculateBasePay() {
		// Base Pay is the annual salary divided by 12, to get monthly salary
		double basePay = marketerPay.calculateBasePay(marketer);
		assertEquals(3500, basePay, 0.0);
	}

	@Test
	public void testCalculateComm() {
		// Marketer receives 1% Commission on sales for the month
		double comm = marketerPay.calculateComm(marketer);
		assertEquals(20, comm, 0.0);
	}

	@Test
	public void testCheckMetGoals() {
		// Check to see if Marketer has met goals for the year.
		assertFalse(marketerPay.hasMetGoals(marketer));
	}

	@Test
	public void testCalcBonus() {
		// Marketer receives 2% bonus on sales for the month if YTD Goals have been met
		double bonus = marketerPay.calculateBonus(marketer);
		assertEquals(0, bonus, 0.0);
	}

}