package curso_nelio_orientacao_objeto;

import java.util.Scanner;

public class EntradaDadosComScannerParte2 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String s1 , s2 , s3 , s4;
		
		numero = scanner.nextInt();
		
		scanner.nextLine(); // Esse serve para consumir a quebra de linha depois de o numero ter sido digitado
		
		s1 = scanner.nextLine(); // Le a linha interira digitada
		s2 = scanner.nextLine();
		s3 = scanner.nextLine();
		
		s4 = scanner.next(); // Le somente uma palavra
		
		System.out.println("Dados digitados:");
		System.out.println(numero);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
