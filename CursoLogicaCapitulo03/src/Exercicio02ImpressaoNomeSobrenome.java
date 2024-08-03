import java.util.Scanner;

public class Exercicio02ImpressaoNomeSobrenome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome + "!");
		
		scanner.close();
	}
	
}

