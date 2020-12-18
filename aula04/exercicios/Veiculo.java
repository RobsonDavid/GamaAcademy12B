package exercicios;

public class Veiculo {
    // Atributos
    String modelo, marca;
    Double consumo;

    // Construtor
    Veiculo(String modelo, String marca, Double consumo){
        this.modelo  = modelo;
        this.marca   = marca;
        this.consumo = consumo;
    }

    // Métodos
    void apresentardados () {
        System.out.println("Veículo modelo " + modelo +  ", marca " + marca + ".");
    }

    double apresentaconsumo() {
        return consumo;
    }
}
