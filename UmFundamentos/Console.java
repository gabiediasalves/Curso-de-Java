package UmFundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.printf("Salario: %.1f", 123.432);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("\nDigite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\n Nome: " + nome + " " + sobrenome);
		
		entrada.close();
	}
}
