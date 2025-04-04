import java.util.Scanner;

public class Q10Lista4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numeroUsuario = 0;
    int numeroUsuario2 = 0;

    System.out.println("Digite um numero: ");
    numeroUsuario = scan.nextInt();
    System.out.println("Digite outro numero: ");
    numeroUsuario2 = scan.nextInt();

    int menorNum = Math.min(numeroUsuario, numeroUsuario2);
    int maiorNum= Math.max(numeroUsuario, numeroUsuario2);
    for(int i = menorNum + 1; i < maiorNum; i++){
      System.out.println(i);
    }
  }
}
