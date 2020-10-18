package EtiquetaProduto;

import java.text.NumberFormat;

public class ProdutoImportado extends Produto{

    private double taxaCambio;

    public ProdutoImportado() {    }

    public ProdutoImportado(int id, String nomeProduto, double valorProduto, int quantidadeProduto, double taxaCambio) {
        super(id,nomeProduto, valorProduto, quantidadeProduto);
        this.taxaCambio = taxaCambio;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public void valorEstoque(){
        valorTotal = (valorProduto * quantidadeProduto) + taxaCambio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProduto Importado [" +
                "Taxa de Câmbio= " + NumberFormat.getCurrencyInstance().format(taxaCambio) + "]";
    }
}
