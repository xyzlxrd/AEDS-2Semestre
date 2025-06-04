package com.mycompany.list7;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> vendas = new ArrayList<>();
        double valor;
        
        do {
            System.out.print("Digite o valor da venda bruta (ou -1 para encerrar): ");
            valor = scan.nextDouble();
            if (valor != -1) {
                vendas.add(valor);
            }
        }while (valor != -1);
        
        int[] faixas = new int[9];  

        for (double venda : vendas) {
            double salario = 200 + 0.09 * venda;

            int indice;
            if (salario >= 1000) {
                indice = 8;
            } else {
                indice = (int)(salario / 100) - 2;
            }
            
            if (indice >= 0 && indice < faixas.length) {
                faixas[indice]++;
            }
        }

        System.out.println("\nDistribuição de salários:");
        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 ou mais: " + faixas[8]);
    }
}
