package AtvMarcelo14;

import java.util.Scanner;

public class DadosEstudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, curso;
        int matricula;
        double nota1, nota2, media;

        System.out.print("Informe o nome do estudante: ");
        nome = scanner.nextLine();

        System.out.print("Informe a matrícula: ");
        matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o curso: ");
        curso = scanner.nextLine();

        System.out.print("Digite sua primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("O aluno %s (matrícula %d) faz o curso de %s.%n", nome, matricula, curso);
        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close();
    }
}
