package level2;
class Course
{

    String courseName;
    int duration;
    int fee;

    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, int fee)
    {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() 
    {
        System.out.println(courseName);
        System.out.println(duration);
        System.out.println(fee);
        System.out.println(instituteName);
    }

    static void updateInstituteName(String name) 
    {
        instituteName = name;
    }
}


public class CourseManagement 
{


    public static void main(String[] args)
    {

        Course c1 = new Course("Java", 6, 30000);
        Course c2 = new Course("Python", 4, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}



