import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int mat [][] = new int[n][n];

       /* for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Números das diagonais: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " | ");
        }
        int cont = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.println("\nQuantia de nº negativos:  " + cont);*/

        int matrix[][] = new int[n][m];
        for (int i = 0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length / 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
