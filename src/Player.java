public class Player {
    private String playerName;
    private int playerAge;
    final private String playerType;
    private int playerRuns;
    private int playerWickets;
    private int totalRuns=0;
    private int totalWickets=0;

    public Player(String playerName,int playerAge, String playerType,int playerRuns,int playerWickets){
        this.playerName=playerName;
        this.playerAge=playerAge;
        this.playerType=playerType;
        this.playerRuns=playerRuns;
        this.playerWickets=playerWickets;
    }

    int displayHighest(int runs){        //checks all the run values entered by user and display the highest score of the player
        int highNow = runs;
        for(int x=0;x<15;x++)
        {
            if(runs>highNow)    //compares the new runs value to the current highest and make changes
            {
                highNow=runs;
            }
        }
    return highNow;
    }

    int displayBattingAvg(int runs){    //calculate and display the average of 15 runs values
        for(int y=0;y<15;y++)
        {
            totalRuns=totalRuns+runs;   //add entered runs values together
        }
        int average = totalRuns/15;
    return average;
    }

    double displayBowlingAvg(int wickets){    //calculate and display the average of 15 wickets values
        for(int y=0;y<15;y++)
        {
            totalWickets=totalWickets+wickets;    //add entered wickets values together
        }
        double average = totalWickets/15;
        return average;
    }

    void displayPlayerDetails(){   //display the details entered and calculated back to the user
        System.out.println("Player Name:"+playerName);
        System.out.println("Player Age:"+playerAge);
        System.out.println("Player Type:"+playerType);
        System.out.println("Player Total Runs:"+totalRuns);
        System.out.println("Player Total Wickets:"+totalWickets);

    }

}
