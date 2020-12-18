package exercicios.Exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio myclock = new Relogio(15, 12, 43);
        System.out.println("informações Create...");
        myclock.mostrar();

        System.out.println("informações Set...");
        myclock.setHora(-8, 66, 16);
        //myclock.hora = 18; // the field is not visible // não acessa atributo diretamente.
        myclock.setHora(16, 16, 16);
        myclock.mostrar();
        myclock.setHora(1, 6, 19);
        myclock.mostrar();
    
        System.out.println("informações Get...");
        int hh;
        hh  = myclock.getHora();
        System.out.println("A Hora é ...." + hh);
       
    }

}
