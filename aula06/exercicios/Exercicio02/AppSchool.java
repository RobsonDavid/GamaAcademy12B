package exercicios.Exercicio02;

public class AppSchool {
    public static void main(String[] args) {
        System.out.println("My School!!");
        
        // classe abstrat = serve de medelo, não pode fazer new!
        ///Pessoa peopleJoao = new Pessoa("João", "11 2733 4226");
       /*  System.out.println( "Pessoa......: " + people.toString() ); */
        ///System.out.println( "Pessoa......: " + peopleJoao );

        Estudante studantMaria = new Estudante("Maria", "19 91234 5678", "T.O.: Terapoia Ocupacional");
        /* System.out.println( "Estudante...: " + studant.toString() ); */
        System.out.println( "Estudante...: " + studantMaria );

        Professor teacherAnaMaria = new Professor("Ana Maria", "11 2733 8510", 12000);
        /* System.err.println( "Professor...: " + teacher.toString() ); */
        System.out.println( "Professor...: " + teacherAnaMaria );

        // acessando atributo protected
        System.out.println("RG: " + teacherAnaMaria.rg);
    }
    
}
