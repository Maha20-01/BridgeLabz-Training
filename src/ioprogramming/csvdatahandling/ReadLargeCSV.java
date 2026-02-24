package ioprogramming.csvdatahandling;

import java.io.*;
import java.util.*;

public class ReadLargeCSV {

    private static final int BATCH_SIZE = 100;

    public static void main(String[] args) throws Exception {

        File file = new File("largefile.csv");

        if (!file.exists()) {
            System.out.println("CSV file not found!");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        int totalRecords = 0;

        List<String> batch = new ArrayList<>(BATCH_SIZE);

        // Skip header
        br.readLine();

        while ((line = br.readLine()) != null) {

            batch.add(line);
            totalRecords++;

            // Process 100 lines at a time
            if (batch.size() == BATCH_SIZE) {
                processBatch(batch);
                batch.clear(); // free memory
                System.out.println("Processed records: " + totalRecords);
            }
        }

        // Process remaining records (<100)
        if (!batch.isEmpty()) {
            processBatch(batch);
            System.out.println("Processed records: " + totalRecords);
        }

        br.close();
        System.out.println("Finished processing file.");
    }

    // Simulate processing
    private static void processBatch(List<String> batch) {
        // Example: just iterate (real apps may insert into DB, validate, etc.)
        for (String record : batch) {
            // processing logic here
        }
    }
}
