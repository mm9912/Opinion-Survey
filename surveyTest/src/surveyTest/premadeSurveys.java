package surveyTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//The Three Decent Coders
//Survey Application

//Darrell Abubo - 219502301
//Mel Meneses - 219555408
//Michael Alvarez - 219838515
//November 2nd, 2023
public class premadeSurveys implements ActionListener{
	
	private JFrame preFrame; //Premade Survey Frame
	private JPanel prePanel; //Premade Survey Panel
	
	JButton pSuv1, pSuv2, pSuv3, back; //buttons for Premade Surveys and one to go back to the main menu
	
	//class for creating Premade Surveys
	
	public void initialize() {
		preFrame = new JFrame(); //creating the Premade Survey Frame
		preFrame.setTitle("The Decent Coders' Survey Application: Premade Surveys");
		preFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation
		preFrame.setSize(1100,700); //setting size
		preFrame.setLayout(new FlowLayout(FlowLayout.CENTER)); //setting layout type
		preFrame.getContentPane().setBackground(Color.gray); //setting background colour
		
		prePanel = new JPanel(); //creating the Premade Survey Panel
		prePanel.setLayout(new FlowLayout()); //setting layout
		prePanel.setBackground(Color.darkGray); //setting background colour
		prePanel.setPreferredSize(new Dimension(900,600)); //setting preferred size
		
		pSuv1 = new JButton("Survey 1"); //creating survey buttons
		pSuv2 = new JButton("Survey 2");
		pSuv3 = new JButton("Survey 3");
		back = new JButton("BACK"); //creating Back button
		
		JLabel display1 = new JLabel("Please Select a Survey below to get Started!");
		display1.setForeground(Color.white);
		display1.setFont(new Font("Times New Roman",Font.PLAIN,50));
		prePanel.add(display1);
		
		pSuv1.setPreferredSize(new Dimension(100,50)); //setting the sizes
		pSuv2.setPreferredSize(new Dimension(100,50));
		pSuv3.setPreferredSize(new Dimension(100,50));
		back.setPreferredSize(new Dimension(100,50));
		
		pSuv1.setVisible(true); //setting visibility to true
		pSuv2.setVisible(true);
		pSuv3.setVisible(true);
		back.setVisible(true);
		
		pSuv1.addActionListener(this); //adding Action Listener
		pSuv2.addActionListener(this);
		pSuv3.addActionListener(this);
		back.addActionListener(this);
		
		prePanel.add(pSuv1); //adding them all to the panel
		prePanel.add(pSuv2);
		prePanel.add(pSuv3);
		prePanel.add(back);
		
		preFrame.add(prePanel); //adding the panel to the frame
		preFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pSuv1) {
			preFrame.dispose(); //sets the frame's visibility to false
			survey1_1v1 s1 = new survey1_1v1();
			s1.resetSurvey();
		}
		else if (e.getSource() == pSuv2) {
			preFrame.dispose();
			survey2_2v2 s2 = new survey2_2v2();
			s2.resetSurvey();
		}
		else if (e.getSource() == pSuv3) {
			preFrame.dispose();
			survey3_3v3 s3 = new survey3_3v3();
			s3.resetSurvey();
		}
		else if (e.getSource() == back) {
			preFrame.dispose(); //sets the frame's visibility to false
			mainMenu m1 = new mainMenu(); //creates a new main menu object
		}
	}
	
}
