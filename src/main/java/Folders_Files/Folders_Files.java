package Folders_Files;

import java.io.File;
import java.util.Scanner;

public class Folders_Files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("============ FOLDERS ============ ");

        for (File folder: folders) {

            System.out.println(folder);

        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("============ FILES ============ ");
        for (File file: files) {
            System.out.println(file);
        }
        boolean sucesso = new File(strPath + "\\Parabens").mkdir();
        System.out.println("\nDiretório criado com SUCESSO: " + sucesso);
    }
}
