import java.util.Scanner;

public class DescontoBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        double desconto = (preco < 50.0) ? preco * 0.05 : preco * 0.15;

        /*if (preco < 50.00) {
            desconto = preco * 0.05;
        }
        else {
            desconto = preco * 0.15;
        }*/
        System.out.println("O valor do seu desconto é de R$ " + desconto);
sc.close();
    }
}
