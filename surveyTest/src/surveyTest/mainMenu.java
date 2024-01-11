package surveyTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//The Three Decent Coders
//Survey Application

//Darrell Abubo - 219502301
//Mel Meneses - 219555408
//Michael Alvarez - 219838515
//November 1st, 2023

//create the main frame for the survey application
public class mainMenu implements ActionListener{
	
	public JFrame f1; //Frame
	public JPanel mainPanel; //Panel
	JLabel display1, display2;
	JButton preB, createB; //buttons for Main Menu
	createSurvey c;
	ImageIcon tablet;
	
	public mainMenu() {
		
		//{Main Menu}
		f1 = new JFrame(); //creating the Main Frame
		f1.setTitle("The Decent Coders' Survey Application");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting Main Frame's close operation
		f1.setSize(1100,700); //setting Main Frame's size
		f1.setLayout(new FlowLayout(FlowLayout.CENTER)); //setting Main Frame's layout type
		f1.getContentPane().setBackground(Color.gray); //setting Main Frame's background colour
		
		mainPanel = new JPanel(); //creating the Main Panel
		mainPanel.setLayout(new FlowLayout()); //setting Main Panel's layout
		mainPanel.setBackground(Color.darkGray); //setting Main Panel's background colour
		mainPanel.setPreferredSize(new Dimension(900,600)); //setting Main Panel's preferred size
		
		//{Main Menu Buttons}
		preB = new JButton("Premade Surveys"); //button to access Premade surveys
		preB.setVisible(true); //setting its visibility to true
		preB.addActionListener(this); //adding Action Listener to it
		
		createB = new JButton("Create Survey"); //button to Create a survey
		createB.setVisible(true); //setting its visibility to true
		createB.addActionListener(this); //adding Action Listener to it
		
		mainPanel.add(preB,BorderLayout.WEST); //adding the buttons to the Main Panel
		mainPanel.add(createB,BorderLayout.CENTER);
		
		//label to put image
		display1 = new JLabel("Welcome to Our Survey Application!");
		display1.setFont(new Font("Arial",Font.PLAIN,40)); display1.setForeground(Color.white);
		tablet = new ImageIcon(getClass().getResource("tablet.jpg"));
		display2 = new JLabel(tablet);
		mainPanel.add(display1);
		mainPanel.add(display2);
		
		f1.add(mainPanel,BorderLayout.CENTER); //adding the Main Panel to the Main Frame
		f1.setVisible(true);
		c = new createSurvey();
		c.blank();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == preB) { //button to access premade surveys
			premadeSurveys prems = new premadeSurveys(); //premadeSurveys object
			prems.initialize(); //using the initializing method to make the new window
			f1.dispose(); //dispose the frame
		}
		else if(e.getSource() == createB) {//button to create a survey
			c.createFrame();
			f1.dispose();
		}
	}
	
}

