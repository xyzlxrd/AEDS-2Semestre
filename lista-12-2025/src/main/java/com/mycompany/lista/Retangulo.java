package com.mycompany.lista;
import java.util.Scanner;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarLados(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return (comprimento + largura) * 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o comprimento: ");
        double comp = scan.nextDouble();
        System.out.print("Digite a largura: ");
        double larg = scan.nextDouble();

        Retangulo ret = new Retangulo(comp, larg);
        double area = ret.calcularArea();
        double perimetro = ret.calcularPerimetro();

        System.out.println("Área: " + area + " m²");
        System.out.println("Quantidade de pisos necessários: " + Math.ceil(area));
        System.out.println("Quantidade de rodapés necessários: " + Math.ceil(perimetro));
    }
}

