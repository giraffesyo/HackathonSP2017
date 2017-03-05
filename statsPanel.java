import javax.swing.*;
import java.awt.event.*;

public class statsPanel extends JPanel {
    private Model model;
    private statsFrame frame;

    private JTextField textSearch;
    private JLabel photo;
    private JLabel gold;
    private JLabel silver;
    private JLabel bronze;
    private JLabel level;
    private JLabel win_rate;
    private JLabel objective_kills_most_in_game;

    String userName;
    String idNumber;

    public statsPanel(Model model, statsFrame frame) {
        this.model = model;
        this.frame = frame;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        textSearch = new JTextField("giraffesyo#1652", 20);
        add(textSearch);

        JButton search = new JButton("Search");
        add(search);
        search.addActionListener(new ButtonHandler());

        JTextField anotherExample = new JTextField("Another example -- > itsTimmy#1684");
        add(anotherExample);

        //photo = new JLabel("Profile picture");
        //add(photo);
        gold = new JLabel("Gold Medal");
        add(gold);
        silver = new JLabel("Silver Medal");
        add(silver);
        bronze = new JLabel("Bronze Medal");
        add(bronze);

        level = new JLabel("Level");
        add(level);
        win_rate = new JLabel("Win Rate");
        add(win_rate);
        objective_kills_most_in_game = new JLabel("Most Objective Kills in one game");
    }

    private class ButtonHandler implements ActionListener {
        private Data data;

        public void actionPerformed(ActionEvent e) {

            processName(textSearch.getText());
            model.update(userName, idNumber);
            data = model.getData();
            if(data.isNotFound()){
                frame.sendNotification("That name could not be found, sorry.");
            }
            else {
                gold.setText("Gold Medal: " + data.getMedals_gold());
                silver.setText("Silver Medal: " + data.getMedals_silver());
                bronze.setText("Bronze Medal: " + data.getMedals_bronze());

                level.setText("Level: " + data.getLevel());
                win_rate.setText("Win Rate: " + data.getWin_rate());
                objective_kills_most_in_game.setText("Most Objective Kills in one game: " + data.getObjective_kills_most_in_game());
            }
            repaint();
        }
    }

    private void processName(String userName) {

        if (!userName.contains("#")) {
            frame.sendNotification("Name should include battle tag #");
        } else {
            int separate = userName.indexOf("#");
            this.userName = userName.substring(0, separate);
            this.idNumber = userName.substring(separate + 1);
        }

    }
}
