package EtiquetaProduto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main_Produto {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos quer cadastra? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("================== CADASTRO DE PRODUTOS ==================");
            int id = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Valor: R$ ");
            double valorProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();
            System.out.print("Este produto é Comum, Importado ou Usado? (C/I/U) ");
            char ch = sc.next().charAt(0);


            if (ch == 'C') {
                Produto p = new Produto(id,nomeProduto, valorProduto, quantidadeProduto);
                produtos.add(p);
                p.valorEstoque();
            }else if (ch == 'I') {
                System.out.print("Valor taxa de câmbio: R$ ");
                double taxaCambio = sc.nextDouble();
                Produto importado = new ProdutoImportado(id,nomeProduto, valorProduto, quantidadeProduto, taxaCambio);
                produtos.add(importado);
                importado.valorEstoque();
            } else {
                System.out.print("Insira a data de fabricação: (dd/MM/aaaa)");
                Date datafabr = sdf.parse(sc.next());
                Produto usado = new ProdutoUsado(id,nomeProduto, valorProduto, quantidadeProduto, datafabr);
                produtos.add(usado);
                usado.valorEstoque();
            }
            id ++;
        }
        int i = 1;
        for (Produto prod: produtos) {
            System.out.println("============= PRODUTO #" + i + " =============");
            i++;
            System.out.println(prod);
        }
    }
}
