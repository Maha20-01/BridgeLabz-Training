package practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJSON {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            mapper.readTree(new File("src/main/resources/user.json"));

            System.out.println("Valid JSON");

        } catch(Exception e) {

            System.out.println("Invalid JSON");
        }
    }
}