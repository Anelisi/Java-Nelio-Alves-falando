package CoringasDelimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_Coringas {
    public static void main(String[] args) {
        List<Integer> myInts =  Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(04.14, 17.08, 19.87);
        List<Object> myObj = new ArrayList<>();

        copy(myInts, myObj);
        print(myObj);
        copy(myDoubles, myObj);
        print(myObj);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){ // source = variância e destiny = contravariânica
        for (Number n: source) {
            destiny.add(n);
        }
    }

    public static void print(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " | ");
        }
        System.out.println();
    }
}
