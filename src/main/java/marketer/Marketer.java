package marketer;

public class Marketer {
	
	private String name; 
	private double annualSalary; 
	private double YTDSales; 
	private double monthSales; 
	private double goals;
	
	public Marketer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marketer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getYTDSales() {
		return YTDSales;
	}

	public void setYTDSales(double YTDSales) {
		this.YTDSales = YTDSales;
	}

	public double getMonthSales() {
		return monthSales;
	}

	public void setMonthSales(double monthSales) {
		this.monthSales = monthSales;
	}
	public double getGoals() {
		return goals;
	}

	public void setGoals(double goals) {
		this.goals = goals;
	}
	
	
	

}
