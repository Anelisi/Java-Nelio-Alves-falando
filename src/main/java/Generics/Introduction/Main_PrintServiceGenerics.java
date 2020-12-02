package Generics.Introduction;

import java.util.Scanner;

public class Main_PrintServiceGenerics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer values = sc.nextInt();
            ps.addValue(values);
        }

        ps.print();
        System.out.println("First: " + ps.first());

    }
}
