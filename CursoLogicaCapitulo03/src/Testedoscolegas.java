
import java.util.Scanner;

public class Testedoscolegas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para saber seu valor elevado ao quadrado: ");
		Double numero = scanner.nextDouble();
		
		System.out.printf("Número %.0f elevado ao quadrado é: %.0f ",numero, numero * numero);
		
		scanner.close();
	}
}