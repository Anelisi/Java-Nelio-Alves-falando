package banco;
import java.util.Arrays;
import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);
    private String nomeBanco;
    Cliente[] clientes = new Cliente[2];

    Conta[] cp = new Poupança[2];
    Conta[] cc = new ContaCorrente[2];
    int n = 0;

    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }

    public Banco(String nomeBanco, Cliente[] clientes, Poupança[] cp, ContaCorrente[] cc) {
        this.nomeBanco = nomeBanco;
        this.clientes[0] = new Cliente("Anelisi", "Feminino", 33, "888.351.704-30", "birinis", "Poupança", 1987, this, cp[0]);
        this.clientes[1] = new Cliente("Arthur", "Masculino", 34, "889.321.784-50", "netzarolha", "Conta Corrente", 900000, this, cc[0]);
        this.cp[0] = new Poupança("Poupança", 0, 0, 1, clientes[0], 0.05);
        this.cc[0] = new ContaCorrente("Conta Corrente", 0, 0, 0, clientes[1]);
    }


    public void aniBank(){
        if (clientes[0].getSexo().equalsIgnoreCase("Feminino")){
            System.out.println("---------------------------------------------\nSeja muito bem vinda, " + clientes[n].getNome() + ", ao Anibank!\n---------------------------------------------");
        } else System.out.println("---------------------------------------------\nSeja muito bem vindo, " + clientes[n].getNome() + ", ao Anibank!\n---------------------------------------------");
        clientes[n].getConta();
    }

    public void sacar(){
        if (clientes[n].getTipoConta().equalsIgnoreCase("Poupança")) {

            System.out.println("------------------- SAQUE -------------------");

            clientes[n].confereSenha();

            if (clientes[n].acesso == true) {

                System.out.print("Valor para saque: R$ ");
                double saque = sc.nextDouble();
                if (clientes[n].getSaldo() <= 0 || saque > clientes[n].getSaldo()) {
                    System.out.println("Saldo insuficiente para efetuar o saque");
                } else
                    clientes[n].setSaldo(clientes[n].getSaldo() - saque);
                System.out.printf("\n---------------------------------\nSaque efetuado com sucesso!\nSaldo disponível: R$ %.2f\n---------------------------------\n", clientes[n].getSaldo());
            }
        }
    }

    public void depositar(){
        if (clientes[n].getTipoConta().equalsIgnoreCase("Poupança")) {
            System.out.println("---------------- DEPÓSITO ----------------");

            System.out.print("Valor de depósito: R$ ");
            double deposito = sc.nextDouble();
            clientes[n].setSaldo(clientes[n].getSaldo() + deposito);
            System.out.printf("\n---------------------------------\nDepósito efetuado com sucesso!\nSaldo disponível: R$ %.2f\n---------------------------------\n",clientes[n].getSaldo());
        }
    }

    public void menu(){
        System.out.println("=============== OPERAÇÕES ===============");
        System.out.println("=============== BANCÁRIAS ===============");
        System.out.println(" 1 - SACAR ");
        System.out.println(" 2 - DEPOSITAR");
        System.out.println(" 3 - SALDO");
        System.out.println(" 4 - ALTERAR SENHA");
        System.out.println(" 5 - CONFERIR SEUS DADOS ");
        System.out.println("==============================================");
        System.out.println("Informe a opção desejada: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                sacar();
                break;
            case 2:
               depositar();
                break;
            case 3:
                clientes[n].getSaldo();
                break;
            case 4:
                System.out.println("Digite a sua nova senha: ");
                String novaSenha = sc.nextLine();
                System.out.println("Confirme a sua nova senha: ");
                String testeNovaSenha = sc.nextLine();

                if (novaSenha.equals(testeNovaSenha)){
                   clientes[n].setSenha(novaSenha);
                } else System.out.println("SENHAS NÃO CONEFEREM");
                break;
            case 5:
               clientes[n].exibeDados();
                break;
            default:
                System.out.println("================");
                System.out.println(" OPÇÃO INVALIDA");
                System.out.println("================");
        }
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Conta[] getCp() {
        return cp;
    }

    public void setCp(Conta[] cp) {
        this.cp = cp;
    }

    public Conta[] getCc() {
        return cc;
    }

    public void setCc(Conta[] cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return  "Banco{" +
                "nomeBanco='" + nomeBanco + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                ", cp=" + Arrays.toString(cp) +
                ", cc=" + Arrays.toString(cc) +
                '}';
    }
}
