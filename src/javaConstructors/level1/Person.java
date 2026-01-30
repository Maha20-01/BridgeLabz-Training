package level1;
class Person1{
	private String name;
	private int empno;
	private String designation;
	
	public Person1(String name,int empno,String designation) {
		this.name=name;
		this.empno=empno;
		this.designation=designation;
	}
		
	public Person1(Person1 p) {
		this.name=p.name;
		this.empno=p.empno;
		this.designation=p.designation;
	}
	
	void display() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee number : "+empno);
		System.out.println("Employee designation : "+designation);
	}

}

public class Person {
public static void main(String[] args) {
	Person1 p1=new Person1("maha",90,"cca");
	p1.display();
	Person1 p2=new Person1(p1);
	p2.display();
}
}
