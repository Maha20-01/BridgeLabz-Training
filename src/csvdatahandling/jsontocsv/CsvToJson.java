package csvdatahandling.jsontocsv;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            students.add(new Student(
                    Integer.parseInt(d[0]),
                    d[1],
                    Integer.parseInt(d[2]),
                    Integer.parseInt(d[3])
            ));
        }

        br.close();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("students_converted.json"), students);

        System.out.println("CSV → JSON done");
    }
}
