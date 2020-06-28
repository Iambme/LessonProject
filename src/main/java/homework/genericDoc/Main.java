package homework.genericDoc;

public class Main {
    public static void main(String[] args) {
        DocReader<Doc> documentReader = new DocReader<>();
        Text text1 = new Text("Plato");
        Excel excel1 = new Excel("Zina");
        Word word1 = new Word("Stepan");

        documentReader.write(text1, "Документ Платона");

        documentReader.read(text1);

        documentReader.remove(text1);

        documentReader.read(text1);

        documentReader.write(word1,"Новый документ");
        documentReader.read(word1);

        documentReader.edit(excel1,"Masha","New text");
        documentReader.read(excel1);
    }
}
