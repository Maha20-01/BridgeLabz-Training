package handsOn;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;

import java.io.File;
import java.util.*;

public class ListToJSONArray {

    public static void main(String[] args) throws Exception {

        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.name = "Kaviya";
        u1.age = 23;

        User u2 = new User();
        u2.name = "Ram";
        u2.age = 28;

        users.add(u1);
        users.add(u2);

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("src/main/resources/handsonusers.json"), users);

        System.out.println("JSON array created");
    }
}