import java.util.Locale;
import java.util.Scanner;

public class Lisarb {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do teu salário? ");
        double sal = sc.nextDouble();
        double IR;

        if (sal < 2000.00) {
            IR = 0.00;
        }
        else if (sal <= 3000.00) {
            IR = (sal - 2000.00)  * 0.08;
        }
        else if (sal <= 4500.00) {
            IR = (sal -3000.00) * 0.18 + 1000.0 * 0.08;
        }
        else {
            IR = (sal - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 *0.08;
        }

        if (IR == 0.00) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("Seu imposto de Renda é R$  %.2f%n", IR);
        }
        System.out.printf("Salário Líquido: R$ %.2f " , (sal - IR));

        sc.close();
    }
}
