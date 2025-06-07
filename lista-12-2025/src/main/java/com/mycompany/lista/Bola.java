package com.mycompany.lista;

public class Bola {
    private String cor;
    private double circun;
    private String material;

    public Bola(String cor, double circunf, String material) {
        this.cor = cor;
        this.circun = circunf;
        this.material = material;
    }

    public void trocarCor(String outraCor) {
        this.cor = outraCor;
    }

    public void mostraCor() {
        System.out.println("Cor da bola: " + this.cor);
    }

    public static void main(String[] args) {
        Bola bola = new Bola("Vermelha", 30.0, "Borracha");
        bola.mostraCor();
        bola.trocarCor("Azul");
        bola.mostraCor();
    }
}

