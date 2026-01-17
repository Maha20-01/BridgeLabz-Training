package level1;

class MobilePhone{
	String brand;
	String model;
	int price;
	
	void showDetails() {
		System.out.println("Mobile brand is : "+brand);
		System.out.println("Mobile Model is : "+model);
		System.out.println("Mobile price is : "+price);

	}
}

public class MobilePhoneDetails {
public static void main(String[] args) {
	MobilePhone m1=new MobilePhone();
	m1.brand="Realme";
	m1.model="Realme 10 pro";
	m1.price=19087;
	m1.showDetails();
}
}
