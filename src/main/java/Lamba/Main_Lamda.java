package Lamba;

import Lamba.Comparator.Product;
import Lamba.Function.InFunction.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

       // list.removeIf(p -> p.getPrice() >= 2000.0); // remova qualquer p que seja maior ou igual a 2000

        System.out.println("=== Pós removeIf ===");
        for (Product p : list) {
            System.out.println(p);
        }

        list.forEach(p -> p.setPrice(p.getPrice()* 1.1));

        list.forEach(System.out :: println);

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println("\n==== UPPER ====");
        names.forEach(System.out::println);

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("R$ %.2f", sum));
    }
}
