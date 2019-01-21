package marketer;

public class MarketerPay {

	public double calculateBasePay(Marketer marketer) {
		double basePay = 0;
		basePay = marketer.getAnnualSalary() / 12;
		return basePay;
	}

	public double calculateComm(Marketer marketer) {
		double comm = 0;
		comm = marketer.getMonthSales() * .01;
		return comm;
	}

	public double calculateBonus(Marketer marketer) {
		double bonus = 0;
		if (hasMetGoals(marketer) == false) {
			bonus = 0;
		} else {
			bonus = marketer.getMonthSales() * .02;
		}
		return bonus;

	}

	public boolean hasMetGoals(Marketer marketer) {
		double YTDSales = marketer.getYTDSales(); 
		double goals = marketer.getGoals();
		//System.out.println(marketer.getName());
		//System.out.println("YTD Sales: " + YTDSales);
		//System.out.println("Goals: " + goals);
		if ( YTDSales >= goals)  {
			//System.out.println("Goals have been met.");
			return true;
		} else {
			//System.out.println("Goals have not been met.");
			return false;
		}
	}

}
