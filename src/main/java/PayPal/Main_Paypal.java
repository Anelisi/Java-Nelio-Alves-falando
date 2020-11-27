package PayPal;

import PayPal.Entities.Contract;
import PayPal.Entities.Installments;
import PayPal.Services.ContractServices;
import PayPal.Services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_Paypal {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date: dd/mm/aaaa ");
        Date date = sdf.parse(sc.nextLine());
        System.out.print("Contract value:  ");
        Double value = sc.nextDouble();
        System.out.print("Payment installments: ");
        int installment = sc.nextInt();

        Contract contract = new Contract(number,date,value);
        ContractServices cs = new ContractServices(new PaypalService());

        System.out.println("Installments: ");
        cs.calculations(contract, installment, date);

        for (Installments it: contract.getInstallments()) {
            System.out.println(it);
        }
    }
}
