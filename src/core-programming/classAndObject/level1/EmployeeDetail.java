package level1;

	
    class Employee{
	   String name;
	   int id;
	   int salary;
	   
	   
	   void showDetails() {
		   System.out.println("Name of the employee : "+name);	
		   System.out.println("ID of the employee : "+id);		   

		   System.out.println("Salary of the employee : "+salary);		   

	   }
	   
	   
	   
   }
	

    public class EmployeeDetail {
public static void main(String[] args){
	Employee e1=new Employee();
	e1.name="Maha";
	e1.id=300;
	e1.salary=23000;
	e1.showDetails();
	
}
}
