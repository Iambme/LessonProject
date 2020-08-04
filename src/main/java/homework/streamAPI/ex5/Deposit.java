package homework.streamAPI.ex5;

public class Deposit {
    private int investmentTerm;
    private double percent;

    public Deposit(int investmentTerm, double percent) {
        this.investmentTerm = investmentTerm;
        this.percent = percent;
    }

    public int getInvestmentTerm() {
        return investmentTerm;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "investmentTerm=" + investmentTerm +
                ", percent=" + percent +
                '}';
    }
}
