package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This dialog is displayed when the user selects the File/Open menu item.
 */
public class SampleDialogue extends JDialog implements ActionListener
{
  /**
	 * 
	 */
private static final long serialVersionUID = 1L;
private JButton okButton = new JButton("OK");

  protected SampleDialogue(JFrame frame)
  {
    super(frame, "Sample Dialog", true);
    JPanel panel = new JPanel(new FlowLayout());
    panel.add(okButton);
    getContentPane().add(panel);
    okButton.addActionListener(this);
    setPreferredSize(new Dimension(300, 200));
    pack();
    setLocationRelativeTo(frame);
  }

  public void actionPerformed(ActionEvent ev)
  {
    setVisible(false);
  }
}
