package Sets;

import java.util.*;

public class Main_Set {
    public static void main(String[] args) {
         // HashSet -> é rápido, mas não mantém ordem; TreeSet -> é mais rápido e mantém a ordem
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        Set<String> set = new LinkedHashSet<>();

        set.add("Anelisi");
        set.add("Arthur");
        set.add("Coisinha");
        set.add("Marie");
        set.add("Pina");
        set.add("Licodêncio");

        set.removeIf(x -> x.charAt(0) == 'C');


        System.out.println(set.contains("Anelisi"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}
