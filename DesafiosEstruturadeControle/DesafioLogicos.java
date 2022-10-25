package DesafiosEstruturadeControle;

public class DesafioLogicos {
	public static void main(String[] args) {
	
		boolean trab1 = true;
		boolean trab2 = true;
		
		boolean sorvete = trab1 || trab2;
		boolean tv50 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		
		System.out.println("A família irá tomar sorvete? " + sorvete );
		System.out.println("A família irá comprar uma TV de 50p? " + tv50);
		System.out.println("A familia irá comprar uma TV de 32p? " + tv32);
	}
}
