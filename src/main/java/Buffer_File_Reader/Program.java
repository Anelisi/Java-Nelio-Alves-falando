package Buffer_File_Reader;

import java.io.*;

public class Program {

    public static void main(String[] args) {


        String path = "C:\\Users\\SouthSystem\\tia_Ani.txt";

        String[] lines = new String[] {"\nCongratulations aunt Ani !!!\n", "Keep on studying ... You will achieve " +
                "many things !!! "};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){

            for (String l: lines) {

                bw.write(l);
                bw.newLine();

            }
        }catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }


        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}