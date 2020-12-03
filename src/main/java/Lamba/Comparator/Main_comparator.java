package Lamba.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main_comparator {
    public static void main(String[] args) {
        List<Product>  list = new ArrayList<>();

        list.add(new Product("TV", 1400.00));
        list.add(new Product("Notebook", 4600.00));
        list.add(new Product("Tablet", 1200.00));
        list.add(new Product("Celular", 2800.00));

        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
