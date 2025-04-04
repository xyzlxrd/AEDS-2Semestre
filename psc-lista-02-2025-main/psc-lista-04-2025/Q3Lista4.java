import java.util.Scanner;

public class Q3Lista4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome = "";
    int idade = 0;
    double salario = 0.0;
    char sexo = 0;
    char estadoCivil = 0;

    System.out.println("Digite seu nome: ");
    nome = scan.nextLine();
    System.out.println("Digite sua idade: ");
    idade = scan.nextInt();
    System.out.println("Digite seu salário: ");
    salario = scan.nextDouble();
    System.out.println("Digite seu sexo (m/f): ");
    sexo = scan.next().charAt(0);
    System.out.println("Digite seu estado civil (s/c/v/d): ");
    estadoCivil = scan.next().charAt(0);

    if (nome.length() > 3 && 
        (idade > 0 && idade < 150) && 
        salario > 0.0 && 
        (sexo == 'm' || sexo == 'f') && 
        (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'))
    {
      System.out.println("Cadastro válido");
    }
    else{
      System.out.println("Cadastro inválido");
    }
  }
}
