package AtvMarcelo14;
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
//1)_Dados Pessoais Crie um programa que solicite ao usuário seu nome, idade e altura, 
//e exiba essas informações de forma formatada. (Nome, idade, altura)
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe sua altura em cm: ");
        double altura = scanner.nextDouble();

        System.out.println("\n===== Dados Informados =====");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura + " cm");

        scanner.close();
    }
}
