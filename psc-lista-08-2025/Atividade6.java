package com.mycompany.psc.lista;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora que deseja converter: ");
        int horas = scan.nextInt();
        System.out.println("Digite os minutos que deseja converter: ");
        int minutos = scan.nextInt();
        
        int horaConvertida = conversaoAm(horas);
        char amPm = amOuPm(horas);
        resultadoHora(horaConvertida, minutos, amPm);
    }

    public static int conversaoAm(int hora) {
        if (hora == 0) {
            return 12;
        } else if (hora == 12) {
            return 12;
        } else if (hora > 12) {
            return hora - 12;
        } else {
            return hora;
        }
    }

    public static char amOuPm(int hora) {
        if (hora >= 12) {
            return 'P';
        } else {
            return 'A';
        }
    }

    public static void resultadoHora(int hora, int minuto, char amPm) {
        String periodo;

        if (amPm == 'A') {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
        }

        System.out.printf("Horas convertidas para: %d:%02d %s", hora, minuto, periodo);
    }
}