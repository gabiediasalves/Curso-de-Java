package DoisControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		String word = "";
		
		while (!word.equals("sair")) {
			System.out.print("Digite sair para finalizar o programa: ");
			word = ent.nextLine().toLowerCase();
		}
		System.out.println("Fim");
			ent.close();
	}
}
