package homework.hibernate.ex2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class HouseOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "houseOwner", cascade = CascadeType.ALL)
    private Set<House> houses = new HashSet<>();
    public HouseOwner(String name) {
        this.name = name;
    }
    public HouseOwner() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<House> getHouses() {
        return houses;
    }
    public void setHouses(Set<House> houses) {
        this.houses = houses;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseOwner that = (HouseOwner) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "HouseOwner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
