package PayPal.Services;

import PayPal.Entities.Contract;
import PayPal.Entities.Installments;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContractServices {
    private OnlinePaymentService onlinePaymentService;
    public ContractServices(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void calculations(Contract contract, int mounths, Date date) {
        double bruto = contract.getValue() / mounths;

        for (int i = 1; i < mounths + 1; i ++) {
            double liquido = bruto + onlinePaymentService.interest(bruto,i);
            double total = liquido + onlinePaymentService.paymentFee(bruto);
            date = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installments(date, total));
        }
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");
    private Date addMonths(Date date, int N) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,N);
        return cal.getTime();
    }
}
