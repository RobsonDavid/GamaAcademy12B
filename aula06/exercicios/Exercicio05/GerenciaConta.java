package exercicios.Exercicio05;

import java.util.HashMap;

//..............................................
// fazer toda a gestão da conta e separar do App
//..............................................
public class GerenciaConta {
    // Atributo Classe
    private HashMap<String, Conta> mapaContas;

    // Construtor Objetos
    public GerenciaConta() {
        mapaContas = new HashMap<>();
    }

    // Métodos - criação de Contas
    public String novaContaCorrente(String numeroConta) {
        Conta c = mapaContas.get(numeroConta);
        if (c == null) {
            mapaContas.put(numeroConta, new ContaCorrente(numeroConta));
            return "Conta Corrente criada com sucesso.";
        } else {
            return "Conta Corrente já cadastrada!";
        }
    }

    public String novaContaEspecial(String numeroConta, double limite) {
        Conta c = mapaContas.get(numeroConta);
        if (c == null) {
            mapaContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
            return "Conta Especial criada com sucesso.";
        } else {
            return "Conta Especial já cadastrada!";
        }
    }

    public String novaContaPoupanca(String numeroConta) {
        Conta c = mapaContas.get(numeroConta);
        if (c == null) {
            mapaContas.put(numeroConta, new ContaPoupanca(numeroConta));
            return "Conta Poupança criada com sucesso.";
        } else {
            return "Conta Poupança já cadastrada!";
        }
    }

    // Consultar Saldo (conta) - fez ou não fez?
    public String exibirSaldo(String conta) {
        Conta c = mapaContas.get(conta);
        if (c != null) {
            return c.toString();
        }
        return "Conta não encontrada!";
    }

    // Depositar (conta, valor) - fez ou não fez?
    public boolean depositar(String conta, double valor) {
        Conta c = mapaContas.get(conta);
        if (c != null) {
            return c.depositar(valor);
        }
        return false;
    }

    // Sacar (conta, valor) - fez ou não fez?
    public boolean sacar(String conta, double valor) {
        Conta c = mapaContas.get(conta);
        if (c != null) {
            return c.sacar(valor);
        }
        return false;
    }

    // Pesquisar Conta no array, objeto para ação
}
