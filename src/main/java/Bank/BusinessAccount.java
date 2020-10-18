package Bank;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount() {    }

    public BusinessAccount(Integer number, String holder, double balance, int tipoConta, double loanLimit) {
        super(number, holder, balance, tipoConta);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount < loanLimit) {
            balance += amount;
            System.out.println("Saldo da conta: R$ " + balance);
        }
    }


    @Override
    public final void withDraw(double amount) {
        super.withDraw(amount);
        balance -= 2.00;
        System.out.println("Saldo da conta: R$ " + balance);
    }

    @Override
    public String toString() {
        return "BusinessAccount [" +
                "loanLimit= " + loanLimit +
                "] " + super.toString();
    }
}
