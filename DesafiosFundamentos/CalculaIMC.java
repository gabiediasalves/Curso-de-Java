package DesafiosFundamentos;

import java.util.Scanner;

public class CalculaIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		altura = Math.pow(altura, 2);
		
		double calcula = peso / altura;
		
		System.out.println("Seu IMC é: " + calcula);
		
		entrada.close();
	}
}
