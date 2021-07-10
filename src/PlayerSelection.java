import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> battingPlayerNames = new ArrayList<String>();
        battingPlayerNames. add("Dawid Malan-   BAT RATING-888");
        battingPlayerNames. add("Virat Kohli-   BAT RATING-702");
        battingPlayerNames. add("Martin Guptill-BAT RATING-688");
        battingPlayerNames. add("Babar Azam-    BAT RATING-828");
        battingPlayerNames. add("Glenn Maxwell- BAT RATING-694");

        ArrayList<String> wicketKeepingPlayerNames = new ArrayList<String>();
        wicketKeepingPlayerNames. add("Mohammad Nabi-  285");
        wicketKeepingPlayerNames. add("Shakib AI Hasan-238");
        wicketKeepingPlayerNames. add("Khawar-         159");
        wicketKeepingPlayerNames. add("Sean Williams-  158");
        wicketKeepingPlayerNames. add("Collins Obuya-  153");

        ArrayList<String> bowlingplayerNames = new ArrayList<String>();
        bowlingplayerNames. add("Adil Rashid-     BOWLING RATING-695");
        bowlingplayerNames. add("Wanindu De Silva-B0WLING RATING-693");
        bowlingplayerNames. add("Ish Sodhi-       BOWLING RATING-640");
        bowlingplayerNames. add("Tabraiz-         BOWLING RATING-821");
        bowlingplayerNames. add("Ashton Agar-     B0WLING RATING-702");

        ArrayList<Integer> battingplayerRatings = new ArrayList<Integer>();
        battingplayerRatings. add (888);
        battingplayerRatings. add (762);
        battingplayerRatings. add (688);
        battingplayerRatings. add (828);
        battingplayerRatings. add (694);

        ArrayList<Integer> wicketKeepingPlayerRatings = new ArrayList<Integer>();
        wicketKeepingPlayerRatings. add (285);
        wicketKeepingPlayerRatings. add (238);
        wicketKeepingPlayerRatings. add (159);
        wicketKeepingPlayerRatings. add (158);
        wicketKeepingPlayerRatings. add (153);

        ArrayList<Integer> bowlingPlayerRatings = new ArrayList<Integer>();
        bowlingPlayerRatings. add (695);
        bowlingPlayerRatings. add (693);
        bowlingPlayerRatings. add (640);
        bowlingPlayerRatings. add (821);
        bowlingPlayerRatings. add (702);

        ArrayList<String> addedPlayerNames = new ArrayList<String>();
        ArrayList<Integer> addedPlayerAges = new ArrayList<Integer>();
        ArrayList<String> addedPlayerCountries = new ArrayList<String>();




        String pressletter = "";

        while (true) {
            System.out.println(" ");
            System.out.println("To Add a batting player name                  : Press A");
            System.out.println("To Add a bowling player name                  : Press E");
            System.out.println("To Add a Wicket Keeper                        : Press F");
            System.out.println("To Display the two  best batmen               : Press B");
            System.out.println("To Display the two best bowlers               : Press C");
            System.out.println("To Display the best Keeper                    : Press D");
            System.out.println("To View Last Added player  details            : Press V");
            System.out.println("To Exit                                       : Press Q");
            System.out.println(" ");

            System.out.print("Enter the Press letter:  ");
            System.out.println(" ");
            String press = input.next();
            //Player player1= new Player();

            switch (press) {
                case "A": //Adding a new Batsman
                    System.out.println("Enter the  Player Name   : ");
                    String playerName = input.next();
                    battingPlayerNames.add(playerName);
                    addedPlayerNames.add(playerName);

                    System.out.println("Enter the Player Age  : ");
                    int playerAge= input.nextInt();
                    addedPlayerAges.add(playerAge);

                    System.out.println("Enter the Player Country  : ");
                    String playerCountry= input.next();
                    addedPlayerCountries.add(playerCountry);


                    break;



                case"E": //Adding a New Bowler
                    System.out.println("Please enter the bowler Name : ");
                    String b = input.next();
                    bowlingplayerNames.add(b);
                    addedPlayerNames.add(b);

                    System.out.println("Enter the Player Age  : ");
                    int playerAge2 = input.nextInt();
                    addedPlayerAges.add(playerAge2);

                    System.out.println("Enter the Player Country  : ");
                    String playerCountry2= input.next();
                    addedPlayerCountries.add(playerCountry2);
                    break;

                case"F":
                    System.out.println("Please enter the Wicket Keeper Name : ");
                    String c = input.next();
                    wicketKeepingPlayerNames.add(c);
                    addedPlayerNames.add(c);

                    System.out.println("Enter the Player Age  : ");
                    int playerAge3 = input.nextInt();
                    addedPlayerAges.add(playerAge3);

                    System.out.println("Enter the Player Country  : ");
                    String playerCountry3= input.next();
                    addedPlayerCountries.add(playerCountry3);
                    break;

                case "B":
                    int p=0;
                    for (int i=1; i<5 ; i++){
                        if (battingplayerRatings.get(i) > battingplayerRatings.get(0)) {
                            int highestRating = battingplayerRatings.get(i);
                            p = i;
                        }
                    }
                    System.out.println("The best batmen is " +  battingPlayerNames.get(p));
                    System.out.println("The Second best batmen is " +  battingPlayerNames.get(p+1));
                    break;

                case "C":
                    int m=0;
                    for (int i=1; i<5 ; i++){
                        if (bowlingPlayerRatings.get(i) > bowlingPlayerRatings.get(0)) {
                            int highestRating = bowlingPlayerRatings.get(i);
                            m= i;
                        }
                    }
                    System.out.println("The best bowler is "+ bowlingplayerNames.get(m));

                    break;

                case "D":
                    int n=0;
                    for (int i=1; i<5 ; i++){
                        if (wicketKeepingPlayerRatings.get(i) > wicketKeepingPlayerRatings.get(0)) {
                            int highestRating = wicketKeepingPlayerRatings.get(i);
                            n= i;
                        }
                    }
                    System.out.println("The best wicket keeper is "+ wicketKeepingPlayerNames.get(n));

                    break;

                case "V"://newest player details
                    for (int i = 0; i < addedPlayerNames.size(); i++) {
                        System.out.println("Player Name: " + addedPlayerNames.get(i));
                        System.out.println("Player Age:  " + addedPlayerAges.get(i));
                        System.out.println("Player Country:  " + addedPlayerCountries.get(i));
                        System.out.println(" ");
                    }



                    break;

                case "Q":
                    pressletter = "Q";
                    break;

                default :
                    System.out.println("Wrong Value");

            }
        }
    }
}