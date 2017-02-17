import javax.swing.SwingUtilities;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
		try {
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
                NewJPanel n = new NewJPanel();
		JFrame mainFrame = new JFrame("Java Swing Examples");
		mainFrame.setSize(400,400);
		mainFrame.add(n);
		mainFrame.setVisible(true);
		mainFrame.pack();
		System.out.println("ran");
            }
        });
    }
}
