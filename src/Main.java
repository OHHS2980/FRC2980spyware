import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


import com.formdev.flatlaf.themes.FlatMacDarkLaf;


public class Main extends JFrame {
    Menu menu;
    private JPanel panel1;

    public Main()
    {
        super("Generic Scouting Software");

        menu = new Menu();

        setContentPane(menu.getPanel());

        ArrayList<RobotMatch> robotList = new ArrayList<RobotMatch>();
        robotList.add(new RobotMatch());

        ArrayList<Match> matchList = new ArrayList<Match>();
        matchList.add(new Match(robotList));


        SaveLoad.load(SaveLoad.save(new Event[] {new Event(matchList)}));

        pack();
        setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        FlatMacDarkLaf.setup();
        Main m = new Main();
    }
}