import java.util.ArrayList;
import java.util.Scanner;

    public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  player name   : ");
        String playerName= input.next();
        System.out.println("Enter the player age  : ");
        int playerAge= input.nextInt();
        System.out.println("Enter the player country  : ");
        String playerCountry= input.next();
        System.out.println("Enter the player type: ");
        String playerType= input.next();

        ArrayList<String> battingplayerNames = new ArrayList<String>();
        battingplayerNames. add("Dawid Malan-   BAT RATING-888");
        battingplayerNames. add("Virat Kohli-   BAT RATING-702");
        battingplayerNames. add("Martin Guptill-BAT RATING-688");
        battingplayerNames. add("Babar Azam-    BAT RATING-828");
        battingplayerNames. add("Glenn Maxwell- BAT RATING-694");

        ArrayList<String> wiketKeepingplayerNames = new ArrayList<String>();
        wiketKeepingplayerNames. add("Mohammad Nabi-  285");
        wiketKeepingplayerNames. add("Shakib AI Hasan-238");
        wiketKeepingplayerNames. add("Khawar-         159");
        wiketKeepingplayerNames. add("Sean Williams-  158");
        wiketKeepingplayerNames. add("Collins Obuya-  153");

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

        ArrayList<Integer> wicketKeepingplayerRatings = new ArrayList<Integer>();
        wicketKeepingplayerRatings. add (285);
        wicketKeepingplayerRatings. add (238);
        wicketKeepingplayerRatings. add (159);
        wicketKeepingplayerRatings. add (158);
        wicketKeepingplayerRatings. add (153);

        ArrayList<Integer> bowlingplayerRatings = new ArrayList<Integer>();
        bowlingplayerRatings. add (695);
        bowlingplayerRatings. add (693);
        bowlingplayerRatings. add (640);
        bowlingplayerRatings. add (821);
        bowlingplayerRatings. add (702);

       
        Player player1 = new Player ( playerName,playerAge,playerCountry,playerType);
        String pressletter = "";

        while (pressletter != "Q ") {
            System.out.println("To Add a batting player name   : Press A");
            System.out.println("To Add a  bowling player name  : Press E");
            System.out.println("To Add a wicket keeper         : Press F");
            System.out.println("TO Display the  best batmen    : Press B");
            System.out.println("To Display the  best bowler    : Press C");
            System.out.println("To Display the best keeper     : Press D");
            System.out.println("To View player  details        : Press V");
            System.out.println("To Exit                        : Press Q");

            System.out.println("Enter the Press letter:  ");
            String press = input.next();
             //Player player1= new Player();

            switch (press) {
                case "A":
                    System.out.println("Please enter the batting player name : ");
                    String a= input.next();
                    battingplayerNames .add(a);
                    break;
                case"E":
                    System.out.println("Please enter the bowler name : ");
                    String b= input.next();
                    bowlingplayerNames .add(b);
                    break;
                case"F":
                    System.out.println("Please enter the wicket keeper name : ");
                    String c= input.next();
                    wiketKeepingplayerNames .add(c);
                    break;

                case "B":
                    int p=0;
                    for (int i=1; i<5 ; i++){
                        if (battingplayerRatings.get(i) > battingplayerRatings.get(0)) {
                            int higestRating = battingplayerRatings.get(i);
                            p = i;
                        }
                    }
                    System.out.println("The best batmen is " +  battingplayerNames.get(p));
                    break;

                case "C":
                    int m=0;
                    for (int i=1; i<5 ; i++){
                        if (bowlingplayerRatings.get(i) > bowlingplayerRatings.get(0)) {
                            int higestRating = bowlingplayerRatings.get(i);
                            m= i;
                        }
                    }
                    System.out.println("The best bowler is "+ bowlingplayerNames.get(m));

                    break;

                case "D":
                    int n=0;
                    for (int i=1; i<5 ; i++){
                        if (wicketKeepingplayerRatings.get(i) > wicketKeepingplayerRatings.get(0)) {
                            int higestRating = wicketKeepingplayerRatings.get(i);
                            n= i;
                        }
                    }
                    System.out.println("The best wicket keeper is "+ wiketKeepingplayerNames.get(n));

                    break;

                case "V":
                    player1.displayPlayerDetails();
                    break;

                case "Q":
                    pressletter = "Q";
                    break;


            }
        }
    }
}