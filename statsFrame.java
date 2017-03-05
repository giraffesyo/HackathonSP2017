import javax.swing.*;
import java.awt.*;

class statsFrame extends JFrame
{
    private JOptionPane notification;

	statsFrame()
	{
		setTitle("Overwatch Profile");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(screenSize.width/2-150,screenSize.height/4);

		Model model = new Model();
		statsPanel pp = new statsPanel(model, this);
		add(pp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

    void sendNotification(String Message)
    {
        notification.showMessageDialog(this, Message);
    }
}