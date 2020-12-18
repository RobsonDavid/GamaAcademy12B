package exercicios.Exercicio71;

import java.util.ArrayList;

public class GerenciaAnimal {
    // Atributo Classe
    private ArrayList<Animal> listaAnimais;

    // Construtor Objetos
    public GerenciaAnimal() {
        listaAnimais = new ArrayList<>();
    }

    // Métodos - criação de Animais
    public void novoAnimal(String nome, String raca, String cor, int ano, String nomeDono, String telefoneDono) {
        listaAnimais.add(new Animal(nome, raca, cor, ano, nomeDono, telefoneDono));
    }

    // Consultar um Animal
    public String exibirAnimal(String nome) {
        for (Animal a : listaAnimais) {
            if (a.getNome().equals(nome)) {
                return a.toString();
            }
        }
        return "Animal não encontrado!";
    }

    // Consultar todos Animal
    public String exibirAnimais() {
        return listaAnimais.toString();
    }

    // Consultar Donos de uma raça
     public String exibirDonosRaca(String raca) {
        ArrayList<Proprietario> listaDonos = new ArrayList<>();
        boolean achei = false;

        for (Animal a : listaAnimais) {
            if (a.getRaca().equals(raca)) {
                listaDonos.add(a.getDonoObjeto());
                achei = true;
            }
        }
        if (achei) {
            return listaDonos.toString();
        } else {
            return "Donos não encontrados!";
        }
    } 

   public String exibirDonosRaca2 (String raca){
       String saida = "";
    for (Animal a : listaAnimais) {
        if (a.getRaca().equals(raca)) {
            saida += a.getDono() + "\n";
        }
    }
    return saida;
   }

}
