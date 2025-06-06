package AtvMarcelo15;

import java.util.Scanner;

public class Main
{

   public static void Media3Notas(String[] args)
   {
       Scanner scanner = new Scanner(System.in);

       double nota1, nota2, nota3, media;

       System.out.println("Descubra a média do aluno e se ele está aprovado ou não");

       System.out.println("Digite a primeira nota:");
       nota1 = scanner.nextDouble();
       System.out.println("Digite a segunda nota");
       nota2 = scanner.nextDouble();
       System.out.println("Digite a terceira nota");
       nota3 = scanner.nextDouble();
       media = (nota1 + nota2 + nota3)/3;

       if (media >= 7.0){
           System.out.println("Aprovado");
       } else if ((media >= 5.0) || (media < 7.0)){
           System.out.println("Recuperação");
           double faltando = 7.0 - media;
           System.out.println("Faltam " + faltando +" pontos para ser aprovado");
       }
       if (media < 5.0){
           System.out.println("Reprovado");
       }
       System.out.println("A média é: " +media);
       scanner.close();
   }
}