package AtvMarcelo15;

import java.util.Scanner;

public class ClassIdadePessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 2) {
            System.out.println("Você é um bebe!");  
        } else if(idade >= 3 && idade <= 11) {
            System.out.println("Você é criança!");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Você é adolescente");
        }else if (idade >= 18 && idade <= 29) {
            System.out.println("Você é um jovem adulto");
        }else if (idade >= 12 && idade <= 17) {
            System.out.println("Você é adolescente");
        }else if (idade >= 30 && idade <= 59) {
            System.out.println("Você é Adulto");
        }else if (idade >= 60) {
            System.out.println("Você é idoso");
        }

        scanner.close();
    }
}
