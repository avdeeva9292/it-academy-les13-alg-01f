package by.it_academy.algorithmization.main;

public class Task06 {

	public static void main(String[] args) {

		int a = 3 * (int) Math.pow(10, 3);
		int b = 6 * (int) Math.pow(10, 4);
		int m = 4;

		int t1 = (int) Math.sqrt(a + b + m);
		int t2 = m * (int) Math.sqrt(a + b);
		int t3 = (int) Math.sqrt(a * b * m);
		int t4 = m * (int) Math.sqrt(a * b);

		int n = 20;
		int k1 = -30;
		int k2 = 60;
		int count = 1;

		System.out.print("Значения, которые удовлетворяют заданному условию: ");
		System.out.println();
		for (int k = k1; k <= k2; k += (k2 - k1) / n) {
			int f = k * k * k - 25 * k * k + 50 * k + 1000;
			if (f >= t1 & f <= t2 || f >= t3 & f <= t4) {
				System.out.println(count + " " + f);
				count++;
				if (count == n) {
					return;
				}
			}

		}
		System.out.print("В заданном интервале значений не удовлетворяющих условию: " + (n - count + 1));
	}
}
