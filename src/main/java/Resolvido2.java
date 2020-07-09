import java.util.Scanner;

public class Resolvido2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor da base: ");
            double base = sc.nextDouble();
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
            double area = base * altura;
            double perimetro = 2 * base + 2 * altura;
            double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

            System.out.printf("AREA =  %.4f%n", area);
            System.out.printf("PERÍMERO =  %.4f%n", perimetro);
            System.out.printf("DIAGONAL = %.4f%n", diagonal);

            sc.close();
        }
    }


