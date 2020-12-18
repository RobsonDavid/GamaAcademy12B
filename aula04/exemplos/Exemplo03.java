package exemplos;

public class Exemplo03 {
  public static void main(String[] args) {
      int x, y;
      x = 10;
      y = 5;
      int varSoma;

      System.out.println("Numero X: " + x);
      System.out.println("Numero Y: " + y);
      varSoma = soma(x ,y);
      System.out.println("Soma X + Y = " + varSoma);
      
  }  

  // void - sem retorno

  public static int soma (int a, int b) {
      return (a + b);
  }
}
