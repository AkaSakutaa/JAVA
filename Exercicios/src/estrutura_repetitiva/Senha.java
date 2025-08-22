package estrutura_repetitiva;

import java.util.Scanner;

public class Senha {

	private static double senha_Cofre;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double senha_Usuario;
		senha_Cofre = 2002;
		
		System.out.println("Digite a senha de 4 digitos para abrir o cofre: ");
		senha_Usuario = sc.nextDouble();
		
		while (senha_Usuario != senha_Cofre) {
			System.out.println("Senha incorreta");
			senha_Usuario = sc.nextDouble();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
