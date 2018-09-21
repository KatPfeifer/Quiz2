package pkgQuiz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quiz2Test {

	@Test
	public void monthlyPaymentTest() {
		double CarCost=35000;
		double InterestRate=10;
		double DownPayment=0;
		double LoanLength=60.0;
		Quiz2 monthpay= new Quiz2(CarCost, InterestRate, DownPayment, LoanLength);
		assertEquals(743.65, monthpay.monthlyPayment(), 0);
	}
}
