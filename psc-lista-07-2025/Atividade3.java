package com.mycompany.list7;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        int valor;
        int soma = 0;
        
        do{
            System.out.println("Digite o valor (-1 pra parar): ");
            valor = scan.nextInt();
            if(valor > -1){
                notas.add(valor);
            }
        }while(valor != -1);
        
        System.out.println("Quantidade de notas: " + notas.size());
        System.out.println("Sequencia das entradas lado a lado: ");
        for(int i = 0; i < notas.size(); i++){
            System.out.printf("%d ", notas.get(i));
        }
        
        System.out.println("\nSequencia inversa um abaixo do outro: ");
        
        for(int i = notas.size() - 1; i >= 0; i--){
            System.out.println(notas.get(i));
        }
        
        for(int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }
        
        double media = (double)soma / notas.size();
        System.out.println("A soma das notas e igual a: " + soma);
        System.out.printf("A media das notas e igual a: %.2f", media);
        
        int acimaMedia = 0;
        
        System.out.println(" ");
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) > media){
                acimaMedia++;
            }
        }
        
        int abaixoSete = 0;
        
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) < 7){
                abaixoSete++;
            }
        }
        
        System.out.println("Quantidade acima da media: " + acimaMedia);
        System.out.println("Quantidade abaixo de 7: " + abaixoSete);
        System.out.println("Programa Encerrado");
        
    }
}
