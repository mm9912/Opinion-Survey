package surveyTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//The Three Decent Coders
//Survey Application

//Darrell Abubo
//Mel Meneses
//Michael Alvarez
//November 16th, 2023

//interface for premade survey
public interface surveyInt {
	
	JFrame suvFrame = new JFrame();
	JFrame menuFrame = new JFrame();
	JPanel suvPanel1 = new JPanel(); //panels for the survey
	JPanel suvPanel2 = new JPanel();
	JPanel menuPanel = new JPanel(); //panel for the menu
	JLabel qLabel = new JLabel();
	JLabel menuLabel = new JLabel(); //label for questions, label for intro menu
	
	JButton aButton1 = new JButton();
	JButton aButton2 = new JButton();
	JButton aButton3 = new JButton();
	JButton aButton4 = new JButton();
	JButton submit = new JButton("SUBMIT");
	
	JButton playButton = new JButton("PLAY");
	JButton back = new JButton("BACK");
	
	public void create();
	public void menu();
	public void resetSurvey();
}
