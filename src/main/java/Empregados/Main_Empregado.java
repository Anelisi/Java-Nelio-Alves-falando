package Empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Empregado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        System.out.println("Quantos empregados queres cadastrar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            Integer id = i;
            id++;
            System.out.println("----------------------------\nDigite o nome do empregado: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: R$ ");
            Double vlrHora = sc.nextDouble();

            System.out.println("Terceirizado? (S/N)");
            char ch = sc.next().charAt(0);

            if (ch == 'N') {
                Double salario = (vlrHora * horas) * 22;
                empregados.add(new Empregado(id,nome,salario));
            } else {
                System.out.println("Adicional: R$ ");
                Double adicional = sc.nextDouble();
                Double salario = (vlrHora * horas) * 22 + adicional;
                empregados.add(new EmpregadoTerceirizado(id,nome,salario,adicional));
            }
        }

        for (int i = 0; i < n; i++){
            Integer p = positionID(empregados,(i + 1));
            System.out.println("\nEmpregado #" + (i + 1)  + ": " );
            System.out.println("----------------------------\n" + empregados.get(p).toString());
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
