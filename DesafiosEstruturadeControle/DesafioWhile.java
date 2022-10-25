package DesafiosEstruturadeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double somaTotal = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Insira uma nota: ");
			nota = entrada.nextDouble();
			if(nota < -1 || nota > 10 || nota == 0) {
				System.out.println("Nota inválida");
			} else if (nota != -1) {
				somaTotal ++;
				total += nota;
			}
		}
		
		double media = total/somaTotal;
		
		System.out.printf("Total de notas: %f\n"
				+ "Quantidade de notas: %f\n"
				+ "Média das notas: %f", total, somaTotal, media);
		
		entrada.close();
	}
}
