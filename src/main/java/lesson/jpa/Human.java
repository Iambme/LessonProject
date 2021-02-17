package lesson.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    //@OneToOne(fetch =  FetchType.LAZY) //будет загружено только при обращении к полю
    //@OneToOne(fetch =  FetchType.EAGER) //будет загружено сразу при загрузке объекта human
    @OneToOne(cascade = CascadeType.ALL) //по умолчанию EAGER
    @JoinColumn(name = "passport_id") //создаем столбец passport_id в таблице human
    private HumanPassport humanPassport;

//    public Human() {
//    }
//
//    public Human(String name) {
//        this.name = name;
//    }
//
//
//    public HumanPassport getHumanPassport() {
//        return humanPassport;
//    }
//
//    public void setHumanPassport(HumanPassport humanPassport) {
//        this.humanPassport = humanPassport;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Human human = (Human) o;
//        return id == human.id &&
//                Objects.equals(name, human.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Human{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
