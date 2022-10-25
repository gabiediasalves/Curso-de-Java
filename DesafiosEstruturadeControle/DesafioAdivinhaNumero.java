package DesafiosEstruturadeControle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhaNumero {
	public static void main(String[] args) {
	
		int n = 10;
		Random gerador = new Random();
		Scanner entrada = new Scanner(System.in);
		int e = gerador.nextInt(100);
	
		for (int i = 0; i < 10; i++) {
			System.out.print( "Você tem " + n + " tentativas\n" + "Insira um número: ");
			double tentativa = entrada.nextDouble();
			
			if (tentativa == e) {
				System.out.println("Você acertou o número!" );
				break;
			}
			n--;
		}
		System.out.println("Obrigado por jogar!");

		entrada.close();
	}
}
