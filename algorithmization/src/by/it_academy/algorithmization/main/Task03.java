package by.it_academy.algorithmization.main;

public class Task03 {
	/*
	 * Составить программу для вычисления результат по формуле. В качестве входных
	 * параметров задать x = 0.5; n = 20;
	 */
	public static void main(String[] args) {
		double x = 0.5;
		double n = 20;
		double y;

		y = calcFormula(x, n);

		System.out.print(y);

	}

	public static double calcFormula(double x, double n) {
		double comp = 0.0;
		double sum = 0.0;
		double result;
		for (int k = 1; k <= n; k++) {
			comp = (Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2)) / Math.pow(Math.E, x - 1 / k);
			sum = sum + comp;

		}
		result = Math.sqrt(n * Math.PI) * sum;
		return result;
	}
}


	