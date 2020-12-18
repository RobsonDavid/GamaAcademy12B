package exercicios.Exercicio03old;

public class AppConta {
    public static void main(String[] args) {
        System.out.println("<<App Conta >>");

/*         Conta conta123 = new Conta("12000000000123");
        conta123.depositar(3);
        conta123.sacar(1);
        System.out.println(conta123);
        
        Conta conta456 = new Conta("12000000000456", 12);
        System.out.println(conta456); 
        conta456.depositar(8);
        System.out.println(conta456); 
        conta456.depositar(134);
        System.out.println(conta456); 
        conta456.sacar(500);
        System.out.println(conta456); */ 

        // CONTA CORRENTE
/*         ContaCorrente conta788 = new ContaCorrente("00788");
        System.out.println(conta788);
        conta788.depositar(50);
        System.out.println(conta788);
        conta788.sacar(25);
        System.out.println(conta788);
        conta788.sacar(125);
        System.out.println(conta788); */  
 

        // CONTA ESPECIAl
/*         ContaEspecial conta789 = new ContaEspecial("00789", 1000);
        System.out.println(conta789);
        conta789.depositar(50);
        System.out.println(conta789);
        conta789.sacar(925);
        System.out.println(conta789);
        conta789.sacar(1125);
        System.out.println(conta789);  
 */
        // CONTA POUPANCA
/*         ContaPoupanca conta987 = new ContaPoupanca("00987");
        System.out.println(conta987);
        conta987.depositar(100);
        System.out.println(conta987);
        conta987.sacar(20);
        System.out.println(conta987);
        conta987.sacar(1125);
        System.out.println(conta987);  */

        ContaPoupanca cp1 = new ContaPoupanca("111");
        cp1.depositar(1000);
        System.out.println(cp1);
        // Atributo Objeto
        //cp1.setTaxaSaque(50.50);
        
        // Atributo Classe - consegue chamar sem ter o objeto criado
        ContaPoupanca.setTaxaSaque((50.50) / 100);
        
        cp1.sacar(10);
        System.out.println(cp1);

        ContaPoupanca cp2 = new ContaPoupanca("111");
        cp2.depositar(1000);
        System.out.println(cp2);
        cp2.sacar(10);
        System.out.println(cp2);
    }
}
