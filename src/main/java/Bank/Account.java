package Bank;

public class Account {
    private Integer number;
    private String holder;
    protected double balance;
    private int tipoConta;

    public Account() {    }

    public Account(Integer number, String holder, double balance, int tipoConta) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.tipoConta = tipoConta;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void withDraw(double amount) {
        balance -= amount;
        System.out.println("Saldo da conta: R$ " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Saldo da conta: R$ " + balance);
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Account [" +
                "number= " + number +
                ", holder= '" + holder + '\'' +
                ", balance= " + balance +
                ']';
    }
}
