package exercicios.Exercicio01;

public class AppJogo {
    public static void main(String[] args) {
        Placar j1 = new Placar();
        System.out.println( j1.resultado() );
        j1.setTimes("Bangu", "");
        System.out.println( j1.resultado() );
        j1.setTimes("XV Piracicaba", "Bragantino");
        System.out.println( j1.resultado() );

        Placar j2 = new Placar("Sant'Anna", "Rocinhese");
        System.out.println( j2.resultado() );
        j2.setPlacar(-3, 10);
        System.out.println( j2.resultado() );
        j2.setPlacar(4, 1);
        System.out.println( j2.resultado() );

        Placar j3 = new Placar("São Paulo", "Corinthians", 3 , 0);
        System.out.println( j3.resultado() );

    }
    
}
