package Iniciante;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeracao, horas_trabalhadas;
		double valor_por_hora;
		
		System.out.println("Qual o número do funcionarios: ");
		numeracao = sc.nextInt();
		
		System.out.println("Quantas horas o funcionario trabalhou: ");
		horas_trabalhadas = sc.nextInt();
		
		System.out.println("Qual o valor recebido por hora: ");
		valor_por_hora = sc.nextDouble();
		
		double valor_recebido = horas_trabalhadas * valor_por_hora;
		
		System.out.println("numeração = " + numeracao);
		System.out.printf("Salario = U$ %.2f%n", valor_recebido );
		
		sc.close();
	}

}
