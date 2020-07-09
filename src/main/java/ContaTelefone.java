import java.util.Locale;
import java.util.Scanner;

public class ContaTelefone {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        double conta = 50.0;

        if (min > 100.0) {
            conta += (min - 100.0) * 2.0;
        }
        System.out.println("Total da conta R$ " + conta);
        sc.close();
    }
}
