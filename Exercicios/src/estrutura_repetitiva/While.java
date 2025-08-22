package estrutura_repetitiva;

import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("digite um numero:");
		numero = sc.nextDouble();
		
		double soma = 0;
		while (numero != 0) {
			soma = soma + numero;
			numero = sc.nextDouble();
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
