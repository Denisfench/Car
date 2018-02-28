package CarTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Car;

class TestCar {

	@Test
	void test() {
		int iCarCost = 35000;
		int iDownPayment = 0;
		double dRate = 0.10;
		int iPmtCnt = 60;
		
		Car c = new Car(iCarCost, iDownPayment, dRate, iPmtCnt);
		
		assertEquals(9618.79, c.TotalspendOnInterest(), 0.01);
		assertEquals(743.65, c.MonthlyPayment(), 0.01);
	}

}
