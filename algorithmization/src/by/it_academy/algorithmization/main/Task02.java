package by.it_academy.algorithmization.main;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Составить программу вычисления значений функции f(x) из задачи 1 для n
		 * значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
		 * проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в
		 * виде таблицы, в каждой строке порядковый номер, значение аргумента и значение
		 * функции с шестью знаками после запятой.
		 */
		int n = 10;
		double a = 0.5;
		double b = 1.0;
		double h;
		h = (b - a) / n;

		printTable(a, b, h);
	}

	public static void printTable(double a, double b, double h) {
		System.out.println("-----------------------------------------");
		System.out.printf("|%4s	|\t%4s\t|\t%4s\t|\n", "№", "x", "y");
		System.out.println("-----------------------------------------");

		int count = 1;
		for (double x = a; x <= b; x += h) {

			double y;
			y = Task01.calcFormula(x);

			System.out.printf("| %d	|\t%4.2f\t|\t%4.6f|\n", count, x, y);
			count++;
		}
		
		System.out.println("-----------------------------------------");

	}
}
