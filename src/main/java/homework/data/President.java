package homework.data;

import java.util.Date;
import java.util.Objects;

public class President implements Comparable<President> {
    private String name;
    private Date dateFirst;
    private Date dateLast;
    private String party;

    public President(String name, Date dateFirst, Date dateLast, String party) {
        this.name = name;
        this.dateFirst = dateFirst;
        this.dateLast = dateLast;
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public Date getDateFirst() {
        return dateFirst;
    }

    public Date getDateLast() {
        return dateLast;
    }

    public String getParty() {
        return party;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        President president = (President) o;
        return Objects.equals(name, president.name) &&
                Objects.equals(dateFirst, president.dateFirst) &&
                Objects.equals(dateLast, president.dateLast) &&
                Objects.equals(party, president.party);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateFirst, dateLast, party);
    }

    @Override
    public String toString() {
        return "President{" +
                name + " " +
                dateFirst +
                "-" + dateLast +
                " " + party +
                '}';
    }



    @Override
    public int compareTo(President o) {
        return 0;
    }
}
