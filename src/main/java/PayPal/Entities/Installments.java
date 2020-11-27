package PayPal.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installments {
    private Date date;
    private double amount;

    public Installments() {    }

    public Installments(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");

    @Override
    public String toString() {
        return sdf.format(date) + " - " + String.format("%.2f", amount);
    }
}
