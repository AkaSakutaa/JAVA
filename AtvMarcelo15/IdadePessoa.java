package AtvMarcelo15;
import java.util.Scanner;

public class IdadePessoa {


    //atalho psvm escreve public static void main...
    public static void main(String[] args) {
        //chamar a biblioteca
        Scanner scanner = new Scanner(System.in);


        //print
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        //if = se
        if (idade >= 18) {
            //se digitar sout escreve automatico System.out...
            System.out.println("Maior de idade!");  
        } else if(idade >= 12) {
            System.out.println("Você é adolescente");
        } else if (idade <= 11) {
            System.out.println("Você é criança");
        }


        scanner.close();
    }
}
