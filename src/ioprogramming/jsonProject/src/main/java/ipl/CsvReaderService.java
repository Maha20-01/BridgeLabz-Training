package ipl;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class CsvReaderService {

    public List<IPLMatch> readCSV() throws Exception {

        CSVReader reader = new CSVReader(
                new FileReader("src/main/resources/ipl.csv")
        );

        List<IPLMatch> matches = new ArrayList<>();

        String[] line;
        reader.readNext(); // skip header

        while((line = reader.readNext()) != null){

            IPLMatch match = new IPLMatch();

            match.match_id = Integer.parseInt(line[0]);
            match.team1 = line[1];
            match.team2 = line[2];
            match.score_team1 = Integer.parseInt(line[3]);
            match.score_team2 = Integer.parseInt(line[4]);
            match.winner = line[5];
            match.player_of_match = line[6];

            matches.add(match);
        }

        return matches;
    }

    public void writeCSV(List<IPLMatch> matches) throws Exception {

        CSVWriter writer = new CSVWriter(
                new FileWriter("src/main/resources/censored_ipl.csv")
        );

        String[] header = {
                "match_id",
                "team1",
                "team2",
                "score_team1",
                "score_team2",
                "winner",
                "player_of_match"
        };

        writer.writeNext(header);

        for(IPLMatch m : matches){

            writer.writeNext(new String[]{
                    String.valueOf(m.match_id),
                    m.team1,
                    m.team2,
                    String.valueOf(m.score_team1),
                    String.valueOf(m.score_team2),
                    m.winner,
                    m.player_of_match
            });
        }

        writer.close();
    }
}