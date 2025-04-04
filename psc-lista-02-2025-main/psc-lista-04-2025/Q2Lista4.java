import java.util.Scanner;

public class Q2Lista4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String user = "";
    String pass = "";


    do{
      System.out.println("Digite seu usuário: ");
      user = scan.nextLine();
      System.out.println("Digite sua senha: ");
      pass = scan.nextLine();


      if(user.equals(pass)){
        System.out.println("Digite uma senha que nao seja igual ao nome de usuario");
      }
      else{
        System.out.println("Login efetuado com sucesso");
      }
    } while(user.equals(pass));
  }
}
