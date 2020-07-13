import java.util.Locale;
import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double Delta = Math.pow (B, 2.0) - 4.0 * A * C;
        double x1;
        double x2;


        if (A == 0 || Delta < 0.0) {
            System.out.println("Impossível calcular");
        }
        else {

            x1 = (-B + Math.sqrt(Delta)) / (2.0 * A);
            x2 = (-B - Math.sqrt(Delta)) / (2.0 * A);
            System.out.printf("X1 = %.5f%n", x1);
            System.out.printf("X2 = %.5f%n", x2);

        }

sc.close();

    }
}
