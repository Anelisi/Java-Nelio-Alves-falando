import java.util.Scanner;

public class PedidoBalcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------- MENU ------------------- \nNº 1 ---> Mac Fish R$ 2,00\nNº 2 ---> Mac Chicken R$ 3,50\nNº 3 ---> Mac Lanche Feliz R$ 4,00\nNº 4 ---> Quarteirão R$ 4,50\nNº 5 ---> Big Mac R$ 5,00\n--------------------------------------------");

        System.out.println("Olá! Qual será seu pedido? ");
        int codigo = sc.nextInt();
        System.out.println("Quantos deste você levará? ");
        int quantidade = sc.nextInt();

        double total = 0;

        if (codigo == 1) {
            total = quantidade * 2.0;
        }
        else if (codigo == 2) {
            total = quantidade * 3.50;
        }
        else if (codigo == 3) {
            total = quantidade * 4.0;
        }
        else if (codigo == 4) {
            total = quantidade * 4.50;
        }
        else if (codigo == 5) {
            total = quantidade * 5.00;
        }
        System.out.printf("TOTAL DO PEDIDO = R$ %.2f", total);
        System.out.println("\nObrigada pela preferência, volte sempre!");
     sc.close();
    }
}
