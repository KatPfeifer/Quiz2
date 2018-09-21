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
	double Principal=CarCost-DownPayment;
	double MonthlyRate=InterestRate/12.0;
	double monthlyPay=(MonthlyRate*Principal)/(1-Math.pow(1+MonthlyRate,-1*LoanLength));
	monthlyPay=Math.round(monthlyPay*100.0)/100.0;
	return monthlyPay;
	}
	
	public double totalInterest() {
		double Principal=CarCost-DownPayment;
		double MonthlyRate=InterestRate/12.0;
		double payPerMonth = (MonthlyRate*Principal)/(1-Math.pow(1+MonthlyRate,-1*LoanLength));
		double totalInt= (payPerMonth*LoanLength)-Principal;
		totalInt=Math.round(totalInt*100.0)/100.0;
		System.out.println(totalInt);
		return totalInt;
	}
}