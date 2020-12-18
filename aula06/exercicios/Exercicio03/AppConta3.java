package exercicios.Exercicio03;

import java.util.Scanner;
import java.util.ArrayList;

public class AppConta3 {

    public static void main(String[] args) {
        System.out.println("Menu <App Conta 3>");

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int intNumeroConta = 0;
        String stringNumeroConta = "  ";
        double valor = 0;
        ContaCorrente cc = null;
        //ArrayList<ContaCorrente> listaContaCorrente = new ArrayList<>();
        ArrayList<Conta> listaConta = new ArrayList<>();
        boolean acheiConta = false;
        ContaEspecial ce = null;
        double limite = 0;
        ContaPoupanca cp = null;

        do {
            System.out.println("0 - listar contas ");
            System.out.println("1 - abrir conta corrente ");
            System.out.println("2 - abrir conta especial ");
            System.out.println("3 - abrir conta popuança ");
            System.out.println("4 - conultar saldo ");
            System.out.println("5 - depositar ");
            System.out.println("6 - sacar ");
            System.out.println("7 - sair ");
            System.out.print("|-> ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.println("informe numero da conta:");
                // tem que ser String ?!?!
                intNumeroConta = entrada.nextInt();
                stringNumeroConta  = Integer.toString(intNumeroConta);
                acheiConta = false;
            }
            if (opcao >= 5 && opcao <= 6) {
                System.out.println("informe o valor:");
                valor = entrada.nextDouble();
            }

            // trabalhar com conjuntos objetos conta ... saber qual consultar, depositar e sacar

            switch (opcao) {
                case 0:
                System.out.println("opc0");
                //System.out.println(listaConta);
                for (Conta c : listaConta) {
                    System.out.println(c);    
                }
                break;                

                case 1:
                    //System.out.println("opc1");
                    cc = new ContaCorrente(stringNumeroConta);
                    //listaContaCorrente.add(cc);
                    listaConta.add(cc);
                    break;

                case 2:
                    //System.out.println("opc2");
                    System.out.println("informe limite:");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(stringNumeroConta, limite);
                    listaConta.add(ce);
                    break;

                case 3:
                    //System.out.println("opc3");
                    cp = new ContaPoupanca(stringNumeroConta);
                    listaConta.add(cp);
                    break;

                case 4:
                    //System.out.println("opc4");
                    //System.out.println(listaConta);
                    // Conta = objeto abstract; não pode new, mas pode referenciar
                    // foreach: para cada Conta (endereço memória que aponta para objeto) da listaConta
                    for (Conta c : listaConta) {
                        //System.out.println("getConta...: " + c.getConta());
                        //System.out.println(stringNumeroConta);
                        if(c.getConta().equals(stringNumeroConta)) {
                            System.out.println(c);
                            acheiConta = true;
                            break;
                        } else {
                            //System.out.println("?");
                        }
                    }
                    if (! acheiConta){
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 5:
                    //System.out.println("opc5");
                    for (Conta c : listaConta) {
                        if(c.getConta().equals(stringNumeroConta)) {
                            c.depositar(valor);
                            acheiConta = true;
                            break;
                        }
                    }
                    if (! acheiConta){
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 6:
                    //System.out.println("opc6");
                    for (Conta c : listaConta) {
                        if(c.getConta().equals(stringNumeroConta)) {
                            c.sacar(valor);
                            acheiConta = true;
                            break;
                        }
                    }
                    if (! acheiConta){
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }
        } while (opcao != 7);

        if (opcao == 7) {
            System.out.println("Obrigado por utiliar <App Conta 3>");
        }

        entrada.close();
    }

}

