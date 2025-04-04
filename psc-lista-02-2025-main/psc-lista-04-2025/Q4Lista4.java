public class Q4Lista4 {
  public static void main(String[] args) {
    int paisA = 80000;
    int paisB = 200000;
    int anos = 0;

    while(paisA < paisB){
      paisA += paisA * 0.03;
      paisB += paisB * 0.015;
      anos++;
    }
    System.out.println("O total de anos necessario e de: " + anos);
  }
}
