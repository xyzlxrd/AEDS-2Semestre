package com.mycompany.psc.lista;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        printNumero(num);
    }
    
    public static void printNumero(int numero){
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println();  
        }
    }
}