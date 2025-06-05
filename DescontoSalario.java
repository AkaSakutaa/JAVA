package AtvMarcelo14;
import java.util.Scanner;

public class DescontoSalario {
//4)_Cálculo de Salário Desenvolva um programa que calcule o salário líquido de um funcionário,
//considerando salário bruto, desconto do INSS (8%) e imposto de renda (15%).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario,INSS,impostorenda,desconto,novosalario;

        System.out.println("Informe seu salário: ");
        salario = scanner.nextDouble();

        INSS = 0.15;
        impostorenda = 0.08;
        desconto = (INSS + impostorenda) * salario;
        novosalario = salario - desconto;

        System.out.println("===Novo salário===");
        System.out.printf("Seu novo salário é %.2f", novosalario);

        scanner.close();
    }
}
