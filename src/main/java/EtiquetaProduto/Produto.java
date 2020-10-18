package EtiquetaProduto;

import java.text.NumberFormat;

public class Produto {

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

    public String toString() {
        return "Id= "+ id + "\nProduto= " + nomeProduto + ",\nValor= " + NumberFormat.getCurrencyInstance().format(valorProduto) + "\nQuantidade = " + quantidadeProduto + "\nValor total em estoque: " + NumberFormat.getCurrencyInstance().format(valorTotal);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
