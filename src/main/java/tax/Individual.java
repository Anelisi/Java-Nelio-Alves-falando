package tax;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() {    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax = (getAnualIncome() < 2000.00)?  getAnualIncome() * 0.15 :  getAnualIncome() * 0.25;

        basicTax -= getHealthExpenditures() * 0.5;

        if (getHealthExpenditures() < 0.00){
            basicTax = 0.00;
        }
        return basicTax;
    }
}
