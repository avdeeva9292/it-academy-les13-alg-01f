package by.it_academy.algorithmization.main;

public class Task08 {

	public static void main(String[] args) {

		double x1 = 0.1;
		double hx = 0.1;
		int n = 10;

		double x = x1;
		for (double i = x; i <= n; x += hx ) {
			double y = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
			System.out.printf("\t%4.2f\t|\t%4.5f|\n", x, y);
			if (y < 0) {
				break;
			}
		}
	}

}
	
