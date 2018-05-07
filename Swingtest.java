import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swingtest extends JFrame implements ActionListener
{
	JTextField txtdata;
	JButton calbtn = new JButton("GUESS!");
	Label lblQuest;	

	public Swingtest()
	{
		JPanel myPanel = new JPanel();
		add(myPanel);
		lblQuest = new Label("Try to Guess my name!");
		myPanel.setLayout(new GridLayout(3, 1));
		calbtn.addActionListener(this);
		txtdata = new JTextField();
		txtdata.setPreferredSize(new Dimension(240,240));
		myPanel.add(lblQuest);
		myPanel.add(txtdata);
		myPanel.add(calbtn);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == calbtn) {
			String data = txtdata.getText(); //perform your operation
			if (data.equals("Josh")) System.out.println("Thats my name");
			else System.out.println("Thats not my name, try again!");
			
		}
	}

	public static void main(String args[])
	{
		Swingtest g = new Swingtest();
		g.setLocation(600, 400);
		g.setSize(400, 400);
		g.setVisible(true);
	}
}
