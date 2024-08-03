import java.util.Scanner;

public class IntroducaoVariaveis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o Valor do Produto: ");
		
		Double ValorProduto = scanner.nextDouble();
		
		System.out.println("Valor do produto: " + ValorProduto);
		
		Double ValorProdutoComFrete = ValorProduto + 2;
		
		System.out.println("Valor do produto com frete: " + ValorProdutoComFrete);
		
		scanner.close();
	}
}
