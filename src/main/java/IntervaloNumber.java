import java.util.Locale;
import java.util.Scanner;

public class IntervaloNumber {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número --> ");
        double Number = sc.nextDouble();


        if (Number < 0.00 || Number > 100.00) {
            System.out.println("Fora de inetervalo");
        }
        else if (Number <= 25.00) {
            System.out.println("Intevrvalo [0, 25]");
        }
        else if (Number <= 50.00) {
            System.out.println("Intervalo (25, 50]");
        }
        else if (Number <= 75.00) {
            System.out.println("Intervalo (50, 75]");
        }
        else {
          System.out.println("Intervalo (75, 100]");
        }
        sc.close();
    }

}
