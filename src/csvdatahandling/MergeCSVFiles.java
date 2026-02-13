package csvdatahandling;

import java.io.*;
import java.util.*;

public class MergeCSVFiles {

    static class Student {
        String id;
        String name;
        String age;
        String marks;
        String grade;

        Student(String id, String name, String age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) throws Exception {

        Map<String, Student> map = new HashMap<>();

        // 1️⃣ Read students1.csv
        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        String line;

        br1.readLine(); // skip header
        while ((line = br1.readLine()) != null) {
            String[] data = line.split(",");
            map.put(data[0], new Student(data[0], data[1], data[2]));
        }
        br1.close();

        // 2️⃣ Read students2.csv
        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
        br2.readLine(); // skip header

        while ((line = br2.readLine()) != null) {
            String[] data = line.split(",");
            Student s = map.get(data[0]);
            if (s != null) {
                s.marks = data[1];
                s.grade = data[2];
            }
        }
        br2.close();

        // 3️⃣ Write merged CSV
        BufferedWriter bw = new BufferedWriter(new FileWriter("merged_students.csv"));
        bw.write("ID,Name,Age,Marks,Grade\n");

        for (Student s : map.values()) {
            bw.write(s.id + "," + s.name + "," + s.age + "," +
                    s.marks + "," + s.grade + "\n");
        }

        bw.close();

        System.out.println("CSV files merged successfully!");
    }
}
