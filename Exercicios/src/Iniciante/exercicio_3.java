package Iniciante;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
		
		double diferenca = (A * B - C * D);
		
		System.out.println("o resultado da conta diferença é: " + diferenca);
		
		sc.close();
	}

}
