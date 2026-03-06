package ipl;

import java.util.List;

public class IPLMain {

    public static void main(String[] args) throws Exception {

        JsonReaderService jsonService = new JsonReaderService();
        CsvReaderService csvService = new CsvReaderService();
        CensorService censor = new CensorService();

        // JSON Processing
        List<IPLMatch> jsonMatches = jsonService.readMatches();

        censor.applyCensorship(jsonMatches);

        jsonService.writeMatches(jsonMatches);

        System.out.println("Censored JSON file generated");

        // CSV Processing
        List<IPLMatch> csvMatches = csvService.readCSV();

        censor.applyCensorship(csvMatches);

        csvService.writeCSV(csvMatches);

        System.out.println("Censored CSV file generated");
    }
}