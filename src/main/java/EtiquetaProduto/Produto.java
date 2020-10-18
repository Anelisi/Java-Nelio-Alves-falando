package EtiquetaProduto;

import java.text.NumberFormat;
import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);

    protected String nomeProduto;
    protected double valorProduto, valorTotal;
    protected int quantidadeProduto, quantidadeProdutoEntrada, retirada, id;

    public Produto() {    }

    public Produto(int id, String nomeProduto, double valorProduto, int quantidadeProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public void valorEstoque(){
        valorTotal = valorProduto * quantidadeProduto;
    }

    public void adicionaProdutoEtoque(){
        System.out.println("\nQual a quantidade deste produto está entrando no estoque? ");
        quantidadeProdutoEntrada = sc.nextInt();
        quantidadeProduto += quantidadeProdutoEntrada;
        valorTotal = valorProduto * quantidadeProduto;
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("A quantidade de " + nomeProduto + " que entrou é:  " + quantidadeProdutoEntrada + "\nQuantidade total em estoque: " + quantidadeProduto + " \nValor unitário: " + NumberFormat.getCurrencyInstance().format(valorProduto) + " \nO valor total deste produto em estoque: " + NumberFormat.getCurrencyInstance().format(valorTotal));
        System.out.println("\n----------------------------------------------------------------------------------------------");
    }


    public void retiraProdutoDoEstoque(){
        System.out.println("\nQual a quantidade a ser retirada deste produto do estoque? ");
        retirada = sc.nextInt();
        quantidadeProduto += - retirada;
        valorTotal = valorProduto * quantidadeProduto;
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("A quantidade de " + nomeProduto + " que saiu é:  " + retirada + "\nQuantidade total em estoque: " + quantidadeProduto + " \nValor unitário: " + NumberFormat.getCurrencyInstance().format(valorProduto) + " \nO valor total deste produto em estoque: " + NumberFormat.getCurrencyInstance().format(valorTotal));
        System.out.println("\n----------------------------------------------------------------------------------------------");
    }

    public String toString() {
        return "Produto= " + nomeProduto + ",\nValor= " + NumberFormat.getCurrencyInstance().format(valorProduto) + "\nQuantidade = " + quantidadeProduto + "\nValor total em estoque: " + NumberFormat.getCurrencyInstance().format(valorTotal);
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
