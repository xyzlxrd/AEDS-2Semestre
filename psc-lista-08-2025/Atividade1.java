package com.mycompany.psc.lista;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int num = 0;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();
        
        printNumero(num);
    }
    
    public static void printNumero(int numeroParam){
        for(int i = 1; i <= numeroParam; i++){
            String repeat = String.valueOf(i).repeat(i);
            System.out.println(repeat);
        }
    }
}
