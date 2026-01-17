package level1;

class Hotel{
	private String guestName;
	private String roomType;
	private int nights;
	
	
	public Hotel() {
		this.guestName=" a";
		this.roomType="h";
		this.nights=0;
	}
	
	public Hotel(String guestName,String roomType,int nights) {
           this.guestName=guestName;
           this.roomType=roomType;
           this.nights=nights;
           
	}
	public Hotel(Hotel h) {
        this.guestName=h.guestName;
        this.roomType=h.roomType;
        this.nights=h.nights;
        
	}
	
	void display() {
		System.out.println("guest name ="+guestName );
		System.out.println("roomType ="+roomType );
		System.out.println("nights ="+nights );


	}
}



public class HotelBooking {
public static void main(String args[]) {
	Hotel h1=new Hotel("maha","luxury",10);
	h1.display();
	Hotel h2=new Hotel(h1);
	h2.display();

}
}
