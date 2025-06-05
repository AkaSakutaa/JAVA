package AtvMarcelo14;

import java.util.Scanner;

public class InfDeProdut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//6)_Informações de Produto Desenvolva um programa que registre informações de um produto: 
//nome, preço unitário, quantidade em estoque, e calcule o valor total em estoque.
        int produto;

        System.out.print("Digite o numero do produto que deseja saber informações:\n 1.Mouse\n 2.Teclado\n");
        produto = scanner.nextInt();

        switch(produto) {
            case 1:
                System.out.println("Nome do produto: Mouse\n preço: R$10,00\n Quantidade no estoque: 500\n Valor do estoque: R$5000,00");
                break;
            case 2:
                System.out.println("Nome do produto: Teclado\n preço: R$20,00\n Quantidade no estoque: 1000\n Valor do estoque: R$20000,00");
                break;
            default:
                System.out.println("Número inválido. Digite de 1 a 2.");
        
        }
        scanner.close();
    }
}