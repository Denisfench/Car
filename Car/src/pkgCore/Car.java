package pkgCore;

public class Car {

	int CarCost = 35000;
	int DownPayment = 0;
	double InterestRate = 0.10;
	int Lengthofloan = 60;

	public  Car(int CarCost, int DownPayment, double InterestRate, int Lengthofloan) {
		this.CarCost = CarCost;
		this.DownPayment = DownPayment;
		this.InterestRate = InterestRate;
		this.Lengthofloan = Lengthofloan;

	}

	public double MonthlyPayment() {
		double C = ((CarCost * (InterestRate / 12)) / (1 - Math.pow((1 + (InterestRate / 12)), -Lengthofloan)));

		return C;

	}

	public double TotalspendOnInterest() {

		double C = ((MonthlyPayment() * Lengthofloan) - CarCost);
		return C;
	}

}
