package csvdatahandling.jsontocsv;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JsonToCsv {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // 1️⃣ Read JSON file
        Student[] students =
                mapper.readValue(new File("students.json"), Student[].class);

        // 2️⃣ Write CSV file
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));

        bw.write("ID,Name,Age,Marks");
        bw.newLine();

        for (Student s : students) {
            bw.write(s.id + "," + s.name + "," + s.age + "," + s.marks);
            bw.newLine();
        }

        bw.close();
        System.out.println("JSON → CSV done");
    }
}
