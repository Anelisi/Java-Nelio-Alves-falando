import java.util.Scanner;

public class PedidoBalcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Qual será seu pedido? ");
        int codigo = sc.nextInt();
        System.out.println("Quantos deste você levará? ");
        int quantidade = sc.nextInt();

        double total = 0;

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else if (codigo == 5) {
            total = quantidade * 4.50;
        }
        System.out.println("TOTAL = R$ " + total);
        System.out.println("Obrigada pela preferência, volte sempre!");
     sc.close();
    }
}
