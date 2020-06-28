package homework.Business;

public class Company {
    private String director;
    private int employee;
    private int marketValue;

    public Company(String director, int employee, int marketValue) {
        this.director = director;
        this.employee = employee;
        this.marketValue = marketValue;
    }

    public void toHire(){
        this.employee++;
        System.out.println("Сотрудник компании " + this.getClass().getSimpleName() +" нанят");

    }
    public void toFire(){
        this.employee--;
        System.out.println("Сотрудник компании " + this.getClass().getSimpleName() +" уволен");
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }

    public String getDirector() {
        return director;
    }

    public int getEmployee() {
        return employee;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void printSpecificInfo(){
        System.out.println("Специфические особенности компании " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Директор компании  " + getClass().getSimpleName() + " : " + getDirector() + " , количество сотрудников : " + getEmployee() + " человек, стоимость компании на мировом рынке : " + getMarketValue() + " $";
    }
}
