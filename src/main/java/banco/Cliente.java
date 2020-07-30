package banco;

import java.util.Scanner;

public class Cliente extends Pessoa {
    Scanner sc = new Scanner(System.in);
    private String senha;
    private String tipoConta;
    private double saldo;
    private Banco banco;
    protected Conta conta;
    protected boolean acesso;

    public Cliente(String nome, String sexo, int idade, String cpf, String senha, String tipoConta, double saldo, Banco banco, Conta conta) {
        super(nome, sexo, idade, cpf);
        this.senha = senha;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.banco = banco;
        this.conta = conta;
    }

   /* public void tipoConta(String tipoConta){
        if (tipoConta.equals("Conta Corrente")){
            saldo = banco.getContaCorrente().getSaldo();
        } else{
            saldo = banco.getPoupança().getSaldo();
        }
    }*/


    public boolean confereSenha(){
        System.out.println("Digite a sua senha: ");
        String testeSenha = sc.nextLine();
        if (!testeSenha.equals(getSenha())) {
        for (int i = 0; !testeSenha.equals(getSenha()) && i< 3; i++) {
                System.out.println("\n======================\n   SENHA INCORRETA!\n======================");
                System.out.println(i+1 + "º Tentativa de 3\nDigite a senha:");
                testeSenha = sc.nextLine();
                if (i == 1 && !testeSenha.equals(getSenha())){
                    System.out.println("------------------------\n       ATENÇÃO!\nPróxima tentativa errada\n BLOQUEARÁ A SEU ACESSO\n------------------------\n");
                } else if (i == 3 && !testeSenha.equals(getSenha())) {

                    System.out.println("\n=======================================\nTENTATIVAS ESGOTADAS, ACESSO BLOQUEADO!\n========================================\n");
                }
                if (testeSenha.equals(getSenha())){
                    this.acesso = true;
                }else this.acesso = false;
            }
        } else this.acesso = true;
        return acesso;
    }

    public void exibeDados() {

        confereSenha();

        if (acesso == true) {
            System.out.printf("---------------------------------------------\nCliente: %s\nBanco: %s\nTipo de conta: %s\nSaldo: R$ %.2f\n---------------------------------------------\n", this.getNome(), this.getBanco().getNomeBanco(), this.getTipoConta(), conta.titular.getSaldo());
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
