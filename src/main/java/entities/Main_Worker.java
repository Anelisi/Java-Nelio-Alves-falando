package entities;

import entities.enuns.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_Worker {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("========== Department Data ==========");
        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("\n========== Worker Data ==========");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker1 = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));

        System.out.println("===================================");
        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();
        System.out.println("===================================");

        for (int i = 1; i < n; i ++) {
            System.out.println("Enter contract #" + i + "data: ");
            System.out.println("Date: dd/MM/yyyy");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hour): ");
            int hour = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hour);
            worker1.addContract(contract);
        }
        System.out.println("\nEnter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("===================================");
        System.out.println("Name: " + worker1.getName());
        System.out.println("Department: " + worker1.getDepartment());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker1.income(year,month)));
        System.out.println("===================================");
    }
}
