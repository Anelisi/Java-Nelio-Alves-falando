package banco;

import java.util.Scanner;

public class Poupança extends Conta {
    Scanner sc = new Scanner(System.in);
    private double juros, saldo;

    public Poupança(String tipoConta, double saque, double deposito, double taxa, Cliente titular, double juros) {
        super(tipoConta, saque, deposito, taxa, titular);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
