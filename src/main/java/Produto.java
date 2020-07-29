import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Produto p = new Produto("Televisão", 900.00,10);
        p.estoque();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(p);
        System.out.println("----------------------------------------------------------------------------------------------");

        p.adicionaProdutoEtoque();
        p.retiraProdutoDoEstoque();
        System.out.println(p);
        p.setNomeProduto("Computador");
        p.setValorProduto(4800.00);
        System.out.println("Update " + p.getNomeProduto());
    }
    private String nomeProduto;
    private double valorProduto, valorTotal;
    private int quantidadeProduto, quantidadeProdutoEntrada, retirada;

    public Produto(String nomeProduto, double valorProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public void estoque(){
        valorTotal = valorProduto * quantidadeProduto;
    }

    public void adicionaProdutoEtoque(){
        System.out.println("\nQual a quantidade deste produto está entrando no estoque? ");
        quantidadeProdutoEntrada = sc.nextInt();
        quantidadeProduto += quantidadeProdutoEntrada;
        valorTotal = valorProduto * quantidadeProduto;
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("\nA quantidade de %s que entrou é:  %d \nQuantidade total em estoque:  %d \nValor unitário: %.2f \nO valor total deste produto em estoque: %.2f", nomeProduto,quantidadeProdutoEntrada, quantidadeProduto,valorProduto,valorTotal);
        System.out.println("\n----------------------------------------------------------------------------------------------");
    }


    public void retiraProdutoDoEstoque(){
        System.out.println("\nQual a quantidade a ser retirada deste produto do estoque? ");
        retirada = sc.nextInt();
        quantidadeProduto += - retirada;
        valorTotal = valorProduto * quantidadeProduto;
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("\nA quantidade de %s que saiu é:  %d \nquantidade total em estoque:  %d \nvalor unitário: %.2f \nO valor total deste produto em estoque: %.2f", nomeProduto,retirada, quantidadeProduto,valorProduto,valorTotal);
        System.out.println("\n----------------------------------------------------------------------------------------------");
    }

    public String toString() {
        return nomeProduto + ", R$" + String.format("%.2f", valorProduto) + " - " + quantidadeProduto + " unidades, valor total em estoque é de R$" + String.format("%.2f",valorTotal);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public int getQuantidadeProdutoEntrada() {
        return quantidadeProdutoEntrada;
    }

    public int getRetirada() {
        return retirada;
    }
}
