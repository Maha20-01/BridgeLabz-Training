package handsOn;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterUsers {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode array = mapper.readTree(new File("src/main/resources/handsonusers.json"));

        for(JsonNode node : array) {

            int age = node.get("age").asInt();

            if(age > 25) {

                System.out.println(node.get("name").asText());
            }
        }
    }
}