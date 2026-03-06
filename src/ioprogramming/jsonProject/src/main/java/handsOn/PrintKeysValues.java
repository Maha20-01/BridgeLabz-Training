package handsOn;

import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class PrintKeysValues {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = mapper.readTree(
                new File("src/main/resources/handsonuser.json")
        );
        Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

        while(fields.hasNext()) {

            Map.Entry<String, JsonNode> field = fields.next();

            System.out.println(field.getKey() + " : " + field.getValue());
        }
    }
}