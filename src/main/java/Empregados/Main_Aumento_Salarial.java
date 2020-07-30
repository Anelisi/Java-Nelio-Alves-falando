package Empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Aumento_Salarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        System.out.println("Quantos empregados queres cadastrar? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            Integer id = i;
            id++;
            System.out.println("----------------------------\nDigite o nome do empregado: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Informe o salário:");
            Double salario = sc.nextDouble();

            Empregado emp = new Empregado(id,nome,salario);
            empregados.add(emp);

            System.out.println("\nEmpregado #" + (i + 1) + ": " );
            System.out.println("----------------------------\n" + emp.toString());
        }
        System.out.println("----------------------------------------------\nId do empregado que terá o salário aumentado: ");
        int idSalario = sc.nextInt();
        Integer pos = positionID(empregados,idSalario);
        if (pos == null){
            System.out.println("Id inexistente!");
        } else {
            System.out.println("Porcentagem de aumento salarial: ");
            double porcentagem = sc.nextDouble();
            empregados.get(pos).aumentoSalarial(porcentagem);
            System.out.println("----------------------------\n" + empregados.get(pos).toString());
        }
    }
    public static Integer positionID(List<Empregado> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
              return i;
            }

        } return null;

    }
}
