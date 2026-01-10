package level1;

class Book{
	String title;
	String author;
	int price;
	
	void showdetails()
	{
		System.out.println("the name of the book: "+title);
		System.out.println("the author of the book: "+author);
		System.out.println("the price of the book: "+price);


	}
}


public class BookDetails {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.title="Titanic";
		b1.author ="cameron";
		b1.price=890;
		b1.showdetails();
	}
}
