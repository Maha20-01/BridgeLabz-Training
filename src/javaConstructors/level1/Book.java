package level1;

class Bookclass{
	private String title;
	private String author;
	private int price;

	
	public Bookclass() {
		this.title="a";
		this.author="b";
		this.price=0;
	}
	
	public Bookclass(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;

	}
      void display() {
    	  System.out.println("the book name = "+title);
    	  System.out.println("the book author = "+author);
    	  System.out.println("the book price = "+price);

      }
}




public class Book {
public static void main(String[] args) {
	Bookclass b1=new Bookclass("titanic","cameron",987);
	b1.display();
}
}
