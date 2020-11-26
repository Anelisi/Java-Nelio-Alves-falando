package Interfaces;

public class RentalServices {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double basicPayment;
        double hour = (double) (t2 - t1) / 1000 / 60 / 60;
        if (hour <= 12) {
           basicPayment = Math.ceil(hour) * pricePerHour;
        } else basicPayment = Math.ceil(hour / 24) * pricePerDay;

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }

}
