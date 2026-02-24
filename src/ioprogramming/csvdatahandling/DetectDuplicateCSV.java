package ioprogramming.csvdatahandling;


import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {

    public static void main(String[] args) throws Exception {

        File file = new File("delstudents.csv");

        if (!file.exists()) {
            System.out.println("CSV file not found!");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        Set<String> ids = new HashSet<>();

        br.readLine(); // skip header

        System.out.println("Duplicate records:");

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");
            String id = data[0];

            // If ID already exists, it's a duplicate
            if (!ids.add(id)) {
                System.out.println(line);
            }
        }

        br.close();
    }
}
