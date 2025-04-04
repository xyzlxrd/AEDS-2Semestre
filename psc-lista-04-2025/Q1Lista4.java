import java.util.Scanner;

public class Q1Lista4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean notaValida = false;


    while(!notaValida){
      System.out.println("Digite sua nota: ");
      int nota = scan.nextInt();

      if(nota >= 0 && nota <= 10){
        notaValida = true;
        System.out.println("Nota válida");
      }
      else{
        System.out.println("Nota inválida!! Digite novamente!!");
      }
    }
  }
}
