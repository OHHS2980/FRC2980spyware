public class RobotMatch{
    private String comment;
    private int scoredPoints, teamNumber;
    private boolean red;

    public RobotMatch(int teamNumber, int scoredPoints, boolean red, String comment){
        this.teamNumber = teamNumber;
        this.scoredPoints = scoredPoints;
        this.red = red;
        this.comment = comment;
    }

    public RobotMatch(){
    }

    public String toString(){
        return "{ \nteamNumber: " + teamNumber + ",\nscoredPoints: " + scoredPoints + ",\nred: " + red + ",\ncomment: " + comment + "\n}";
    }
}
