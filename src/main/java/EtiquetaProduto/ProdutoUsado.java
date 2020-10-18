package EtiquetaProduto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;

    public ProdutoUsado() {    }

    public ProdutoUsado(int id, String nomeProduto, double valorProduto, int quantidadeProduto, Date dataFabricacao) {
        super(id, nomeProduto, valorProduto, quantidadeProduto);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        return  super.toString() + "Produto Usado [" +
                "Data de Fabricação= " + sdf.format(dataFabricacao) +
                ']';
    }
}
