package exercicios.Exercicio71;

public class AppAnimal {
    public static void main(String[] args) {
        System.out.println("Hi Hello");


        // teste com objetos ...
        Proprietario p1 = new Proprietario("Fulano", "123");
        //System.out.println(p1);

        /* Animal a2 = new Animal("Eisten", "peixe", "cinza", 2020, p1.getNome(), p1.getTelefone());
        System.out.println( a2 );
        System.out.println(a2.getDono());
        p1.setTelefone("19 9 9172 4589");
        System.out.println(p1); */

        GerenciaAnimal animais = new GerenciaAnimal();
        
        animais.novoAnimal("Eisten", "peixe", "cinza", 2020, p1.getNome(), p1.getTelefone());
        //System.out.println( animais.exibirAnimal("Eisten"));
        
        animais.novoAnimal("Maya", "gato", "marrom", 2020, "Luiza", "");
        //System.out.println( animais.exibirAnimal("Maya"));

        animais.novoAnimal("Morgana", "gato", "marrom e branco", 2003, "Beatriz", "19 9 999 1234");
        //System.out.println( animais.exibirAnimal("Morgana"));

        System.out.println("Todos animais...> " + animais.exibirAnimais());
        //System.out.println(animais.exibirDonosRaca("gato"));
        //System.out.println(animais.exibirDonosRaca("peixe"));

        System.out.println(animais.exibirDonosRaca2("gato"));


    }
}
