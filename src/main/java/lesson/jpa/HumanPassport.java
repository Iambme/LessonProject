package lesson.jpa;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class HumanPassport {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private int seria;
    private int number;

    @OneToOne(mappedBy = "humanPassport", cascade = CascadeType.ALL) //связываем сущность Passport с сущностью Human по полю passport в классе Human
    private Human human;


    public HumanPassport() {
    }

    public HumanPassport(int seria, int number) {
        this.seria = seria;
        this.number = number;
    }

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

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanPassport humanPassport = (HumanPassport) o;
        return id == humanPassport.id &&
                seria == humanPassport.seria &&
                number == humanPassport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seria, number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", seria=" + seria +
                ", number=" + number +
                '}';
    }
}
