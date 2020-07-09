import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Produto p = new Produto();
        p.estoque();
        System.out.println(p);
        p.adicionaProdutoEtoque();
        p.retiraProdutoDoEstoque();
        System.out.println(p);
    }
    private String nomeProduto;
    private double valorProduto, valorTotal;
    private int quantidadeProduto = 10, quantidadeProdutoEntrada, retirada;

    public void estoque(){
        System.out.println("Nome do produto? ");
        nomeProduto = sc.nextLine();
        System.out.println("Qual o valor deste produto? ");
        valorProduto = sc.nextDouble();
        valorTotal = valorProduto * quantidadeProduto;
    }

    public void adicionaProdutoEtoque(){
        System.out.println("\nQual a quantidade deste produto está entrando no estoque? ");
        quantidadeProdutoEntrada = sc.nextInt();
        quantidadeProduto += quantidadeProdutoEntrada;
        valorTotal = valorProduto * quantidadeProduto;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\nA quantidade de %s que entrou é:  %d \nQuantidade total em estoque:  %d \nValor unitário: %.2f \nO valor total deste produto em estoque: %.2f", nomeProduto,quantidadeProdutoEntrada, quantidadeProduto,valorProduto,valorTotal);
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }


    public void retiraProdutoDoEstoque(){
        System.out.println("\nQual a quantidade a ser retirada deste produto do estoque? ");
        retirada = sc.nextInt();
        quantidadeProduto += - retirada;
        valorTotal = valorProduto * quantidadeProduto;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\nA quantidade de %s que saiu é:  %d \nquantidade total em estoque:  %d \nvalor unitário: %.2f \ntotal deste produto em estoque: %.2f", nomeProduto,retirada, quantidadeProduto,valorProduto,valorTotal);
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public String toString() {
        return nomeProduto + ", R$" + String.format("%.2f", valorProduto) + ", " + quantidadeProduto + " unidades, valor total em estoque é de R$" + String.format("%.2f",valorTotal);
    }

}
