package AtvMarcelo14;
import java.util.Scanner;

public class RetanguloMedidas {
    public static void main(String[] args) {
//2)_Calculadora de Área de Retângulo
//Desenvolva um programa que leia a largura e altura de um retângulo e calcule sua área e perímetro. (retângulo)
        Scanner scanner = new Scanner(System.in);

        double altura, largura, area, perimetro;

        System.out.println("Informe a largura do retângulo: ");
        largura = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo: ");
        altura = scanner.nextDouble();

        perimetro = 2 * (largura + altura);
        area = largura * altura;
       
        System.out.println("\n=====Detalhes da área e perímetro=====");
        System.out.printf("A área é: %.0f Metros\n", area);
        System.out.printf("O perímetro é: %.0f Metros\n", perimetro);
        
        scanner.close();
    }
}
