import java.util.Scanner;

public class Q8Lista4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1, num2, num3, num4, num5;

    System.out.println("Enter 5 numbers");
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();
    num4 = scan.nextInt();
    num5 = scan.nextInt();

    int soma = num1 + num2 + num3 + num4 + num5;
    int media = soma/5;
    System.out.println("A soma dos números é: " + soma + "\n A média dos números é: " + media);
  }
}
