package csvdatahandling;

import java.io.*;
import java.util.*;

public class ConvertCSVToObject {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();

        // Read CSV from project root
        File file = new File("students.csv");

        if (!file.exists()) {
            System.out.println("students.csv not found at: " + file.getAbsolutePath());
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int age = Integer.parseInt(data[2]);
            int marks = Integer.parseInt(data[3]);

            students.add(new Student(id, name, age, marks));
        }

        br.close();

        // Print all Student objects
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Inner Student class
    static class Student {
        int id;
        String name;
        int age;
        int marks;

        Student(int id, String name, int age, int marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + age + " " + marks;
        }
    }
}
