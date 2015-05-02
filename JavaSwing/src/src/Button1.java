package src;
import javax.swing.*;

import java.awt.event.*;
@SuppressWarnings("serial")
public class Button1 extends JDialog {
public static void main(String[] args) {
	JFrame frame = new JFrame();
JButton showDialogButton = new JButton("Text Button");
showDialogButton.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
    JDialog d = new JDialog(frame, "Hello", true);
    d.setLocationRelativeTo(frame);
    d.setVisible(true);
  }
});
}
}