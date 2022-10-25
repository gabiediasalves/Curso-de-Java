package DoisControle;

public class Switch {
	public static void main(String[] args) {
		String f = "branca";
		
		switch (f) {
		case "preta": case "rosa":
		System.out.println(1);
		break;
		case "branca":
			System.out.println(2);
		break;
		default: 
			System.err.println("Nao informado");
		}
		
	}
}
