package AtvMarcelo14;
import java.util.Scanner;
public class MediaCombustivel {
//5)_Consumo de Combustível Crie um programa que calcule o consumo médio de combustível de um veículo, 
//dados a distância percorrida e a quantidade de combustível gasta.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gasolina, KM;
        double media;

        System.out.println("Informe a quantidade de gasolina que colocou no veiculo(obs: apenas o número em Litros): ");
        gasolina = scanner.nextInt();

        System.out.println("Informe quantos KM o veiculo rodou: ");
        KM = scanner.nextInt();

        media = KM / gasolina;

        System.out.println("=====A média de litros por km=====");
        System.out.printf("a média de consumo foi %.2f KM/L", media);

        scanner.close();
    }
}
