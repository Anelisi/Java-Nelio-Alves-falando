package Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Comparable {

    public static void main(String[] args) {
        List<Family> list = new ArrayList<>();
        String path = "C:\\Users\\SouthSystem\\Desktop\\Java_Nélio\\familyList.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String familyCSV = br.readLine();

            while (familyCSV != null){
                String[] fields = familyCSV.split(",");
                list.add(new Family(fields[0], Integer.parseInt(fields[1])));
                familyCSV = br.readLine();
            }
            Collections.sort(list);
            for (Family f : list) {
                System.out.println(f.getName() + ", " + f.getNumber());
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
