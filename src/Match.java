import java.util.ArrayList;

public class Match {
    private ArrayList<RobotMatch> robots;

    private int matchNum, redScore, blueScore, redFouls, blueFouls, redRankingPoints, blueRankingPoints;
    private double matchPredictionPercentRed, redScorePrediction, blueScorePrediction;
    private boolean predictedWinnerRed;

    private boolean blueAllianceUpdated = false;

    private String comment;

    public Match(){

    }
    public Match(ArrayList<RobotMatch> robots){
        this.robots = robots;
    }

    public void setData(int matchNum, int redScore, int blueScore, int redFouls, int blueFouls, int redRankingPoints, int blueRankingPoints, double matchPredictionPercentRed, double redScorePrediction, double blueScorePrediction, boolean predictedWinnerRed){

    }

    public ArrayList<RobotMatch> getRobots(){
        return robots;
    }

    public String toString(){
        return "{ \nmatchNum: " + matchNum + ",\nredScore: " + redScore + ",\nblueScore: " + blueScore + ",\nredFouls: " + redFouls + ",\nblueFouls: " + blueFouls + ",\nredRankingPoints: " + redRankingPoints + ",\nblueRankingPoints: " + blueRankingPoints + ",\ncomment: " + comment + ",\n";
    }
}
