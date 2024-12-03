package by.it_academy.algorithmization.main;

public class Task01 {

	public static void main(String[] args) {
		double x = 0.5;
		double y;
		
		y = calcFormula(x);
		System.out.print(y);
	}

	public static double calcFormula(double x) {
		double y;
		
		y = (Math.sqrt(Math.pow(Math.E, 2.2 * x))) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
		return y;

	}

}
