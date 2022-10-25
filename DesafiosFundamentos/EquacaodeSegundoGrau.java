package DesafiosFundamentos;

import java.util.Scanner;

public class EquacaodeSegundoGrau {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();
		
		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();
		
		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();


		double b2 = Math.pow(b, 2);
		double delta =  b2 - 4 * a * c;

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("O x1 da equação é: %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
	
	
		scanner.close();
	}
}
