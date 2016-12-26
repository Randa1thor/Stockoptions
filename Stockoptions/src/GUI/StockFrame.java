package GUI;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class StockFrame {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jf.setTitle("Stock and Option Screener");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
}
