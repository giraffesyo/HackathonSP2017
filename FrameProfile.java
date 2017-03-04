import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FrameProfile extends JFrame
{
	public FrameProfile()
	{
		setTitle("Overwatch Profile");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(screenSize.width/2-150,screenSize.height/4);
		
		PanelProfile pp = new PanelProfile();
		add(pp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}