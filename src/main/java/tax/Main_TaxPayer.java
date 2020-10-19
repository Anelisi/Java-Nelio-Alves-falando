package tax;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_TaxPayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter number of TaxPayer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("======= TaxPayer #" + i + " data: =======");
            System.out.print("Individual or Company? (i/c)");
            char ch = sc.next().charAt(0);


            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health Expenditure: ");
                double healthExpenditure = sc.nextDouble();

                TaxPayer individual = new  Individual(name,anualIncome,healthExpenditure);
                list.add(individual);

            } else {
                System.out.print("Number of Employees: ");
                int numberEmployees = sc.nextInt();

                TaxPayer company = new Company(name,anualIncome,numberEmployees);
                list.add(company);

            }
        }

        System.out.println("========== TAXES PAID: ==========");
        for (TaxPayer x: list) {
            System.out.print(x.getName());
            System.out.println(" Tax: R$ " + NumberFormat.getCurrencyInstance().format(x.tax()));
        }

        double sum = 0.00;
        for (TaxPayer x: list) {
            sum += x.tax();
        }
        System.out.println("---------------------------------");
        System.out.print("\nTOTAL TAXES: R$ " + NumberFormat.getCurrencyInstance().format(sum));
    }
}
