package Interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_Rental {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental car data: ");
        System.out.print("Car Model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup: dd/MM/yyyy HH:ss ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return: dd/MM/yyyy HH:ss ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start,finish, new Veiculo(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerDay,pricePerHour, new BrazilTaxService());

        rentalServices.processInvoice(cr);

        System.out.println("INVOICE: ");

        System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total Payment: " + String.format(" %.2f", cr.getInvoice().getTotalPayment()));

    }
}
