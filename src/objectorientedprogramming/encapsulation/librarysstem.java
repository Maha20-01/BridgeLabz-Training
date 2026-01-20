package objectorientedprogramming.encapsulation;
import java.util.*;

interface reservable {
    void reserve();
    boolean isAvail();
}

abstract class libitem {
    private int itemId;
    private String title;
    private String author;
    private String borrower;

    libitem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    int getItemId() { return itemId; }
    String getTitle() { return title; }
    String getAuthor() { return author; }

    void setBorrower(String borrower) { this.borrower = borrower; }

    abstract int loanDays();

    void show() {
        System.out.println(itemId + " " + title + " " + author + " " + loanDays());
    }
}

class book extends libitem implements reservable {
    private boolean avail = true;

    book(int id, String t, String a) {
        super(id, t, a);
    }

    int loanDays() {
        return 14;
    }

    public void reserve() {
        avail = false;
    }

    public boolean isAvail() {
        return avail;
    }
}

class magazine extends libitem implements reservable {
    private boolean avail = true;

    magazine(int id, String t, String a) {
        super(id, t, a);
    }

    int loanDays() {
        return 7;
    }

    public void reserve() {
        avail = false;
    }

    public boolean isAvail() {
        return avail;
    }
}

class dvd extends libitem implements reservable {
    private boolean avail = true;

    dvd(int id, String t, String a) {
        super(id, t, a);
    }

    int loanDays() {
        return 3;
    }

    public void reserve() {
        avail = false;
    }

    public boolean isAvail() {
        return avail;
    }
}

public class librarysstem {
    public static void main(String[] args) {
        List<libitem> list = new ArrayList<>();

        list.add(new book(1, "Java", "James"));
        list.add(new magazine(2, "Tech", "Editor"));
        list.add(new dvd(3, "AI Doc", "Team"));

        for (libitem i : list)
            i.show();
    }
}
