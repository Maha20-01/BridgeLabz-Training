package ipl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonReaderService {

    public List<IPLMatch> readMatches() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        IPLMatch[] matches = mapper.readValue(
                new File("src/main/resources/ipl.json"),
                IPLMatch[].class
        );

        return Arrays.asList(matches);
    }
    public void writeMatches(List<IPLMatch> matches) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(
                        new File("src/main/resources/censored_ipl.json"),
                        matches
                );
    }
}