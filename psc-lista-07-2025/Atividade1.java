package com.mycompany.list7;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
             "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] temp = new double[12];
        double soma = 0;
        
        for(int i = 0;i <= 11; i++){
            System.out.println("Digite a media de temperatura de " + meses[i] + ":");
            temp[i] = scan.nextDouble();
        }
        
        System.out.println("Media mensal:");
        for(int i = 0; i <=11; i++){
            System.out.println("Mes: " + meses[i] + "\nTemperatura: " + temp[i] + " Â°C");
            soma += temp[i];
        }
        
        soma = soma / 12;
        
        System.out.printf("Media Anual de temperatura: %.2f Â°C", soma);
        
    }
}
