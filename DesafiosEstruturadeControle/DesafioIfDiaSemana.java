package DesafiosEstruturadeControle;

import java.util.Scanner;

public class DesafioIfDiaSemana {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String day = ent.next();
		
		if(day.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (day.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (day.equalsIgnoreCase("terça") 
				|| day.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if (day.equalsIgnoreCase("quarta")) {
		System.out.println(4);
		} else if (day.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (day.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (day.equalsIgnoreCase("sábado") 
				|| day.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido! ");
		}
			
		ent.close();
	}
}
