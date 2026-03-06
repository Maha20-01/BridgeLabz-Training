package practice;
import com.fasterxml.jackson.databind.*;

import java.io.File;

public class ReadSpecificFields {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = mapper.readTree(
                new File("src/main/resources/user.json")
        );

        System.out.println(node.get("name").asText());
        System.out.println(node.get("email").asText());
    }
}