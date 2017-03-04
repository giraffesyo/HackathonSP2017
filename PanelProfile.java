import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelProfile extends JPanel
{
	Model md; 
	String id;
	JTextField textSearch;
	JLabel photo;
	JLabel gold;
	JLabel silver;
	JLabel bronze;
	JLabel level;
	JLabel win_rate;
	JLabel objective_kills_most_in_game;
		
	public PanelProfile()
	{
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		textSearch = new JTextField("giraffesyo#1652",20);
		add(textSearch);
		id = textSearch.getText();
		
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
		
		level= new JLabel("Level");
		add(level);
		win_rate= new JLabel("Win Rate");
		add(win_rate);
		objective_kills_most_in_game = new JLabel("Most Objective Kills in one game");
	}	
	
	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			id = textSearch.getText();
			//System.out.println(id);
			md = new Model(id);		 
			
			gold.setText("Gold Medal: " + md.getData().getMedals_gold());
			silver.setText("Silver Medal: " + md.getData().getMedals_silver());
			bronze.setText("Bronze Medal: " + md.getData().getMedals_bronze());
			
			level.setText("Level: " + md.getData().getLevel());
			win_rate.setText("Win Rate: " + md.getData().getWin_rate());
			objective_kills_most_in_game.setText("Most Objective Kills in one game: " + md.getData().getObjective_kills_most_in_game());
			
			repaint();
		}
	}
}
