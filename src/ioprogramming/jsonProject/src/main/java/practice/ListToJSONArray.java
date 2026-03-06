package practice;

import model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class ListToJSONArray {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.name = "Kaviya";
        s1.age = 23;

        Student s2 = new Student();
        s2.name = "Arun";
        s2.age = 25;

        students.add(s1);
        students.add(s2);

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(
                new java.io.File("src/main/resources/listtostudent.json"),
                students
        );
    }
}