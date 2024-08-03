import java.util.Scanner;

public class Exercicio01Quadradodeumnumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
						
		System.out.print("Digite um número: ");
		Double NumeroDigitado = scanner.nextDouble();
		
		System.out.println("O Quadrado do número " + NumeroDigitado + " é: " + (NumeroDigitado) * (NumeroDigitado));
				
		scanner.close();
		
		
		
	}
	
	
	
}
