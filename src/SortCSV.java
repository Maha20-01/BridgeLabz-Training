package csvdatahandling;

import java.io.*;
import java.util.*;

public class SortCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        List<String[]> list = new ArrayList<>();
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            list.add(line.split(","));
        }

        list.sort((a, b) ->
                Integer.parseInt(b[3]) - Integer.parseInt(a[3])
        );

        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }
        br.close();
    }
}
