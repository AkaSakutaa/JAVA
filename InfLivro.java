package AtvMarcelo14;

import java.util.Scanner;

public class InfLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
//10)_Informações de LivroDesenvolva um programa que colete informações de um livro: 
//título, autor, ano de publicação, número de páginas, e preço, exibindo um relatório formatado.
        String titulo,autor;
        double paginas,ano,preco;

        System.out.println("Informe o titulo do livro: ");
        titulo = scanner.nextLine();

        System.out.println("Informe o autor do livro: ");
        autor = scanner.nextLine();

        System.out.println("Informe o ano de publicação: ");
        ano = scanner.nextDouble();

        System.out.println("Quantas paginas tem o livro? ");
        paginas = scanner.nextDouble();

        System.out.println("Informe o preço do livro: ");
        preco = scanner.nextDouble();

        System.out.println("======Relatório do livro======");
        System.out.printf("Titulo do livro: %s \n", titulo);
        System.out.printf("Autor do livro: %s \n", autor);
        System.out.printf("Ano do livro: %.0f\n", ano);
        System.out.printf("Total de paginas:  %.0f\n", paginas);
        System.out.printf("Preço do livro: R$ %.2f\n", preco);

        scanner.close();
    }
}
