package sample;


public class Calculator {

	double num1 = 0;
	double num2 = 0;

	public Calculator(int i, int j) {
		this.num1 = i;
		this.num2 = j;
	}

	public double add() {
		return num1 + num2;
	}

	public double div() {
		// BigDecimal bi = new BigDecimal(String.valueOf(num1 / num2));
		// return bi.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return num1 / num2;
	}
}
