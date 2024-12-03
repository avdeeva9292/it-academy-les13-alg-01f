package by.it_academy.algorithmization.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 1.0;
		int n = 15;
		double x1 = -2 * a;
		double step = a / 5;
		int count = 1;
		System.out.println("-----------------------------------------");
		System.out.printf("|%4s	|\t%4s\t|\t%4s\t|\n", "№", "x", "y");
		System.out.println("-----------------------------------------");

		for (double x = x1; x <= n; x += step) {
			double y;
			if (count <= n) {
				if (x <= 0) {
					y = a / 2 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
				} else {
					y = 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
				}
				System.out.printf("| %d	|\t%4.2f\t|\t%4.6f|\n", count, x, y);
				count++;
			}
		}
		System.out.println("-----------------------------------------");

	}

}
