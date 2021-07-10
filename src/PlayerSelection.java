import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<String> Players = new ArrayList<String>();
        Players.add("km");




        while (true) {
            System.out.println("Add a Player:                 Press A\n" +
                    "View all Players:              Press V\n" +
                    "Display Two Best Batsman:      Press B\n" +
                    "Display Two Best Bowlers:      Press C\n"+
                    "Display Two Best Keepers:      Press D\n");

            String let = input.next();
            switch (let) {
                case "V":
                    System.out.println(Players);
                    break;
                case "A":
                    System.out.println("Player Name: ");
                    String PlayerName = input.next();
                    Players.add(PlayerName);

                    System.out.println("Player Age");
                    int PlayerAge = input.nextInt();

                    System.out.println("Player Type: ");
                    String PlayerType = input.next();

                    System.out.println("Player Runs: ");
                    int PlayerRuns = input.nextInt();

                    System.out.println("Player Wickets: ");
                    int PlayerWickets = input.nextInt();

                    Player take = new Player(PlayerName, PlayerAge, PlayerType, PlayerRuns, PlayerWickets);
                    break;
                case "C":
                    System.out.println("testing");
                    break;
                case "D":
                    System.out.println("testing2");
                    break;
                default :
                    System.out.println("Wrong Value");
            }
        }







    }












}