package level2;
class Book {

    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) 
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }
}

class EBook extends Book 
{

    EBook(String ISBN, String title, String author) 
    {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println(ISBN);
        System.out.println(title);
        System.out.println(getAuthor());
    }
}

public class BookLibrary 
{
    public static void main(String[] args) 
    {

        EBook e = new EBook("93", "Java Basics", "James");
        e.display();

        e.setAuthor("Oracle");
        e.display();
    }
}



