package homework.genericDoc;

public abstract class Doc {
    private StringBuilder docText = new StringBuilder("");
    private String docAuthor;

    public Doc(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    public StringBuilder getDocText() {
        return docText;
    }

    public void setDocText(StringBuilder docText) {
        this.docText = docText;
    }

    public String getDocAuthor() {
        return docAuthor;
    }

    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }


    public void writeDoc(String docText) {
        this.docText.append(docText);
    }

    @Override
    public String toString() {
        return  "Author " + docAuthor + "\n" + docText;
    }
}
