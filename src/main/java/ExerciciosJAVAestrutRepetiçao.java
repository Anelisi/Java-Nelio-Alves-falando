import java.util.Scanner;

public class ExerciciosJAVAestrutRepetiçao {
    public static void main(String[] args) {
        //Exercício 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Olá, qual o seu nome?  ");
        String nome = sc.next();

        System.out.println("Bem vindo, " + nome + "!");
        System.out.println("Parabéns pelo teu progresso!");
        System.out.println("Que orgulho (:");

        System.out.print("Qual a sua idade?  ");
        int idade;
        idade = sc.nextInt();
        System.out.println("Você parece tâo jovem para ter "+ idade + " anos!");

        System.out.println("Que altura você tem? ");
        float altura = sc.nextFloat();
        System.out.printf("Ótimo! %.2fm de altura está perfeito!", altura);



        System.out.println("\nDesculpe-me a indiscrição, mas qual é o seu peso? ");
        double peso = sc.nextDouble();

        System.out.println( peso / (altura*altura) > 27? "Você disse " + peso + "kg?! É! Temos que fazer uma dieta :( " : "Ótimo! Você está  em plenamente bem!");

        sc.close();

    }
}
