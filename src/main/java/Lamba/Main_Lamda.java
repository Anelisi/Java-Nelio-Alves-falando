package Lamba;

import Lamba.Comparator.Product;

import java.util.ArrayList;
import java.util.List;

public class Main_Lamda {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1400.00));
        list.add(new Product("Notebook", 4600.00));
        list.add(new Product("Tablet", 1200.00));
        list.add(new Product("Celular", 2800.00));

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
