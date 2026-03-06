package practice;


import model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

public class CreateStudentJSON {

    public static void main(String[] args) throws Exception {

        Student s = new Student();
        s.name = "Maha";
        s.age = 23;
        s.subjects = Arrays.asList("Java","SQL","DSA");

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(
                new java.io.File("src/main/resources/user.json"),
                s
        );

        System.out.println("Student JSON created");
    }
}