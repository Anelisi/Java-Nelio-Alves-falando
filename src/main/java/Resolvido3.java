import java.util.Scanner;

public class Resolvido3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome1 = sc.next();
        System.out.println("Digite a idade: ");
        double idade1 = sc.nextDouble();
        System.out.println("Nome: ");
        String nome2 = sc.next();
        System.out.println("Digite a sua idade: ");
        double idade2= sc.nextDouble();
        double media = (idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos ", nome1, nome2, media);

        /*System.out.println("A idade méia de " + nome1 + " e " + nome2 + " é de " + media + " anos");*/

sc.close();
    }
}
