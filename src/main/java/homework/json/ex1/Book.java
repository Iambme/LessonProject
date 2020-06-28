package homework.json.ex1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String author;
    private String title;
    private List<Page> pageList;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        pageList = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }
    public void add(Page page){
        pageList.add(page);
    }
    public void remove(int index){
        pageList.remove(index);
    }

}
