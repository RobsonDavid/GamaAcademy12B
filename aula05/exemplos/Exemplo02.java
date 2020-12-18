package exemplos;

import java.util.TreeSet;

public class Exemplo02 {
    public static void main(String[] args) {
     TreeSet<Integer> arvore = new TreeSet<>();

     // nao garante a ordem e não aceita repetido
     arvore.add(10);
     arvore.add(15);
     arvore.add(80);
     arvore.add(1);
     arvore.add(175);

     System.out.println("Arvore => " + arvore);
                

    }
}
