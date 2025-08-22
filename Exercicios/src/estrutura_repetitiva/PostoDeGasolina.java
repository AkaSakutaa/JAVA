package estrutura_repetitiva;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int decisao;
		
		System.out.println("Bem vindo ao posto de gasolina");
		System.out.println("----DISPONBILIDADE----\n"
				+ "1.Alcool\n"
				+ "2.Gasolina\n"
				+ "3.Diesel\n"
				+ "4.fim\n");
		decisao = sc.nextInt();
		
		while (decisao != 4) {
			if (decisao == 1) {
					alcool = alcool + 1;
			} 
			else if (decisao == 2) {
					gasolina = gasolina + 1;
			} 
			else if (decisao == 3) {
					diesel = diesel + 1;
			}	
			
			decisao = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("alcool: " + alcool);
		System.out.println("gasolina: " + gasolina);
		System.out.println("diesel: " + diesel);
			
		sc.close();
	}
}
