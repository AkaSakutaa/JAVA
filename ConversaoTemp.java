package AtvMarcelo14;

import java.util.Scanner;

public class ConversaoTemp {
//3)_Conversão de Temperatura
//Crie um programa que converta uma temperatura de Celsius para Fahrenheit e Kelvin.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double C,CparaF,CparaK;

        System.out.println("Informe a temperatura em Celsius: ");
        C = scanner.nextDouble();

        CparaF = (C * 9 / 5) + 32;
        CparaK = C + 273.15;

        System.out.println("=====Celsius para fahrenheit=====");
        System.out.printf("A conversão de %.0f graus para Fahrenheit é: %.2f F\n", C, CparaF);
        System.out.println("=====Celsius para Kelvin=====");
        System.out.printf("A conversão de %.0f graus para Kelvin é: %.2f K\n", C, CparaK);

        scanner.close();
    }
}
