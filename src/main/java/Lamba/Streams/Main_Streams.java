package Lamba.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main_Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        Stream<String> st2 = Stream.of("Anelis", "Arthur", "Marie", "Pina", "Licodêncio");
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        Stream<Long> fibo = Stream.iterate(new Long[]{0L,1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);

        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        System.out.println("\n======== FIBONACCI =========\n" + Arrays.toString(fibo.limit(10).toArray()));

    }
}
