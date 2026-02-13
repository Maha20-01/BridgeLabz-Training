package csvdatahandling;

import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Ravi,IT,50000\n");
        bw.write("2,Anu,HR,40000\n");
        bw.write("3,Kiran,IT,55000\n");
        bw.write("4,Meena,Finance,60000\n");
        bw.write("5,Suresh,IT,52000\n");

        bw.close();
        System.out.println("CSV written successfully");
    }
}
