package csvdatahandling.encryption;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteEncryptedCSV {

    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("secure_employees.csv"));

        // Header
        bw.write("ID,Name,Email,Salary");
        bw.newLine();

        // Employee data (meaningful values)
        bw.write("101,Maha," +
                CryptoUtil.encrypt("maha@gmail.com") + "," +
                CryptoUtil.encrypt("50000"));
        bw.newLine();

        bw.write("102,Ravi," +
                CryptoUtil.encrypt("ravi@yahoo.com") + "," +
                CryptoUtil.encrypt("45000"));
        bw.newLine();

        bw.write("103,Anu," +
                CryptoUtil.encrypt("anu@company.com") + "," +
                CryptoUtil.encrypt("60000"));
        bw.newLine();

        bw.close();
        System.out.println("Encrypted CSV file created successfully!");
    }
}
