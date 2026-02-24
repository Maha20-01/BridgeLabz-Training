package ioprogramming.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDecryptedCSV {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("secure_employees.csv"));

        String line;
        br.readLine(); // skip header

        System.out.println("Decrypted Employee Data:");

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String id = data[0];
            String name = data[1];
            String email = CryptoUtil.decrypt(data[2]);
            String salary = CryptoUtil.decrypt(data[3]);

            System.out.println(
                    id + " " + name + " " + email + " " + salary
            );
        }

        br.close();
    }
}
