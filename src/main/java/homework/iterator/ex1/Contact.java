package homework.iterator.ex1;

import java.util.Objects;

public class Contact {
    private String name;
    private String mail;

    public Contact(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(mail, contact.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mail);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
