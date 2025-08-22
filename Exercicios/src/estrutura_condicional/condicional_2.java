package estrutura_condicional;

import java.util.Scanner;

public class condicional_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double numero;
		
		System.out.println("Digite um número para saber se é par ou impar: ");
		numero = sc.nextDouble();
		
		if (numero % 2 == 0) {
			System.out.println("é par");
		} else {
			System.out.println("é impar");
		}
		
		sc.close();
	}

}
