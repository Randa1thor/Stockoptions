package GUI;


import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class StockFrame {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jf.setTitle("Stock and Option Screener");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setJMenuBar((JMenuBar)new StockFrameMenuBar());
		jf.setVisible(true);
		 // the proper way to show a jframe (invokeLater)
	    //SwingUtilities.invokeLater(new JavaMenuBarExample());
		// needed on mac os x
	    //System.setProperty("apple.laf.useScreenMenuBar", "true");
		
		
	}
}
