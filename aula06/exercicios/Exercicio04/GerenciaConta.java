package exercicios.Exercicio04;

import java.util.TreeSet;

//..............................................
// fazer toda a gestão da conta e separar do App
//..............................................
public class GerenciaConta {
    // Atributo Classe
    private TreeSet<Conta> arvoreContas;

    // Construtor Objetos
    public GerenciaConta() {
        arvoreContas = new TreeSet<>();
    }

    // Métodos - criação de Contas
    public String novaContaCorrente(String numeroConta) {
        for (Conta c : arvoreContas) {
            if (c.getConta().equals(numeroConta)) {
                return "Conta Corrente já cadastrada!";
            }
        }
        Conta x = new ContaCorrente(numeroConta);

        // ??? 
        // ??
        // ??
        //arvoreContas.add(x);
        arvoreContas.add(x);
        //arvoreContas.add(new ContaCorrente(numeroConta));
        return "Conta Corrente criada com sucesso.";
    }

    public String novaContaEspecial(String numeroConta, double limite) {
        for (Conta c : arvoreContas) {
            if (c.getConta().equals(numeroConta)) {
                return "Conta Especial já cadastrada!";
            }
        }
        arvoreContas.add(new ContaEspecial(numeroConta, limite));
        return "Conta Especial criada com sucesso.";
    }

    public String novaContaPoupanca(String numeroConta) {
        for (Conta c : arvoreContas) {
            if (c.getConta().equals(numeroConta)) {
                return "Conta Poupança já cadastrada!";
            }
        }
        arvoreContas.add(new ContaPoupanca(numeroConta));
        return "Conta Poupança criada com sucesso.";
    }

    // Consultar Saldo (conta) - fez ou não fez?
    public String exibirSaldo(String conta) {
        for (Conta c : arvoreContas) {
            if (c.getConta().equals(conta)) {
                return c.toString();
            }
        }
        return "Conta não encontrada!";
    }

    // Depositar (conta, valor) - fez ou não fez?
    public boolean depositar(String conta, double valor) {
        for (Conta c : arvoreContas) {
            if (c.getConta().equals(conta)) {
                return c.depositar(valor);
            }
        }
        return false;
    }

    // Sacar (conta, valor) - fez ou não fez?
    public boolean sacar(String conta, double valor) {
        for (Conta c : arvoreContas) {
            if (c.getConta().equals(conta)) {
                return c.sacar(valor);
            }
        }
        return false;
    }

    // Pesquisar Conta no array, objeto para ação
}
