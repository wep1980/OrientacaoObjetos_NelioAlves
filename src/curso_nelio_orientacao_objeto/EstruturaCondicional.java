package curso_nelio_orientacao_objeto;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner dadosEntrada =  new Scanner(System.in);
		
		int horario;
		
		System.out.println("Quantas horas?");
		horario = dadosEntrada.nextInt();
		
		if(horario < 12) {
			System.out.println("Bom dia");
		}else if(horario >= 12 && horario <= 18) {
				System.out.println("Boa tarde");
		}else {
				System.out.println("Boa noite");
			}
		
		//dadosEntrada.close();
		
		//-------------------------------------------------------------------------------------------
		
		Scanner dadosEntrada2 =  new Scanner(System.in);
		
		System.out.println("Digite o numero referente ao dia da semana : ");
		
		String diaSemana;
		int x = dadosEntrada2.nextInt();
		
		if(x == 1) {
			diaSemana = "Domingo";
		} else if(x == 2) {
			diaSemana = "Segunda";
		} else if(x == 3) {
			diaSemana = "Terça";
		} else if(x == 4) {
			diaSemana = "Quarta";
		} else if(x == 5) {
			diaSemana = "Quinta";
		} else if(x == 6) {
			diaSemana = "Sexta";
		} else {
			diaSemana = "Sabado";
		}
		
		System.out.println("O dia da semana é : " + diaSemana);
		
		//dadosEntrada2.close();
		
		//---------------------------------------------------------------------------------------------------------------------
		
        Scanner dadosEntrada3 =  new Scanner(System.in);
		
		System.out.println("Digite o numero referente ao dia da semana : ");
		
		
		int y = dadosEntrada2.nextInt();
		String dia;
		
		switch (y) {
		case 1:
			dia = "Segunda";
			break;
		case 2:
			dia = "Terça";
			break;
		case 3:
			dia = "Quarta";
			break;
		case 4:
			dia = "Quinta";
			break;
		case 5:
			dia = "Sexta";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
		
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("O dia da semana é : " + dia);
		
		//dadosEntrada3.close();
		
		//-----------------------------------------------------------------------------------------------------------
		
		
		/**
		 *  ( CONDIÇÃO ) ? VALOR SE VERDADEIRO : VALOR SE FALSO
		 *  ( 2 > 4 ) ? 50 : 80 = 80
		 *  ( 10 != 3 ) ? "MARIA" : "ALEX" = MARIA
		 */
		Scanner sc = new Scanner(System.in);
		
		double preco;
		double desconto;
		
		System.out.println("Digite o valor do preço com separador em virgula!");
		preco = sc.nextDouble();
		
		
		if(preco < 20.0) {
			desconto = preco * 0.1; // Desconto de 10% caso o preço seja menor que 20.0
		} else {
			desconto =  preco * 0.05; // // Desconto de 5% caso o preço seja menor que 20.0
		} 
		
		/**
		 * CONDICIONAL TERNARIA
		 */
		
		double desc = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	
		System.out.println("O valor do desconto é :" + desconto);
		System.out.println("O valor do desc é :" + desc);
		
		sc.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

