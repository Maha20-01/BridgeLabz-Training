package level1;

class Car {
	private String cusName;
	private String model;
	private int rentdays;
	
	public Car()
	{
		this.cusName="d ";
		this.model=" b";
		this.rentdays=0;
	}
	
	public Car(String cusName ,String model,int rentdays) {
		this.cusName=cusName;
		this.model=model;
		this.rentdays=rentdays;
}
    int calculate() {
    	int cal;
	cal=rentdays*10;
	return cal;
	}
	
	void display() {
		System.out.println("customer name = "+cusName);
		System.out.println("model = "+model);
		System.out.println("rental days = "+rentdays);
		System.out.println("total = "+calculate());
		

	}
		
}
		
	
	public class CarRental{
		public static void main(String[] args) {
		Car c1=new Car("maha","bmw",10);
		c1.display();
	}}