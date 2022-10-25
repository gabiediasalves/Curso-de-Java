package DesafiosEstruturadeControle;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro salário: ");
		String n1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("/n Digite o valor do segundo salário: ");
		String n2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("/n Digite o valor do terceiro salário: ");
		String n3 = entrada.nextLine().replace(",", ".");
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double num3 = Double.parseDouble(n3);
		
		System.out.println(num1 + num2 + num3);
		System.out.println("A média dos salários são: " + num1 + num2 + num3 /3);
		
		
		entrada.close();
	}
}
