import java.util.Scanner;

public class MetroQuadradoArea {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da largura: ");
    double largura = sc.nextDouble();
        System.out.println("Digite o valor do comprimento: ");
    double comprimento = sc.nextDouble();
        System.out.println("Informe o valor do m²: ");
    double valorMetro = sc.nextDouble();

    double area = largura * comprimento;
    double preco = area * valorMetro;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f%n", preco);
     /*
        System.out.println("AREA = " + area);
        System.out.println("PREÇO = " + preco);*/

        sc.close();

    }

}
