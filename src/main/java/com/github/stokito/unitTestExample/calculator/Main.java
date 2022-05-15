package com.github.stokito.unitTestExample.calculator;



import java.util.Scanner;

public class Main {
	public static void main(
			String[] args) {
		Calculator obj = new Calculator();
		Scanner sc = new Scanner(
				System.in);
		System.out.print(
				"Введите число a: ");
		int a = sc.nextInt();
		System.out.print(
				"Введите число b : ");
		int b = sc.nextInt();
		System.out.println(
				"\nВыберите действие(1-сложение,2-вычетание,3-умножение,4-деление):");
		int k = sc.nextInt();
		System.out.print(
				"\nРезультат:");
		switch (k) {
		case (1):
			System.out.println(a
					+ "+" + b
					+ "="
					+ obj.sum(a, b));
			break;
		case (2):
			System.out.println(a
					+ "-" + b
					+ "="
					+ obj.minus(a,
							b));
			break;
		case (3):
			System.out.println(a
					+ "*" + b
					+ "="
					+ obj.multiply(
							a,
							b));
			break;
		case (4):
			System.out.print(a
					+ "/" + b
					+ "="
					+ obj.divide(
							a,
							b));
			break;
		}
		System.out.print("\n");
	}
}
