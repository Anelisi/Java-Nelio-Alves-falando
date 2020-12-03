package Lamba.Function;

import Lamba.Comparator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Function {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1400.00));
        list.add(new Product("Notebook", 4600.00));
        list.add(new Product("Tablet", 1200.00));
        list.add(new Product("Celular", 2800.00));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}
