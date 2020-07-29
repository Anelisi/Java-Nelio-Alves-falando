import java.util.Scanner;

public class Dolares {
    Scanner sc = new Scanner(System.in);
    private double valorDolar = 5.40, taxaIOF = 1.1, valorReal, qDolares;

    public void cambio(){
        System.out.printf("Qual o valor do dolar hoje? \n 1$ = R$ %.2f", valorDolar);
        System.out.println("\nQuantos dolares você quer comprar? ");
        qDolares = sc.nextDouble();
        valorReal = (valorDolar * taxaIOF) * qDolares;
        System.out.printf("------------------------------------------------\n$ %.2f dolares + IOF = R$ %.2f reais \n------------------------------------------------", qDolares, valorReal);


    }
}
