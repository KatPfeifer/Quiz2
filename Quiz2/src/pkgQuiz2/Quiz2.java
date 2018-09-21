package pkgQuiz2;

public class Quiz2 {
	private double CarCost;
	private double InterestRate;
	private double DownPayment;
	private double LoanLength;
	
	public Quiz2(double CarCost, double InterestRate, double DownPayment, double LoanLength) {
		this.CarCost=CarCost;
		this.InterestRate=InterestRate;
		this.DownPayment=DownPayment;
		this.LoanLength=LoanLength;
	}
	
	public double monthlyPayment() {
	double Principle=CarCost-DownPayment;
	double MonthlyRate=InterestRate/12.0;
	double numerator = (((Math.pow(1+MonthlyRate, LoanLength))*MonthlyRate)*Principle);
	System.out.println(numerator);
	double denominator = (Math.pow(1+MonthlyRate, LoanLength))-1;
	System.out.println(denominator);
	double monthlyPay=numerator/denominator;
	System.out.println(monthlyPay);
	monthlyPay=Math.round(monthlyPay*100.0)/100.0;
	System.out.println(monthlyPay);
	return monthlyPay;
	}
	
	public double totalInterest() {
		double Principle=CarCost-DownPayment;
		double totalInt = monthlyPayment()-Principle;
		return totalInt;
	}
}