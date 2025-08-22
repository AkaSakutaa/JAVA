package Iniciante;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		
		
		System.out.println("Qual o raio do circulo? ");
		raio = sc.nextDouble();
		
		double area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A área do circulo é: %.4f%n", area);
		
		sc.close();
	}
}
