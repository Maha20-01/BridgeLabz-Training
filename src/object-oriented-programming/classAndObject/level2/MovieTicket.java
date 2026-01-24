package level2;

class Moviebook{
	String movieName;
	int seatNumber;
	
	
	Moviebook(String m , int s){
		movieName=m;
		seatNumber=s;
	}
	
	 int booking() {
		 int price;
           if(seatNumber >=80 && seatNumber<100)
           {     
        	 price=600 ;
        	 return price;
           }
           else if(seatNumber >=50 && seatNumber<80) {
        	  price=300 ;
          	 return price;

           }
           else if(seatNumber >=1 && seatNumber<50) {
        	   price=150 ;
          	 return price;


           }
           else {
                  return -1;       
}
	 }
	 
	 void display() {
  	   System.out.println("movie name = : "+movieName);
  	   System.out.println("seat Number = : "+seatNumber);
  	   System.out.println("price = : "+booking());


	 }
}

public class MovieTicket {
public static void main(String[] args) {
	Moviebook m1=new Moviebook("avathar",77);
	m1.display();

}}
