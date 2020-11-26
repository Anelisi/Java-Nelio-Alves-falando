package Generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main_Generics {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\SouthSystem\\Desktop\\Java_Nélio\\Parabens\\produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] field = line.split(", ");
                list.add(new Product(field[0], Double.parseDouble(field[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most expansive: ");
            System.out.println(x);

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
