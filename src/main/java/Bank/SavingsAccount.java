package Bank;

public final class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount() {    }

    public SavingsAccount(Integer number, String holder, double balance, int tipoConta, double interestRate) {
        super(number, holder, balance, tipoConta);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += (balance * interestRate);
        System.out.println("Saldo da conta: R$ " + balance);
    }

    @Override
    public final void withDraw(double amount) {
        balance -= amount;
        System.out.println("Saldo da conta: R$ " + balance);
    }

    @Override
    public String toString() {
        return "SavingsAccount[" +
                "interestRate= " + interestRate +
                ", balance= " + balance +
                "] " + super.toString();
    }
}
