package homework.spring.ex1.model;


import javax.persistence.*;


@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private int number;

    public License(int number) {
        this.number = number;
    }

    public License() {
    }

    @OneToOne(mappedBy = "license", cascade = CascadeType.ALL)
    private Human human;


    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "License " +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
