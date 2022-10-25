package DoisControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = ent.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
		}
		else if(media > 4.0 ) {
			System.out.println("Recuperação");
		} 
		else
			System.out.println("Reprovado");
		
		
		//outro exemplo
		System.out.print("Informe um numero: ");
		double n = ent.nextDouble();
		
		if(n % 2 == 0) {
			System.out.println("Par!");
		} else
		System.out.println("Ímpar!");
		
		ent.close();
	}
}
