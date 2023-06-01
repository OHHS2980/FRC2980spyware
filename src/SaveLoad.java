import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class SaveLoad {
    public static String save(Event[] events){
        //Path path = Paths.get("C:\\Users\\darkb\\Documents\\saves\\" + new Date() + "ScoutSave.txt");

        String save = "";
        System.out.println("saving...");

        for (Event e : events){
            save += "{\n";
            for (Match m : e.getMatches()){
                save += m;

                for (RobotMatch r : m.getRobots()) {

                    save += r;
                }

                save += "\n}";
            }
            save += "\n}";

        }
        System.out.println(save);
        return save;
/*
        try {
            Files.writeString(path, save,
                    StandardCharsets.UTF_8);
        }
        catch (IOException ex) {
            System.out.println("Invalid Path");
            ex.printStackTrace();
        }

 */

    }

    public static Event[] load(String save){
        Event[] result = new Event[1];
        int depth = 0;
        for(int i = 0; i < save.length(); i++) { // only runs when i is smaller than length of save txt file, sets i to 0 and then increases it by 1 once it runs
            char c = save.charAt(i);
//starting to read the txt file
            if (c == '{') {
                depth++;
            } else if (c == '}') {
                depth--; //uhh this is so you can see what "level'  of the string youre in

                if (depth == 2) {
                    int fromIndex = 0;

                    int readMatchNum = save.indexOf("matchNum");
                    int matchNum = Integer.parseInt(save.substring(readMatchNum + 10, save.indexOf(",",fromIndex)));//the value of matchNum is the number behind the comma

                    fromIndex = save.indexOf(",",fromIndex) + 1;
                    int readRedScore = save.indexOf("redScore");
                    int redScore = Integer.parseInt(save.substring(readRedScore + 10, save.indexOf(",",fromIndex)));

                    fromIndex = save.indexOf(",",fromIndex) + 1;
                    int readBlueScore = save.indexOf("blueScore");
                    int blueScore = Integer.parseInt(save.substring(readRedScore + 11, save.indexOf(",",fromIndex)));

                    fromIndex = save.indexOf(",",fromIndex) + 1;
                    int readRedFouls = save.indexOf("redFouls");
                    int redFouls = Integer.parseInt(save.substring(readRedScore + 10, save.indexOf(",")));

                    fromIndex = save.indexOf(",",fromIndex) + 1;
                    int readBlueFouls = save.indexOf("blueFouls");
                    int blueFouls = Integer.parseInt(save.substring(readRedScore + 11, save.indexOf(",")));

                    fromIndex = save.indexOf(",",fromIndex) + 1;
                    int readredRankingPoints = save.indexOf("redRankingPoints");
                    int redRankingPoints = Integer.parseInt(save.substring(readRedScore + 18, save.indexOf(",")));

                    fromIndex = save.indexOf(",",fromIndex) + 1;
                    int readblueRankingPoints = save.indexOf("blueRankingPoints");
                    int blueRankingPoints = Integer.parseInt(save.substring(readRedScore + 19, save.indexOf(",")));

                    int readComment = save.indexOf("comment");
                    String comment = save.substring(readComment + 9, save.indexOf(","));




                }

            }
        }


        return result;
    }
}
