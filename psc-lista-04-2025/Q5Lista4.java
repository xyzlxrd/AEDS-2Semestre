import java.util.Scanner;


public class Q5Lista4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double paisA = 0.0;
    double valorTaxaA = 0.0;
    double paisB = 0.0;
    double valorTaxaB = 0.0;
    int anos = 0;

    System.out.println("Digite o número de habitantes do país A:");
    paisA = scan.nextInt();
    System.out.println("Digite a taxa de crescimento do país A:");
    valorTaxaA = scan.nextDouble();
    System.out.println("Digite o número de habitantes do país B:");
    paisB = scan.nextInt();
    System.out.println("Digite a taxa de crescimento do país B:");
    valorTaxaB = scan.nextDouble();

    if(paisA < paisB && valorTaxaA > valorTaxaB){
      while(paisA < paisB){
        paisA += paisA * valorTaxaA;
        paisB += paisB * valorTaxaB;
        anos++;
      }
    }
    else{
      System.out.println("Os dados inseridos não são válidos.");
    }
    System.out.println("O total de anos necessario e de: " + anos);
    
  }
}
