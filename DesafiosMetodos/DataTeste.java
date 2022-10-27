package DesafiosMetodos;

public class DataTeste {
	public static void main(String[] args) {
		Data day = new Data();
		day.dia = 5;
		day.mes = 3;
		day.ano = 1998;
		
		Data day2 = new Data();
		day2.dia = 15;
		day2.mes = 12;
		day2.ano = 1991;
		
		System.out.println(day.dia + "/" + day.mes + "/" + day.ano);
		System.out.println(day2.dia + "/" + day2.mes + "/" + day2.ano);
	}
}
