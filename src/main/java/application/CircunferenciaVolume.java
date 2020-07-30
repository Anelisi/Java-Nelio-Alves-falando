package application;

import java.util.Locale;
import java.util.Scanner;

public class CircunferenciaVolume {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferência: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI: %.2f", PI);

        sc.close();
    }
    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double volume(double raio) {
        return 4.0 * PI * raio * raio *raio / 3.0;
    }
}

