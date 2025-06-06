package AtvMarcelo15;

import java.util.Scanner;

public class Senha3Usuario {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       String usuario1 = "admin1";
       String senha1 = "1234";

       String usuario2 = "user2";
       String senha2 = "abcd";

       String usuario3 = "cliente3";
       String senha3 = "senha321";

       int tentativas = 0;
       boolean acessoConcedido = false;

       while (tentativas < 3 && !acessoConcedido) {
           System.out.print("Digite seu usuário: ");
           String usuarioDigitado = scanner.nextLine();

           System.out.print("Digite sua senha: ");
           String senhaDigitada = scanner.nextLine();
          
           if ((usuarioDigitado.equals(usuario1) && senhaDigitada.equals(senha1)) ||
                   (usuarioDigitado.equals(usuario2) && senhaDigitada.equals(senha2)) ||
                   (usuarioDigitado.equals(usuario3) && senhaDigitada.equals(senha3))) {

               System.out.println("Boas vindas, " + usuarioDigitado + "!");
               acessoConcedido = true;

           } else {
               tentativas++;
               System.out.println("Usuário ou senha inválidos. Tentativas restantes: " + (3 - tentativas));
           }
       }

       if (!acessoConcedido) {
           System.out.println("Acesso bloqueado após 3 tentativas falhas.");
       }

       scanner.close();
   }
}
