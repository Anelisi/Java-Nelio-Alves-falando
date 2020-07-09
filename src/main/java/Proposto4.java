import java.util.Scanner;

public class Proposto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A que horas começou o  jogo? ");
        int horaInicial = sc.nextInt();
        System.out.println("A que horas terminou o  jogo? ");
        int horaFinal = sc.nextInt();
        int duração;

        if (horaInicial < horaFinal) {
            duração = horaInicial - horaFinal;
        }
        else {
            duração = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duração + " HORA(S)");
        sc.close();
    }
}
