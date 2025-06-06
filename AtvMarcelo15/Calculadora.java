package AtvMarcelo15;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int op;

        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
         num2 = scanner.nextInt();
        System.out.println("Agora digite o tipo de operação: 1 = +, 2 = -, 3 = *, 4 = /");
        op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;

        }
        scanner.close();
    }
}