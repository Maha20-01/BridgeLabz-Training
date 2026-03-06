package handsOn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;

import java.io.File;
import java.util.Set;

public class ValidateEmailJSON {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(new File("src/main/resources/handsonemail-schema.json").toURI());

        Set<ValidationMessage> errors =
                schema.validate(mapper.readTree(new File("src/main/resources/handsonuser.json")));

        if(errors.isEmpty())
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}