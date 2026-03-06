package practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSONObjects {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name","Maha");

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("city","Chennai");

        json1.setAll(json2);

        System.out.println(json1);
    }
}