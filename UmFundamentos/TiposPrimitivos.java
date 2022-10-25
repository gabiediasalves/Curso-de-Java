package UmFundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 1_234_845_223;
		//long pontosAcumulados2 = 4_234_845_223L; 
		//coloca L quando passa do valor do long
	
		//Tipos numéricos reais
		float salario = 11_445; 
		//float salario2 = 11_445.44F; 
		//coloca F quando precisa colocar um literal dentro do float por causa do número quebrado
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//Tipos booleano
		boolean estaDeFerias = true;
		
		//Tipo caractere
		char status = 'A'; //'?', '2'
		//so pode colocar um caracter
		
		
		//Calculos
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//n° de viagens
		System.out.println(numeroDeVoos /2);
	
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}





