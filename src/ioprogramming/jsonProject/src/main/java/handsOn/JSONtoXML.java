package handsOn;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JSONtoXML {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();

        JsonNode node = jsonMapper.readTree(new File("src/main/resources/handsonuser.json"));

        XmlMapper xmlMapper = new XmlMapper();

        xmlMapper.writeValue(new File("src/main/resources/handsonuser.xml"), node);

        System.out.println("Converted JSON to XML");
    }
}