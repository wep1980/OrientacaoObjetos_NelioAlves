package curso_nelio_orientacao_objeto;

import java.util.Scanner;

public class EntradaDadosComScanner {
	
	public static void main(String[] args) {
		
		String palavra;
		int numeroInteiro;
		double numeroDecimal;
		char caracter;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra!");
		palavra = scanner.next();
		System.out.println("Voce digitou a palavra : " + palavra + "\n");
		
		System.out.println("Digite um numero inteiro!");
		numeroInteiro = scanner.nextInt();
		System.out.println("Voce digitou o numero inteiro : " + numeroInteiro + "\n");
		
		/**
		 * Se o numero decimal for inserido com PONTO ocorrera um erro
		 * O numero deve ser inserido com VIRGULA pois ele pega a localidade do brasil, que utiliza a VIRGULA como separador de casa decimal.
		 * 
		 * Com o Locale.setDefault(Locale.US); o padrao de separacao de casa decimal passa a ser americano, ou seja se utiliza o PONTO
		 * e o separador passa a ser o brasileiro, ou seja, a VIRGULA
		 * Locale.setDefault(Locale.US); -> COLOCAR ANTES DO SCANNER
		 * System.out.println("Voce digitou: %.2f%n" , numeroDecimal);
		 */
		System.out.println("Digite um numero decimal, caso o codigo esteja no padrao local(BRASIL) o separador de ser a VIRGULA");
		numeroDecimal = scanner.nextDouble();
		System.out.println("Voce digitou o numero decimal : " + numeroDecimal + "\n");
		
		System.out.println("Digite um caracter : ");
		caracter = scanner.next().charAt(0); // Pega o primeiro caracter da String
		System.out.println("Voce digitou o caracter : " + caracter);
		
		
		
		
		scanner.close();
		
	}

}
