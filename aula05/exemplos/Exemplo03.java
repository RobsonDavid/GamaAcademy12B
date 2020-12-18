package exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> mapa = new HashMap<>();
        // 1o chave = único; 2o informação

        // não é linear e não é árvore
        mapa.put(1, "um");
        mapa.put(2, "dois");
        mapa.put(3, "três");

        System.out.println("o 2 é " + mapa.get(2));

    }
    
}
