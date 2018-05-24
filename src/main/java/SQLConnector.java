import java.sql.*;

public class SQLConnector {

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
