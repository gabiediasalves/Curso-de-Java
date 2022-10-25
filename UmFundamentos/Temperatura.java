package UmFundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double dif = 32;
		final double multi = 5/9.0;
		
		double f = 86;
		double conversao = (f - dif) * multi;
		System.out.println("A conversão da temperatura é: " 
		+ conversao + " °C");

		 f = 478;
		 conversao = (f - dif) * multi;
		System.out.println("A conversão da temperatura é: " 
				+ conversao + " °C");
	}
}
