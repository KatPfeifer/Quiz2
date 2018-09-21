package pkgQuiz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quiz2Test {

	@Test
	public void monthlyPaymentTest() {
		double CarCost=35000;
		double InterestRate=.10;
		double DownPayment=0;
		double LoanLength=60.0;
		Quiz2 monthpay= new Quiz2(CarCost, InterestRate, DownPayment, LoanLength);
		assertEquals(743.65, monthpay.monthlyPayment(), 0);
	}
	
	@Test
	public void monthlyPaymentTest2() {
		double CarCost=42000;
		double InterestRate=.045;
		double DownPayment=0;
		double LoanLength=60.0;
		Quiz2 monthpayment= new Quiz2(CarCost, InterestRate, DownPayment, LoanLength);
		assertEquals(783.01, monthpayment.monthlyPayment(), 0);
	}
	
	@Test
	public void totalInterestTest() {
		double CarCost=35000;
		double InterestRate=.10;
		double DownPayment=0;
		double LoanLength=60.0;
		Quiz2 monthlypay= new Quiz2(CarCost, InterestRate, DownPayment, LoanLength);
		assertEquals(9618.79, monthlypay.totalInterest(), 0);
	}
	
	@Test
	public void totalInterestTest2() {
		double CarCost=100000;
		double InterestRate=.06;
		double DownPayment=0;
		double LoanLength=120.0;
		Quiz2 monthlypay= new Quiz2(CarCost, InterestRate, DownPayment, LoanLength);
		assertEquals(33224.60, monthlypay.totalInterest(), 0);
	}
}
