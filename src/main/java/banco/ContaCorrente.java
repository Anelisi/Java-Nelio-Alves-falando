package banco;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    Scanner sc = new Scanner(System.in);


    public ContaCorrente(String tipoConta, double saque, double deposito, double taxa, Cliente titular) {
        super(tipoConta, saque, deposito, taxa, titular);
    }
}
