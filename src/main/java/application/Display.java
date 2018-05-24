package application;

public class Display {

    public static void welcome(){
        System.out.println("***********************************\n" +
                "Welcome to Poker Tournament Tracker\n" +
                "***********************************\n");
    }

    public static int mainMenu(){
        System.out.println("1) Add Tournament\n" +
                "2) Player Standings\n" +
                "3) See Tournaments\n" +
                "4) Add Player\n" +
                "5) See Players\n" +
                "6) See Results\n" +
                "7) Exit App\n");
        return Console.getIntegerInput("What would you like to do?");
    }

}
