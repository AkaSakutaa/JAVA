package ex4Udemy;

import java.util.Locale;
import java.util.Scanner;


public class doWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
		System.out.print("Digete a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double Formula = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", Formula);
		System.out.print("Deseja repetir? (s/n)");
		resp = sc.next().charAt(0);
		
		} while (resp != 'n');
		sc.close();
		
	}

}
