import java.util.Scanner;

public class TipoTexto {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			String mensagemSaudacao = "Olá, seja bem vindo!";
			System.out.println(mensagemSaudacao);
			
			System.out.print("Digite seu nome: ");
			String nome = scanner.nextLine();

			System.out.print("Digite sua idade: ");
			Integer idade = scanner.nextInt();

			System.out.print("Digite seu sexo: ");
			Character sexo = scanner.next().charAt(0);

			System.out.println("Confira seus dados");
			System.out.println("nome: " + nome);
			System.out.println("idade: " + idade);
			System.out.println("sexo: " + sexo);
			
			String mensagemFinal = "Obrigado pela sua confirmação!";
			System.out.println(mensagemFinal);
			
			scanner.close();
			
				
		}
	
}
