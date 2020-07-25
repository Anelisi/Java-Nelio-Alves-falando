package casa_do_estudante;

import java.util.Scanner;

public class Casa_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Casa_do_estudante[] quarto = new Casa_do_estudante[10];
        Estudante[] e = new Estudante[10];
        int i = 0;
        String resp;

        System.out.println("Olá!\nSejam bem vindos à Casa do Estudante da Unisinos!\nPressione ENTER para iniciarmos o seu check-in.");

        do {
            sc.nextLine();
            System.out.println("Nome do estudante: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("E-mail: ");
            String email = sc.nextLine();
            System.out.println("Matricula: ");
            int matricula = sc.nextInt();
            System.out.println("Escolha o nº do seu quarto: ");
            int q = sc.nextInt();

            quarto[q] = new Casa_do_estudante(900.00,q);

            e[i] = new Estudante(nome, email, idade, matricula,quarto[q]);

/*
            System.out.println(e[i].toString());
            System.out.println(quarto[q].toString());
*/
            System.out.println("Quer cadastrar outro Estudante? S/N");
            resp = sc.next();
            i++;

        } while(resp.equalsIgnoreCase("S"));



        for (int v = 0; v < e.length; v++){
            if (e[v] != null){
                System.out.printf("-------------------------\n%dº Rent: \n-------------------------", v + 1);
                System.out.printf("\nNome: %s\nIdade: %d\nE-mail: %s\nMatrícula: %d\nQuarto: %d\nMensalidade: R$ %.2f\n", e[v].getNome(),e[v].getIdade(),e[v].getEmail(),e[v].getMatricula(),e[v].getQuarto().getnQuarto(), e[v].getQuarto().getValor());
            }
        }
    }

}
