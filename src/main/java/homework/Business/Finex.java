package homework.Business;

import org.w3c.dom.ls.LSOutput;

public class Finex extends Company {

    private int amountOfShares;
    private int countOfShare;

    public Finex(String director, int employee, int marketValue,int amountOfShares,int countOfShare) {
        super(director, employee, marketValue);
        this.amountOfShares = amountOfShares;
        this.countOfShare = countOfShare;
    }

    public void sellShares(int n){
        amountOfShares -=n;
        System.out.println("Finex продала " + n + " акций") ;
    }

    public int getAmountOfShares() {
        return amountOfShares;
    }

    public void setAmountOfShares(int amountOfShares) {
        this.amountOfShares = amountOfShares;
    }

    public int getCountOfShare() {
        return countOfShare;
    }

    public void setCountOfShare(int countOfShare) {
        this.countOfShare = countOfShare;
    }

    @Override
    public void printSpecificInfo() {
        super.printSpecificInfo();
        System.out.println("Количество акций " + amountOfShares + " Стоимость одной акции " + countOfShare);
    }
}
