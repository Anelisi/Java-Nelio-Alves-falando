package order;

import order.enuns.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_Order {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfH = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        System.out.println("========== Enter Client's Data ==========\n");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Aniversário (dd/MM/aaaa): ");
        Date aniversario = sdf.parse(sc.next());
        System.out.println("==========================================\n");
        Client client = new Client(nome,email,aniversario);
        Scanner scan = new Scanner(System.in);
        System.out.println("========== Enter Order's Data ==========");
        System.out.print("Status: ");
        String status = scan.nextLine();

        Order order = new Order(new Date(), OrderStatus.valueOf(status));

        System.out.print("Quantos itens para este pedido? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("===== Enter #" + (1 + i) + " item data =====");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nome do Produto: ");
            String nomeProd = scanner.nextLine();
            System.out.print("Preço: R$ ");
            double preco = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.println("=======================================");
            Product product = new Product(nomeProd,preco);

            OrderItem orderItem = new OrderItem(quantidade,preco,product);
            order.addItem(orderItem);
        }


        System.out.println("------------------ ORDER SUMARY ------------------");
        System.out.println("Order moment: " + sdfH.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println(client);
        System.out.println("Order list: ");
        for (OrderItem o: order.getOrders()) {
            System.out.printf("%s, R$ %.2f, Quantidade: %d, Subtotal: R$ %.2f \n" ,o.getProduct().getNomeProd(), o.getPrecoOrder(), o.getQuantidade(), o.subTotal());
        }
    }
}
