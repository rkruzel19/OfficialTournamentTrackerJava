package DBOs;

import java.util.ArrayList;
import java.util.Date;
import application.SQLConnector;


public class Tournament {

    private long tournamentID;
    private Date date;
    private int numberOfPlayers;
    private int buyIn;
    private int totalPot;
    private ArrayList<Result> playerResults = new ArrayList<>();

    public Tournament( int numberOfPlayers, int buyIn, int totalPot) {
        this.tournamentID = generateTournamentID();
        this.date = date;
        this.numberOfPlayers = numberOfPlayers;
        this.buyIn = buyIn;
        this.totalPot = totalPot;
    }

    public long generateTournamentID(){
        SQLConnector sqlConnector = new SQLConnector();
        return sqlConnector.getNumberOfTournaments() + 1;
    }

    public void setPlayerResults(ArrayList<Result> playerResults) {
        this.playerResults = playerResults;
    }

    public long getTournamentID() {
        return tournamentID;
    }

    public Date getDate() {
        return date;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getBuyIn() {
        return buyIn;
    }

    public int getTotalPot() {
        return totalPot;
    }

    public ArrayList<Result> getResults() {
        return playerResults;
    }

    public String getStringDate(){
        String[] splitDate = date.toString().split(" ");
        return splitDate[1] + " " + splitDate[2] + " " + splitDate[5];
    }

    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("Tournament ID: ").append(tournamentID).append("\n")
                .append("Date: ").append(getStringDate()).append("\n")
                .append("Number of players: ").append(numberOfPlayers).append("\n")
                .append("Buy-in: ").append(buyIn).append("\n")
                .append("Total pot: ").append(totalPot).append("\n");
        return output.toString();
    }

}
