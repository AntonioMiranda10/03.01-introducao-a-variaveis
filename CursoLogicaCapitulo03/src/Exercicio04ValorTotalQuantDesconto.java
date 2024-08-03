import java.util.Scanner;

public class Exercicio04ValorTotalQuantDesconto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do Produto: R$  ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: R$  ");
		Integer quantidadeProduto = scanner.nextInt();
		
      //  quantidadeProduto = 10;
		
		Boolean compraNoAtacado =  quantidadeProduto >= 10;
		
		Double desconto = 10.0;
		
		if (compraNoAtacado)  {
			
			Double subTotalAtacado = (valorProduto * quantidadeProduto)-(valorProduto * quantidadeProduto* desconto) / 100 ;
			System.out.println("O SubTotal dos Produtos no atacado: R$ " + subTotalAtacado);
			
		    } else {
				Double subTotalVarejo = valorProduto * quantidadeProduto;
				System.out.print("Valor Total dos Produtos: R$ " + subTotalVarejo);
		
		
		
		    }
		
		
		
	//	Double subTotal = valorProduto * quantidadeProduto;
	//	System.out.println("SubTotal dos Produtos: R$ " + subTotal);
		
	//	quantidadeProduto = 10;
		
	//	Boolean compraNoAtacado =  quantidadeProduto >= 10;
		
	//	Double desconto = 10.0;
		
	//	if (compraNoAtacado)  {
			
	//		Double subTotalAtacado = (subTotal * desconto / 100) - subTotal;
	//		System.out.println("O SubTotal dos Produtos no atacado: R$ " + subTotalAtacado);
			
	//	    } else {
	//			Double valorTotal = valorProduto * quantidadeProduto;
	//			System.out.print("Valor Total dos Produtos: R$ " + valorTotal);
				
	//		}
		//	Double precoAtacado = (valorProduto * desconto) / 100;
		//	System.out.print("SubTotal dos Produtos: R$ " + subTotal);
			
		//	Double subTotalAtacado = (SubTotal * 
	//	}
		
		
		
	//	Double subTotal = valorProduto * quantidadeProduto;
	//	System.out.print("SubTotal dos Produtos: R$ " + subTotal);
		
	//	Integer quantidadeAtacado = 10;
		
	//	Boolean compraNoAtacado =  quantidadeAtacado >= 10;
		
	//	if (compraNoAtacado) {
	//		Double subTotalAtacado = valorProduto * compraNoAtacado;
			
		scanner.close();
			
		}
		
		
	}
	

