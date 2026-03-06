package ipl;

import java.util.List;

public class CensorService {

    public void applyCensorship(List<IPLMatch> matches){

        for(IPLMatch match : matches){

            match.team1 = maskTeam(match.team1);
            match.team2 = maskTeam(match.team2);

            match.player_of_match = "REDACTED";
        }
    }

    private String maskTeam(String team){

        String[] words = team.split(" ");

        return words[0] + " ***";
    }
}