package notutilsbutmainstuff.notutilsbutmainstuff;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Button1 extends JFrame {
	private JTextField txt = new JTextField(10);
	JLabel label1 = new JLabel("");
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JTextField name = new JTextField(txt.getText());
			
			//this.setTitle(name.getText());
			txt.setText("");
		}
	}
	private JButton
		b1 = new JButton("Button 1"),
	    b2 = new JButton("Button 2");
	public Button1 () {
		b1.addActionListener(bl1);
		b2.addActionListener(bl2);

		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
		add(label1);
	}
	private ButtonListener bl1 = new ButtonListener();
	private ButtonListener bl2 = new ButtonListener();

	public static void Main(String[] args) {
		SwingConsole.run(new Button1(), 200, 100);
	}
}