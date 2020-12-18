package exemplos;



public class Veiculo {
    String modelo, marca;
    private Double consumo;

    Veiculo(String modelo, String marca, Double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void apresentardados () {
        System.out.println("Veículo modelo " + modelo +  ", marca " + marca + ".");
    }

    double apresentaconsumo() {
        return consumo;
    }
}
