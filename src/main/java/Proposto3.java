import java.util.Scanner;

public class Proposto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0)
            System.out.println("São Multiplos");
        else
            System.out.println("Não são multiplos");

        sc.close();
    }
}
