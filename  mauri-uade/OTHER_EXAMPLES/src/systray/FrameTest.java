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
import javax.swing.SwingUtilities;

public class FrameTest {
	private JFrame frame;
    private Image img;
    private SystemTray sysTray;
    private PopupMenu menu;
    private MenuItem item1, item2;
    private TrayIcon trayIcon;

    //constructor
    public FrameTest() {
        initComponents();
        //basic stuff.
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        
    }

    private void initComponents() {
        //create jframe
        frame = new JFrame("Frame Test");
    
        //check to see if system tray is supported on OS.
        if (SystemTray.isSupported()) {
            sysTray = SystemTray.getSystemTray();
            
            //create dog image
            img  = Toolkit.getDefaultToolkit().getImage("images/cube.jpg");

            //create popupmenu
            menu = new PopupMenu();

            //create item
            item1 = new MenuItem("Exit");
            //add item to menu
            menu.add(item1);
            //add action listener to the item in the popup menu
            item1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   System.exit(0);
               }
            });

            item2 = new MenuItem("Show");
            menu.add(item2);
            item2.addActionListener(new ActionListener() {
            	
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(true);
					
				}
			});
            
            //create system tray icon.
            trayIcon = new TrayIcon(img, "FrameTest", menu);

            //add the tray icon to the system tray.
            try {
                sysTray.add(trayIcon);
                }
            catch(AWTException e) {
               System.out.println("System Tray unsupported!");
            }
        }
    }//end FrameTest constructor

    //main
    public static void main(String[]args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new FrameTest();
            }
        });
    }//end main()

}//end FrameTest Class