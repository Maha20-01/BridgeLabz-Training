package level2;
class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    
    Student(int rollNumber, String name, double CGPA)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    

    public double getCGPA()
    {
        return CGPA;
    }

    public void setCGPA(double CGPA) 
    {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student
{

    PostgraduateStudent(int rollNumber, String name, double CGPA) 
    {
        super(rollNumber, name, CGPA);
    }

    void display() 
    {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCGPA());
    }
}

public class UniversityManagement
{
    public static void main(String[] args) 
    {

        PostgraduateStudent p = new PostgraduateStudent(101, "Maha", 8.9);
        p.display();
        p.setCGPA(9.2);
        p.display();
    }
}



