package exercicios.Exercicio01;

public class Placar {
    // Atributos
    private String timeA, timeB;
    private int golA, golB;

    // Métodos
    // Construtor 1
    public Placar(){
        // String é objeto, não inicializado = null
        // inicializar para evitar o null...
        timeA = "<<Time Mandante>>";
        timeB = "<<Visitante>>";
        // int tipo básico é inicializado = 0
    };

    // Construtor 2
    public Placar(String timeA, String timeB) {
        //this.timeA = timeA;
        //this.timeB = timeB;
        setTimes(timeA, timeB);
        //this.golA = 0;
        //this.golB = 0;
        setPlacar(0, 0);
    }

    // Construtor 3
    public Placar (String timeA, String timeB, int golA, int golB) {
        //this.timeA = timeA;
        //this.timeB = timeB;
        //
        // chmar método de criação...
        //setTimes(timeA, timeB);
        this(timeA, timeB);
        //
        //
        //this.golA = golA;
        //this.golB = golB;
        setPlacar(golA, golB);
    }

    // Demais métodos
    public String resultado() {
        return this.timeA + " " + this.golA + " x " + this.golB + " " + this.timeB;
    }

    public void setTimes(String timeMandante, String timeVisitante){
        if(timeMandante.length() == 0){
            System.out.println("Time Mandante inválido");
        } else {
            this.timeA = timeMandante;
        }
        if (timeVisitante.length() == 0) {
            System.out.println("Time Visitante inválido");
        } else {
            this.timeB = timeVisitante;
        }
    }

    public void setPlacar(int golsMandante, int golsVisitante){
        if (golsMandante < 0){
            System.out.println("Gols Mandante inválido");;
        } else {
            this.golA = golsMandante;
        }
        if (golsVisitante < 0){
            System.out.println("Gols Visitante inválido");
        } else {
            this.golB = golsVisitante;
        }
    }
}
