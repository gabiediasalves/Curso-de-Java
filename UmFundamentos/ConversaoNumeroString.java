package UmFundamentos;

import java.util.Scanner;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Numero --> string
		Integer num = 100;
		System.out.println(num.toString().length());
		
		int num2 = 1000;
		System.out.println(Integer.toString(num2));
		
		
		
		//String --> numero
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite um número: ");
		String n1 = entrada.nextLine();
		
		System.out.print("\nDigite outro número: ");
		String n2 = entrada.nextLine();
		
		System.out.println( n1 + n2 );
		
		double num1 = Double.parseDouble(n1);
		double num3 = Double.parseDouble(n2);
		
		System.out.println(num1+num3);
		
		entrada.close();
	}
}
