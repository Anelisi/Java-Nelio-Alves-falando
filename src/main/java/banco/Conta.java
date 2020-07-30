package banco;

import java.util.Scanner;

public abstract class Conta {
    Scanner sc = new Scanner(System.in);

    Cliente titular;
    protected String tipoConta;
    protected double saque, deposito, taxa;



    public Conta(String tipoConta, double saque, double deposito, double taxa, Cliente titular) {
        this.tipoConta = tipoConta;
        this.saque = saque;
        this.deposito = deposito;
        this.taxa = taxa;
        this.titular = titular;
    }

    public Conta(String tipoConta, Cliente titular) {
    }

    /*public void sacar(){
        System.out.println("------------------- SAQUE -------------------");

        titular.confereSenha();

        if (titular.acesso == true) {

            System.out.print("Valor para saque: R$ ");
            saque = sc.nextDouble();
            if (titular.getSaldo() <= 0 || saque > titular.getSaldo()) {
                System.out.println("Saldo insuficiente para efetuar o saque");
            } else
                titular.setSaldo(titular.getSaldo() - saque);
            System.out.printf("\n---------------------------------\nSaque efetuado com sucesso!\nSaldo disponível: R$ %.2f\n---------------------------------\n", titular.getSaldo());
        }
    }

    public void depositar(){
        System.out.println("---------------- DEPÓSITO ----------------");

        System.out.print("Valor de depósito: R$ ");
        deposito = sc.nextDouble();
        titular.setSaldo(titular.getSaldo() + deposito);
        System.out.printf("\n---------------------------------\nDepósito efetuado com sucesso!\nSaldo disponível: R$ %.2f\n---------------------------------\n",titular.getSaldo());
    }*/
}
