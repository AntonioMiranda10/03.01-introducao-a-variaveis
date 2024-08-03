
import java.util.Scanner;

public class ExemploRodrigoAprovacao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Seja Bem Vindo ao sistema de notas \n\n");
		System.out.print("--------------------------------------------------------- \n\n");
		
		System.out.print("Digite o nome do Aluno : ");
		String NomeAluno = scanner.nextLine();
		
		System.out.print("---------------------------------- \n\n");
		System.out.println("Aluno: " + NomeAluno);
		System.out.print("---------------------------------- \n\n");
		
		System.out.print("Nota 1ª Prova : ");
		Double NotaAlunoProva1 = scanner.nextDouble();
		System.out.print("----------- \n\n");
		
		System.out.print("Nota 2ª Prova : ");
		Double NotaAlunoProva2 = scanner.nextDouble();
		System.out.print("----------- \n\n");
		
		System.out.print("Nota Trabalho: ");
		Double NotaTrabalho = scanner.nextDouble();
		System.out.print("----------- \n\n");

		Double MediaTotal = (NotaAlunoProva1 + NotaAlunoProva2 + NotaTrabalho)/3;
		
		
		System.out.println("Média Total: " + MediaTotal);
		System.out.print("----------- \n\n");
		
		Boolean Aprovado = MediaTotal > 70;
		
		if (Aprovado) {
			System.out.println(NomeAluno + " Foi Aprovado");			
		}
		else {
			System.out.println(NomeAluno + " Infelizmente não foi aprovado");
		}
		
		scanner.close();
		
		
	}

}