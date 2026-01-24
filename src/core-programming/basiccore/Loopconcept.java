package practiceproblems;

class Vehicle {

	String ownerName;
	String vehicleType;
	
	static int registrationFee =30;
	
     Vehicle(String ownerName,String vehicleType){
    	 this.ownerName=ownerName;
    	 this.vehicleType=vehicleType;
     }
	
     public void display() {
    	 System.out.println("the owner name is : "+ownerName);
    	 System.out.println("the vehicle type is : "+vehicleType);
    	 System.out.println("The registration fee is : "+registrationFee);

     }
    public int updateRegistrationFee() {
    	 int fee;
    	 fee = registrationFee*5;
    	 return fee;
     }
     
}
public class Loopconcept {
	
public static void main(String[] args) {
	Vehicle v1= new Vehicle("maha","car");
	v1.display();
	Vehicle v2= new Vehicle("shaj","lorry");
    v1.updateRegistrationFee()
}

}
