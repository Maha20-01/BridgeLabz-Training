package handsOn;

import com.opencsv.CSVReader;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.util.*;

public class CSVtoJSON {

    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("src/main/resources/data.csv"));

        List<Map<String,String>> list = new ArrayList<>();

        String[] header = reader.readNext();
        String[] line;

        while((line = reader.readNext()) != null) {

            Map<String,String> map = new HashMap<>();

            for(int i=0;i<header.length;i++)
                map.put(header[i], line[i]);

            list.add(map);
        }

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new java.io.File("src/main/resources/data.json"), list);

        System.out.println("CSV converted to JSON");
    }
}