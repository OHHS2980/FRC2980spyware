import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class SaveLoad {
    public static void save(Event[] events){
        //Path path = Paths.get("C:\\Users\\darkb\\Documents\\saves\\" + new Date() + "ScoutSave.txt");

        String save = "";

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
        for(int i = 0; i < save.length(); i++){
            char c = save.charAt(i);

            if(c == '{'){
                depth++;
            }else if(c == '}'){
                depth--;
            }
        }

        return result;
    }
}
