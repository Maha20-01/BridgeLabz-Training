package csvdatahandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        br.readLine();

        Pattern email = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w+$");
        Pattern phone = Pattern.compile("\\d{10}");

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (!email.matcher(d[2]).matches() ||
                    !phone.matcher(d[3]).matches()) {
                System.out.println("Invalid Row: " + line);
            }
        }
        br.close();
    }
}
