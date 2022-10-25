package DesafiosEstruturadeControle;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		
		System.out.print("Digite a operação que deseja executar: ");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? n1 + n2 : 0;
		resultado = "-".equals(operador) ? n1 - n2: resultado;
		resultado = "*".equals(operador) ? n1 * n2: resultado;
		resultado = "/".equals(operador) ? n1 / n2: resultado;
		resultado = "%".equals(operador) ? n1 % n2: resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, operador, n2, resultado);
		entrada.close();
	}
}
