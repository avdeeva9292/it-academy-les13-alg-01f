package by.it_academy.algorithmization.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите количество точек: ");
		int n = sc.nextInt();

		int count = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Введите координату точки  х: ");
			double x = sc.nextDouble();
			System.out.print("Введите координату точки  у: ");
			double y = sc.nextDouble();

			
			boolean inSquare = (x >= -2 && x <= 0) && (y >= 0 && y <= 2) || (x >= 0 && x <= 2) && (y >= -1 && y <= 1);

			if (inSquare) {
				count++;
			}
		
		}
		System.out.println("Количество точек, попавших в заданные квадраты: " + count);
	}

}