package Map.Stok;

import java.util.Map;
import java.util.TreeMap;

public class Main_Stok {
    public static void main(String[] args) {
        Map<Product,Double> stok = new TreeMap<>();
        Product p1 = new Product("TV", 1400.00);
        Product p2 = new Product("Notebook", 4600.00);
        Product p3 = new Product("Tablet", 1200.00);
        Product p4 = new Product("Celular", 2800.00);

        stok.put(p1,14000.00);
        stok.put(p2,20000.00);
        stok.put(p3,8000.00);
        stok.put(p4,17000.00);



    }
}
