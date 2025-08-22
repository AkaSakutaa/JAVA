package estrutura_condicional;

import java.util.Scanner;

public class condicional_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		
		if (numero > 0){
			System.out.println("é positivo");	
		} else {
			System.out.println("é negativo");
		}
		sc.close();	
	}

}
