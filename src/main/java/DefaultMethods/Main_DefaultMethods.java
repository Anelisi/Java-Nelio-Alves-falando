package DefaultMethods;

import java.util.Scanner;

public class Main_DefaultMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService iS = new BrazilInterestService(2);
        double payment = iS.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f ", payment));

    }
}
