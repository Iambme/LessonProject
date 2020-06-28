package homework.genericDoc;

public class DocReader<T extends Doc> {



    public void write(T t, String newText) {
        t.writeDoc(newText);
    }

    public void read(T t) {
        System.out.println(t.toString());
    }

    public void remove(T t) {
        System.out.println("Документ удалён");
        t.setDocAuthor(null);
        t.setDocText(null);
    }

    public void edit(T t, String anotherAuthor,String newDocText) {
        t.setDocAuthor(anotherAuthor);

        t.setDocText(new StringBuilder(""));
        t.writeDoc(newDocText);
    }
}
