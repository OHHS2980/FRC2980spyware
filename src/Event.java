import java.util.ArrayList;

public class Event {
    private ArrayList<Match> matches;

    public ArrayList<Match> getMatches(){
        return matches;
    }

    public Event(ArrayList<Match> matches){
        this.matches = matches;
    }
}
