package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main_Map {
    public static void main(String[] args) {
        Map<String,String> coockies = new LinkedHashMap<>();
        coockies.put("Username", "Anelisi");
        coockies.put("Email", "anelisi@southsystem.com");
        coockies.put("Fone", "(51)995722816");

        System.out.println("\nContém 'fone': " + coockies.containsKey("Fone"));
        System.out.println("Contém 'Anelisi': " + coockies.containsValue("Anelisi"));
        System.out.println("Size : " + coockies.size());

        System.out.println("\n==== ALL COOCKIES ====");
        for (String k: coockies.keySet()){
            System.out.println(k + " : " + coockies.get(k));
        }
        coockies.put("Salário", "4400.00");
        coockies.put("Cargo", "Desenvolvedora Jr");
        coockies.put("Universidade", "Unisinos");
        coockies.put("Status", "Cursando");

        System.out.println("\n==== ALL COOCKIES ====");
        for (String k: coockies.keySet()){
            System.out.println(k + " : " + coockies.get(k));
        }
        System.out.println("\nSize : " + coockies.size());
        coockies.remove("Status");
        coockies.put("Cargo", "Desenvolvedora Plena");
        coockies.put("Salário", "8400.00");

        System.out.println("\n==== ALL COOCKIES ====");
        for (String k: coockies.keySet()){
            System.out.println(k + " : " + coockies.get(k));
        }
        System.out.println("\nSize : " + coockies.size());
    }
}
