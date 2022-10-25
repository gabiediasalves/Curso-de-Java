package UmFundamentos;

public class ConversaoTipoP {
	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.233;
		System.out.println(b); // explicita (cast)
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}
}
