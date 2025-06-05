package AtvMarcelo14;
import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capital, taxa, tempo, montante;

        System.out.print("Informe o capital inicial (R$): ");
        capital = scanner.nextDouble();

        System.out.print("Informe a taxa de juros (% ao mês ou ano): ");
        taxa = scanner.nextDouble();

        System.out.print("Informe o tempo (em meses ou anos, conforme a taxa): ");
        tempo = scanner.nextDouble();

        montante = capital + (capital * (taxa / 100) * tempo);

        System.out.printf("O montante após %.2f períodos será de R$%.2f%n", tempo, montante);

        scanner.close();
    }
}
