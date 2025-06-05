package com.mycompany.psc.lista;

public class Atividade5 {
    public static void main(String args[]) {
        double taxa = 2.0;
        double custo = 96.59;
        
        double custoSomado = somaImposto(taxa, custo);
        System.out.println("O custo somado o imposto e: " + custoSomado);
    }
    
    public static double somaImposto(double taxaImposto, double custo){
        double valor = custo + (custo * taxaImposto / 100);
        
        return valor;
    }
}
