package AtvMarcelo15;

import java.util.Scanner;

public class NumMaior {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
//2)_Decisão Composta Enunciado: Crie um programa que leia dois números e determine qual é o maior.
//Se os números forem iguais, informe que são iguais.

        double num1,num2;

        System.out.println("Informe um número: ");
        num1 = scanner.nextDouble();

        System.out.println("Informe outro número: ");
        num2 = scanner.nextDouble();

        if (num1 > num2) 
        {
            System.out.printf("O número %.0f é maior que %.0f", num1, num2);
        } else if (num2 > num1) 
        {
            System.out.printf("O número %.0f é maior que %.0f",num2,num1);   
        }
        else if (num1 == num2) 
        {
            System.out.println("Os dois números são iguais!");
        }
        scanner.close();
    }
}
