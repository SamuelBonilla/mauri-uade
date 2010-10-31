package systray;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TrayDemo extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] arg)
	{
		new TrayDemo();
	}
	
	public TrayDemo() {
			SystemTray tray = SystemTray.getSystemTray();
			
			Image img = Toolkit.getDefaultToolkit().getImage("images/cube.jpg");
			
			PopupMenu popup = new PopupMenu();
			MenuItem mItem1 = new MenuItem("Exit");
			
			mItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			});
			
			popup.add(mItem1);

			TrayIcon trayIcon = new TrayIcon(img, "Systray", popup);
			try 
			{
				tray.add(trayIcon);
			} catch (AWTException e) {
				System.err.println("Problem loading Tray icon");
			}
			
	}


			
			
}

