import java.util.Scanner;

public class Funcionario {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double salarioBruto, salarioLiquido, imposto, aumentoPorcentagem;

    public Funcionario(String nome, double salarioBruto, double imposto, double aumentoPorcentagem) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.aumentoPorcentagem = aumentoPorcentagem;
    }

    public void salario(){

        System.out.println("\nTeve promoção de salário? S/N");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("S")){
            salarioBruto = salarioBruto * aumentoPorcentagem;
            salarioLiquido = salarioBruto - imposto;
        } else {
            salarioLiquido = salarioBruto - imposto;
        }

    }

    public void exibeDados(){
        System.out.printf("----------------- FUNCIONARIO -----------------\nNome: %s \nSalário Bruto: R$ %.2f - imposto: R$ %.2f\nSalário Líquido: R$ %.2f\n-----------------------------------------------", nome, salarioBruto, imposto, salarioLiquido );
    }

}
