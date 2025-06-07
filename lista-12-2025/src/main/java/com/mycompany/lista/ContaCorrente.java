package com.mycompany.lista;

public class ContaCorrente {
    private String numConta;
    private String nome;
    private double saldo;

    public ContaCorrente(String numeroConta, String nome) {
        this.numConta = numeroConta;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public ContaCorrente(String numeroConta, String nome, double saldoInicial) {
        this.numConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void deposito(double valor) {
        if (valor > 0) saldo += valor;
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) saldo -= valor;
    }

    public void mostrarDados() {
        System.out.println("Conta: " + numConta + " | Correntista: " + nome + " | Saldo: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345", "Maria", 100.0);
        conta.mostrarDados();
        conta.deposito(50.0);
        conta.saque(30.0);
        conta.alterarNome("Maria Clara");
        conta.mostrarDados();
    }
}
