package sample;

public class Calculator {

	int num1 = 0;
	int num2 = 0;

	public Calculator(int i, int j) {
		this.num1 = i;
		this.num2 = j;
	}

	public int add() {
		return num1 + num2;
	}
}
