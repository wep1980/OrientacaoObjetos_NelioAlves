package curso_nelio_orientacao_objeto;

public class Casting {

	public static void main(String[] args) {

		
		double b , B , h , area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		
		//-----------------------------------------------------------
		
		int c , d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = (double) c / d; // Castinng para o valor mostrar a casa decimal
		
		System.out.println(resultado);
	}

}
