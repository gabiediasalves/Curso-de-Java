package DoisControle;

public class WhileBreakContinue {
	public static void main(String[] args) {
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador ++;
			
			if(contador == 4) {
				break;
			}
			
			for (int i = 0; i < 10; i++) {
				if(i % 2 ==1) {
					continue;
				}
				System.out.println(i);
			}
		}
		
	}
}
