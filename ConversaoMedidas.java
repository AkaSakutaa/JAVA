package AtvMarcelo14;

import java.util.Scanner;

public class ConversaoMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//8)_Conversão de Medidas Desenvolva um programa que converta
//uma medida em metros para centímetros, milímetros e quilômetros.

        double MparaKm,M,MparaCm,MparaMl;

        System.out.println("Informe uma medida em metros que vamos converter Km,Cm E Ml: ");
        M = scanner.nextDouble();

        MparaKm = M / 1000;
        MparaCm = M * 100;
        MparaMl = M * 1000;

        System.out.printf("A conversão de metros para km é %.2f km =  %.2f metros \n", MparaKm, M);
        System.out.printf("A conversão de metros para km é %.2f cm =  %.2f metros \n", MparaCm, M);
        System.out.printf("A conversão de metros para km é %.2f ml =  %.2f metros \n", MparaMl, M);

        scanner.close();
    }
}
