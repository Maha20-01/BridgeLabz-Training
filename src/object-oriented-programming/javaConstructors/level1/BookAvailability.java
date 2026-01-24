package level1;

class Book2{
	private String title;
	private String author;
	private int price;
	private int avail;
	
	public Book2()
	{
		this.title="d ";
		this.author="d";
		this.price=0;
		this.avail=0;
	}
	
	public Book2(String title,String author,int price,int avail) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.avail=avail;
		
	}
	public int borrow(int bow) {
		if(avail<0)
		{
			return -1;
		}
		else {
			
		}
		avail =avail-bow;
		return avail;
	}
	void display() {
		System.out.println("The Book titile = "+title);
		System.out.println("The Book author = "+author);
		System.out.println("The Book price = "+price);
		System.out.println("The Book availibity = "+avail);



	}
	
}



public class BookAvailability {
public static void main(String[] args) { 
	Book2 b1=new Book2("titanic","cameron",980,4);
	b1.display();
	b1.borrow(2);
	b1.display();
	
	
	
}
}
