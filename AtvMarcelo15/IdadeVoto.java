package AtvMarcelo15;

import java.util.Scanner;

public class IdadeVoto
{

   public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);

       int idade;
       System.out.println("Digite sua idade para determinar se você deve votar:");
       idade = scanner.nextInt();

       if (idade < 16)
       {
           System.out.println("Não pode votar");
           } else if ((idade >= 18) && (idade <= 65)) {
           System.out.println("Voto obrigatório");
           }else{
           System.out.println("Voto facultativo");
       }
       scanner.close();
    }
}