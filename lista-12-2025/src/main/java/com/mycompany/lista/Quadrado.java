package com.mycompany.lista;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void mudarLado(double novoLado) {
        this.lado = novoLado;
    }

    public double retornarLado() {
        return this.lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public static void main(String[] args) {
        Quadrado quad = new Quadrado(5.0);
        System.out.println("Lado: " + quad.retornarLado());
        System.out.println("Área: " + quad.calcularArea());
        quad.mudarLado(7.0);
        System.out.println("Novo Lado: " + quad.retornarLado());
        System.out.println("Nova Área: " + quad.calcularArea());
    }
}
