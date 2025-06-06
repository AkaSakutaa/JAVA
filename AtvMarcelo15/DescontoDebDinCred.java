package AtvMarcelo15;

import java.util.Scanner;

public class DescontoDebDinCred {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double valor;
       int opcao;
       int parcelas;
       double descontoDinheiro = 0.15;
       double descontoDebito = 0.10;
       double desconto2x = 0.05;
       double jurosMensal = 0.02;
       double valorParcela;
       double valorFinal;


       System.out.println("Digite o valor da sua compra:");
       valor = scanner.nextDouble();
       System.out.println("Agora digite a forma de pagamento: ");
       System.out.println("1 - À vista (dinheiro) com 15% de desconto");
       System.out.println("2 - À vista (cartão de débito) com 10% de desconto");
       System.out.println("3 - Parcelado em 2x com 5 de desconto");
       System.out.println("4 - Parcelado em 3x ou mais com 2% de juros ao mês");
       opcao = scanner.nextInt();

       if (opcao == 1){
           valorFinal = valor - (valor * descontoDinheiro);
           System.out.println("Desconto de 15% aplicado, o valor final ficou em: " + valorFinal);
        } else if (opcao == 2){
           valorFinal = valor - (valor * descontoDebito);
           System.out.println("Desconto de 10% aplicado, o valor final ficou em: " + valorFinal);
        } else if (opcao == 3){
           valorFinal = valor - (valor * desconto2x);
           System.out.println("Desconto de 5% aplicado, o valor final ficou em: " + valorFinal);
        } else if (opcao == 4){
           System.out.println("Digite o número de parcelas (minimo 3)");
           parcelas = scanner.nextInt();

           if (parcelas >=3){
               valorFinal = valor + (valor * jurosMensal * parcelas);
               valorParcela = valorFinal/parcelas;
               System.out.println("Compra realizada em " + parcelas + " vezes com juros");
               System.out.println("Valor final ficou em: " + valorFinal);
               System.out.println("Valor de cada parcela ficou em: " + valorParcela);
           } else{
               System.out.println("Forma de pagamento inválida");
           }
        }
       scanner.close();
   }
}
