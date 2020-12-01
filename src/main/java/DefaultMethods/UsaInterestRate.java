package DefaultMethods;

public class UsaInterestRate implements InterestService {
    double interestRate;

    public UsaInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
