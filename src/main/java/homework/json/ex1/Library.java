package homework.json.ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String address;
    private List<Book> bookList;

    public Library(String address) {
        this.address = address;
        bookList = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void add(Book book) {
        bookList.add(book);
    }

    public void remove(int index) {
        bookList.remove(index);
    }
}
