package UmFundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia";
		s = s.replace("dia", "almoço");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Leo".toUpperCase());
		
		
		String y = "Boa noite"
				.replace("noite", "Tarde")
				.toUpperCase()
				.concat("!!!")
				;
		System.out.println(y);
		System.out.println(y.length());
		System.out.println(y.toLowerCase().startsWith("noite"));
		
		var nome = "Gabi";
		var sobrenome = "Alves";
		
		System.out.println("Nome:" + nome + "\nSobrenome: " + sobrenome + "\n\n");
		System.out.printf("Meu nome é %s e meu sobrenome é %s", nome, sobrenome);
	}

}
