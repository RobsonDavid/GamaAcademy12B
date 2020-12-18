package exercicios.Exercicio04;

public class Relogio {

    // Atributos TODOS privados
    private int hora, minuto, segundo;

    public Relogio (int hora, int minuto, int segundo){
        setHora(hora, minuto, segundo);
        /*
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        */
    } 

    // Métodos TODOS públicos
    public void mostrar(){
        //System.out.println("Hora Certa: " + hora + ":" + minuto + ":" + segundo);
        System.out.printf("Hora Certa: %02d:%02d:%02d\n", hora , minuto , segundo);
        // %02d - numero com 2 dígitos e se < 2 completa com zeros
    }

    public void setHora(int h, int m, int s){
        if (h >= 0 && h < 24){
            hora = h;
        }else {
            System.out.println("Hora inválida!");
        }
        
        if (m >= 0 && m < 60) {
            minuto = m;
        } else {
            System.out.println("Minuto inválido!");
        }
   
        if (s >= 0 && s < 60){
            segundo = s;
        } else {
            System.out.println("Segundo inválido!");
        }
        
    }

    public int getHora() {
        /*String now;
        now = hora;  //+ ':' + (String) minuto + ':' + (String) segundo;
        */
        return hora;
    }
}
