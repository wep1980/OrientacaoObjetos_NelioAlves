package curso_nelio_orientacao_objeto;

import java.util.Locale;

public class OperadoresComPorcento {

	public static void main(String[] args) {
		
		double valor = 10.35784;
		
		System.out.println(valor);
		System.out.printf("%.2f%n" , valor); // Valor apenas com 2 casas decimais
		System.out.printf("%.4f%n" , valor); // Valor apenas com 4 casas decimais
		
		/**
		 * como os valores estavam no padrao brasileiro onde o separador e a "," 
		 * com esse comando o separador passa a ser americano, ou seja se utiliza o "."
		 */
		Locale.setDefault(Locale.US); 
		System.out.printf("%.4f%n" , valor); 
		
		System.out.printf("Resultado = %.2f METROS%n" , valor);
		
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		
		/**
		 * %s para String
		 * %d para inteiro
		 * %f para ponto flutuante
		 */
		System.out.printf("%s tem %d anos e o salario é de R$ %.2f reais%n" , nome , idade , salario);

	}

}
