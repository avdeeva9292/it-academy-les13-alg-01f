package by.it_academy.algorithmization.main;

public class Task07 {

	public static void main(String[] args) {
		int n = 2;
		int m = 3;
		double x1 = 1.0;
		double stepx = 0.3;
		double z1 = 1.0;
		double stepz = 0.2;
		double result;
		for (double x = x1; x <= n; x += stepx) {
			for (double z = z1; z <= m; z += stepz) {
				if (Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2) != 0) {

					result = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z)
							+ Math.abs(Math.log(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2);
					System.out.printf("|%.1f| %.1f| %.5f| %n", x, z, result);
				}
			}
		}
	}
}
