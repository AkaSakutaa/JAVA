package AtvMarcelo15;

import java.util.Scanner;

public class ClassNota {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
//3)_Decisão Encadeada (Classificação de Notas) Enunciado: Desenvolva um programa que leia a nota de um aluno (0 a 10) 
//e classifique seu desempenho conforme os critérios: A (9,0 a 10,0), B (7,0 a 8,9), C (5,0 a 6,9), D (3,0 a 4,9), F (0,0 a 2,9).
        double nota;

        System.out.println("Informe sua nota(0-10): ");
        nota = scanner.nextDouble();

        if (nota >= 9 && nota <= 10) 
        {
            System.out.println("Ótimo trabalho!! Obteve A na prova");
        } else if (nota >= 7 && nota <= 8.9) 
        {
            System.out.println("Bom trabalho!! Obteve B na prova");
        }else if (nota >= 5 && nota <= 6.9) 
        {
            System.out.println("Tem que melhorar!! Obteve C na prova");
        }else if (nota >= 3 && nota <= 4.9) 
        {
            System.out.println("Você estudou?? Obteve D na prova");
        }else if (nota >= 0 && nota <= 2.9) 
        {
            System.out.println("Você é um MERDA!! Obteve F na prova");
        }
        scanner.close();
    }
}