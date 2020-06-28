package homework.Business;

public class Finam extends Company {
    private double brokersCommission;

    public Finam(String director, int employee, int marketValue, double brokersCommission) {
        super(director, employee, marketValue);
        this.brokersCommission = brokersCommission;
    }
    public void commissionReduction(double reductionCount){
        brokersCommission -= reductionCount;
        System.out.println("брокерская комиссия уменьщена на " + reductionCount);
    }

    public double getBrokersCommission() {
        return brokersCommission;
    }

    public void setBrokersCommission(double brokersCommission) {
        this.brokersCommission = brokersCommission;
    }

    @Override
    public void printSpecificInfo() {
        super.printSpecificInfo();
        System.out.println("Брокерская комиссия " + brokersCommission);
    }
}
