import java.util.Scanner;

public class Exercicio05ConstanteApDeAno {

	static final Integer NOTA_PARA_PASSAR_DE_ANO = 70;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do Aluno: ");
		String nomeAluno = scanner.nextLine();
		
		System.out.print("Digite a nota do Aluno: ");
		Integer notaAluno = scanner.nextInt();
		
		//Boolean passouDeAno = true;
		//System.out.println("Sim, o Aluno: " + nomeAluno + " Está aprovado");
		
		//Boolean naoPassouDeAno = false;
		//System.out.println("Não, o Aluno: " + nomeAluno + " Está reprovado");
				
		//Integer notaParaPassar = 70;
		
		Boolean aprovacao = notaAluno >= NOTA_PARA_PASSAR_DE_ANO;
		
			if(aprovacao) {
				System.out.println("Sim, o Aluno: " + nomeAluno + " Está aprovado");	
			}
			else {
				System.out.println("Não, o Aluno: " + nomeAluno + " Está reprovado");
			}
		
			scanner.close();
		
			//sysout		
		//System.out.print("Digite a nota: ");
		
	}
}
