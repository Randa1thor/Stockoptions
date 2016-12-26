package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class StockFrameMenuBar extends JMenuBar implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu fileMenu;
	private JMenu editMenu;
	
	
	
	public StockFrameMenuBar() {
	
	    this.add(buildFileMenu());
	    this.add(buildEditMenu());
	
	}
	
	
	private JMenu buildFileMenu(){
		// build the File menu
	    JMenu fileMenu = new JMenu("File");
	    JMenuItem openMenuItem = new JMenuItem("Open");
	    openMenuItem.addActionListener(this);
	    fileMenu.add(openMenuItem);
	    return fileMenu;
	}
	
	private JMenu buildEditMenu(){
		// build the Edit menu
	    JMenu editMenu = new JMenu("Edit");
	    
	    return editMenu;
	}
	
	
	
	/**
	   * This handles the action for the File/Open event, and demonstrates
	   * the implementation of an ActionListener.
	   * In a real-world program you'd handle this differently.
	   */
	  public void actionPerformed(ActionEvent ev)
	  {
	    SampleDialogue dialog = new SampleDialogue(new JFrame());
	    dialog.setModal(true);
	    dialog.setVisible(true);
	  }


	
	
	
}
