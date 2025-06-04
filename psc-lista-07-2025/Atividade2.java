package com.mycompany.list7;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] perguntas = new char[5];
        int respPositivas = 0;
        
        System.out.println("Com s/n responda:");
        System.out.println("Telefonou para vítima? ");
        perguntas[0] = scan.next().charAt(0);
        System.out.println("Esteve no local do crime? ");
        perguntas[1] = scan.next().charAt(0);
        System.out.println("Mora perto da vítima? ");
        perguntas[2] = scan.next().charAt(0);
        System.out.println("Devia para a vítima? ");
        perguntas[3] = scan.next().charAt(0);
        System.out.println("Já trabalhou com a vítima? ");
        perguntas[4] = scan.next().charAt(0);
        
        for(int i = 0; i <=4; i++){
            if(perguntas[i] == 's'){
                respPositivas += 1;
            }
        }
        
        if(respPositivas == 2){
            System.out.println("Suspeito");
        }
        else if(respPositivas == 3 || respPositivas == 4){
            System.out.println("Cumplice");
        }
        else if(respPositivas == 5){
            System.out.println("Assassino");
        }
        else{
            System.out.println("Inocente");
        }
        
    }
}
