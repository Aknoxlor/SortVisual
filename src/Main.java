import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Timer;


public class Main extends Frame {

	SortVisual thing;
	Timer timer;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		super("SortVisual");
		
		setSize(525, 525);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		thing = new SortVisual(500);
		ActionListener timedEvent = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thing.process();
				repaint();
			}
		};
		timer = new Timer(50, timedEvent);
		timer.start();
		timer.setRepeats(true);

	}
	
	public void paint(Graphics g) {
		thing.paint(g);
	}

}
