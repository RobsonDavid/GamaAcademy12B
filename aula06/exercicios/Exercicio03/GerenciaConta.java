package exercicios.Exercicio03;

import java.util.ArrayList;

//..............................................
// fazer toda a gestão da conta e separar do App
//..............................................
public class GerenciaConta {
    // Atributo Classe
    private ArrayList<Conta> listaContas;

    // Construtor Objetos
    public GerenciaConta() {
        listaContas = new ArrayList<>();
    }

    // Métodos - criação de Contas
    public void novaContaCorrente(String numeroConta) {
        /*
         * ContaCorrente cc = new ContaCorrente(numeroConta); listaContas.add(cc);
         */
        // ou
        listaContas.add(new ContaCorrente(numeroConta));

    }

    public void novaContaEspecial(String numeroConta, double limite) {
        ContaEspecial ce = new ContaEspecial(numeroConta, limite);
        listaContas.add(ce);
        // ou
        // listaContas.add(new ContaEspecial(numeroConta, limite));

    }

    public void novaContaPoupanca(String numeroConta) {
        /*
         * ContaPoupanca cp = new ContaPoupanca(numeroConta); listaContas.add(cp);
         */ // ou
        listaContas.add(new ContaPoupanca(numeroConta));

    }

    // Consultar Saldo (conta) - fez ou não fez?
    public String exibirSaldo(String conta) {
        for (Conta c : listaContas) {
            if (c.getConta().equals(conta)) {
                return c.toString();
            }
        }
        return "Conta não encontrada!";
    }

    // Depositar (conta, valor) - fez ou não fez?
    public boolean depositar(String conta, double valor){
        for (Conta c : listaContas) {
            if(c.getConta().equals(conta)) {
                return c.depositar(valor);
            }
        }
        return false;
    }
    
    // Sacar (conta, valor) - fez ou não fez?
    public boolean sacar(String conta, double valor){
        for (Conta c : listaContas) {
            if(c.getConta().equals(conta)) {
                return c.sacar(valor);
            }
        }
        return false;
    }

    // Pesquisar Conta no array, objeto para ação
}
