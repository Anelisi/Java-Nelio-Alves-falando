import java.util.Locale;
import java.util.Scanner;

public class EixosCartesianos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nº do eixo X");
        double x = sc.nextDouble();
        System.out.println("Digite o nº do eixo Y");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        if (x > 0 && y > 0) {
        System.out.println("Q1");
       }
        if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        if (x < 0 && y < 0) {
        System.out.println("Q3");
       }
        else  {
            System.out.println("Q4");
        }
        sc.close();
    }
}
