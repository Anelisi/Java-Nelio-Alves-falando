package PayPal.Entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private int number;
    private Date date;
    private Double value;

    List<Installments> installments = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");

    public Contract() {    }

    public Contract(int number, Date date, Double value) {
        this.number = number;
        this.date = date;
        this.value = value;

    }

    public int getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public Double getValue() {
        return value;
    }

    public List<Installments> getInstallments() {
        return installments;
    }
}
