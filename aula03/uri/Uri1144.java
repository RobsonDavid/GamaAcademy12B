package uri;

import java.util.Scanner;

public class Uri1144 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean pwdOk;
        pwdOk = false;
        final int SENHA  = 2002;
        int mySenha;

        do {
            //System.out.print("Digite a senha: ");
            mySenha = teclado.nextInt();

            if (mySenha == SENHA){
                System.out.println("Acesso Permitido");
                pwdOk = true;
            } else {
                System.out.println("Senha Invalida");
            }

        } while (! pwdOk);
        
        teclado.close();
        
    }
}
