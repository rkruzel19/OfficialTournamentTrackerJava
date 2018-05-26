package application;

import java.sql.*;

public class SQLConnector {

    private Connection sqlConnection;

    public SQLConnector(){
        try {
            sqlConnection = DriverManager.getConnection("jdbc:sqlserver://HOME-PC\\SQLEXPRESS;database=PokerTournamentTrackerdb;integratedSecurity=true;");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public long getNumberOfTournaments(){
        long tournamentID = -1;
        try {
            Statement statement = sqlConnection.createStatement();
            ResultSet results = statement.executeQuery("select count(*) from tournamentTable");
            while (results.next()){
                tournamentID = results.getLong(1);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return tournamentID;
    }

    public long getNumberOfPlayers(){
        long playerID = -1;
        try {
            Statement statement = sqlConnection.createStatement();
            ResultSet results = statement.executeQuery("select count(*) from playerTable20");
            while (results.next()){
                playerID = results.getLong(1);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return playerID;
    }

    public void connectToSQL() {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:sqlserver://HOME-PC\\SQLEXPRESS;database=PokerTournamentTrackerdb;integratedSecurity=true;");

            Statement myStatement = myConn.createStatement();

            ResultSet myRes = myStatement.executeQuery("select * from tournamentTable");

            while (myRes.next()) {
                System.out.println(myRes.getString("tournamentId") + ", " + myRes.getString("numberOfPlayers"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
