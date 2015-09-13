package game;

import javax.swing.*;
import java.awt.event.*;

public class T3_GUIBox extends JFrame implements ActionListener
{
	//declaring the variables
	JPanel myPanel;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JLabel myLabel;

	public T3_GUIBox()
	{
		setSize(600,500); //setting size of the entire panel
		setDefaultCloseOperation(EXIT_ON_CLOSE); //exit program when window is closed

		myPanel = new JPanel();

      myLabel = new JLabel("Tic Tac Toe"); //label for my calculator title
		myLabel.setBounds(225,30,200,20);

		one = new JButton("one"); //first button
		one.addActionListener(this); //calls addActionListener class and makes "interaction" with user possible
		one.setBounds(100,100,100,100); //setting the size and placement of the button

		two = new JButton("two");
		two.addActionListener(this);
		two.setBounds (200,100,100,100);

      three = new JButton("three");
		three.addActionListener(this);
		three.setBounds(300,100,100,100);

      four = new JButton("four");
		four.addActionListener(this);
		four.setBounds(100,200,100,100);

		five = new JButton("five");
		five.addActionListener(this);
		five.setBounds(200,200,100,100);

      six = new JButton("six");
		six.addActionListener(this);
		six.setBounds(300,200,100,100);

      seven = new JButton("seven");
		seven.addActionListener(this);
		seven.setBounds(100,300,100,100);

      eight = new JButton("eight");
		eight.addActionListener(this);
		eight.setBounds(200,300,100,100);

      nine = new JButton("nine");
		nine.addActionListener(this);
		nine.setBounds(300,300,100,100);


		//adding labels and text fields to the panel, panel added to window
      myPanel.setLayout(null);
      myPanel.add(myLabel);
		myPanel.add(one);
      myPanel.add(two);
      myPanel.add(three);
      myPanel.add(four);
      myPanel.add(five);
      myPanel.add(six);
      myPanel.add(seven);
      myPanel.add(eight);
      myPanel.add(nine);

		add(myPanel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{

   }

}