package handsOn;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJSONFiles {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 =
                (ObjectNode) mapper.readTree(new File("src/main/resources/handsonFile1.json"));

        ObjectNode json2 =
                (ObjectNode) mapper.readTree(new File("src/main/resources/handsonFile2.json"));

        json1.setAll(json2);

        mapper.writeValue(new File("src/main/resources/handsonmerged.json"), json1);

        System.out.println("JSON files merged");
    }
}