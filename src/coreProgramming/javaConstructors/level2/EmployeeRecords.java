package level2;
class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) 
    {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
}

class Manager extends Employee 
{

    Manager(int employeeID, String department, double salary) 
    {
        super(employeeID, department, salary);
    }

    void display() 
    {
        System.out.println(employeeID);
        System.out.println(department);
        System.out.println(getSalary());
    }
}

public class EmployeeRecords 
{
    public static void main(String[] args)
    {

        Manager m = new Manager(501, "IT", 75000);
        m.display();

        m.setSalary(85000);
        m.display();
    }
}



