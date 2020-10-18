package EtiquetaProduto;

import order.OrderItem;

import java.text.NumberFormat;
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
        int op = 0, id;
        Produto p = null, importado = null, usado = null;

        do {
            System.out.println("============= MENU DE OPÇÕES =============");
            System.out.println("Digite ( 1 ) Adicionar Produtos no estoque\nDigite ( 2 ) Remover Produto do estoque\nDigite ( 0 ) Sair");
            System.out.println("==========================================");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Quantos produtos quer cadastrar? ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("================== CADASTRO DE PRODUTOS ==================");

                        Scanner scanner = new Scanner(System.in);
                        id = (i + 1);
                        System.out.print("Nome do produto: ");
                        String nomeProduto = scanner.nextLine();
                        System.out.print("Valor: R$ ");
                        double valorProduto = sc.nextDouble();
                        System.out.print("Quantidade: ");
                        int quantidadeProduto = sc.nextInt();
                        System.out.print("Este produto é Comum, Importado ou Usado? (C/I/U) ");
                        char ch = sc.next().charAt(0);

                        switch (ch){
                            case 'C':
                                p = new Produto(id, nomeProduto, valorProduto, quantidadeProduto);
                                produtos.add(p);
                                p.valorEstoque();
                                System.out.println("ID = " + p.getId());
                                //id++;
                                break;

                            case 'I':
                                System.out.print("Valor taxa de câmbio: R$ ");
                                double taxaCambio = sc.nextDouble();
                                importado = new ProdutoImportado(id, nomeProduto, valorProduto, quantidadeProduto, taxaCambio);
                                produtos.add(importado);
                                importado.valorEstoque();
                                System.out.println("ID = " + importado.getId());
                                //id++;
                                break;
                            case 'U':
                                System.out.print("Insira a data de fabricação: (dd/MM/aaaa)");
                                Date datafabr = sdf.parse(sc.next());
                                usado = new ProdutoUsado(id, nomeProduto, valorProduto, quantidadeProduto, datafabr);
                                produtos.add(usado);
                                usado.valorEstoque();
                                System.out.println("ID = " + usado.getId());
                               // id++;
                                break;
                        }
//                        if (ch == 'C') {
//                            p = new Produto(id, nomeProduto, valorProduto, quantidadeProduto);
//                            produtos.add(p);
//                            p.valorEstoque();
//                            System.out.println("ID = " + p.getId());
//                        } else if (ch == 'I') {
//                            System.out.print("Valor taxa de câmbio: R$ ");
//                            double taxaCambio = sc.nextDouble();
//                            importado = new ProdutoImportado(id, nomeProduto, valorProduto, quantidadeProduto, taxaCambio);
//                            produtos.add(importado);
//                            importado.valorEstoque();
//                            System.out.println("ID = " + importado.getId());
//                        } else {
//                            System.out.print("Insira a data de fabricação: (dd/MM/aaaa)");
//                            Date datafabr = sdf.parse(sc.next());
//                            usado = new ProdutoUsado(id, nomeProduto, valorProduto, quantidadeProduto, datafabr);
//                            produtos.add(usado);
//                            usado.valorEstoque();
//                            System.out.println("ID = " + usado.getId());
//                        }
                   } //id++;

                    break;

                case 2:

                    System.out.println("Digite o ID do produto que será removido do estoque: ");
                    int removeID = sc.nextInt();

                    Integer pos = positionID(produtos,removeID);

                    if (pos == null){
                        System.out.println("Id inexistente!");
                    } else {
                        for (int i = 0; i < produtos.size(); i++) {
                            Produto prod = produtos.get(i);
                            if (prod.getId() == removeID) {
                                System.out.println("Produto " + prod.getNomeProduto() + "\n Id= " + prod.getId());
                                produtos.remove(prod);
                                System.out.print(" REMOVIDO COM SUCESSO!\n");
                            } else System.out.println("NÃO FOI REMOVIDO!\n");

                        }
                        break;
                    }
                case 0:
                    break;
            }

        } while (op != 0);


        if (produtos.size()< 0){
            System.out.println("Estoque sem produtos cadastrados!");
        } else {

            int i = 1;
            for (Produto prod: produtos) {
                System.out.println("============= PRODUTO #" + i + " =============");
                i++;
                System.out.println(prod);
            }
        }

    }
    public static Integer positionID(List<Produto> produtos, int id){
        for (int i = 0; i < produtos.size(); i ++){
            if (produtos.get(i).getId() == id) {
                return i;
            }
        }  return null;
    }
}
