package exemplos;

import java.util.ArrayList;

public class Exemplo01 {
 public static void main(String[] args) {
    // array = estrutura linear
    ArrayList<Integer> lista = new ArrayList<>();

    lista.add(10);
    lista.add(20);
    lista.add(1975);
    lista.add(8);
    lista.add(10);
    
    System.out.println(lista);  
    System.out.println("Tamanho do Array = " + lista.size() );  
    //1o elemento está na posição 0

    for (int i = 0 ; i < lista.size(); i++){
        if (lista.get(i) == 8) {
            System.out.println("Achei na posição " + i);
        }
    }

    for (Integer item : lista){ //Oara cada item da lista faça
        if (item == 8){
            System.out.println("Achei");
        }
    }

    System.out.println("Removendo o 1o elemento = " + lista.remove(0) );  
    System.out.println(lista);  
}   
}
