package AtvMarcelo15;

import java.util.Scanner;

public class IMC {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double peso, altura, imc;

       System.out.println("Calculo de imc");

       System.out.println("Digite seu peso com vírgula: ");
       peso = scanner.nextDouble();
       System.out.println("Digite sua altura com vírgula: ");
       altura = scanner.nextDouble();
       imc = peso/(altura*altura);

       if(imc < 18.5){
           System.out.println(imc + " Abaixo do peso");
       } else if ((imc >= 18.5) && (imc < 25)){
           System.out.println(imc + " Peso normal");
       } else if ((imc >= 25) && (imc < 30)){
           System.out.println(imc + " Sobrepeso");
       } else if (imc <= 30){
           System.out.println(imc + " Obesidade");
       }
      scanner.close();
   }
}