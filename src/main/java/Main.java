import DBOs.Player;
import DBOs.Tournament;
import application.SQLConnector;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SQLConnector sqlConnector = new SQLConnector();
        System.out.println(sqlConnector.getNumberOfPlayers());

        Player player = new Player("Rob");
        System.out.println(player.getPlayerID());

//        Tournament tournament = new Tournament(4, 40, 400);
//        System.out.println(tournament.generateTournamentID());
    }

}
