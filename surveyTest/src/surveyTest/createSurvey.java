package surveyTest;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

//The Three Decent Coders
//Survey Application

//Darrell Abubo - 219502301
//Mel Meneses - 219555408
//Michael Alvarez - 219838515
//November 21st, 2023

/**
* Created by Michael Alvarez
*/
public class createSurvey implements surveyInt, ActionListener{
	
	JFrame cFrame; JPanel p1; JLabel l1,l2,l3,l4,l5; //frame and labels to hold everything
	
	JTextField q1,q2,q3,q4,q5,q6,q7,q8, q9,q10; //question fields
	JTextField q1o1,q1o2,q1o3,q1o4,q2o1,q2o2,q2o3,q2o4,q3o1,q3o2,q3o3,q3o4,q4o1,q4o2,q4o3,q4o4; //option fields
	JTextField q5o1,q5o2,q5o3,q5o4,q6o1,q6o2,q6o3,q6o4,q7o1,q7o2,q7o3,q7o4,q8o1,q8o2,q8o3,q8o4;
	JTextField q9o1,q9o2,q9o3,q9o4,q10o1,q10o2,q10o3,q10o4;
	
	JTextArea a1; JTextField title, thank; JButton play,back2; //extra text fields, text area, and buttons
	mainMenu m1;
	
	private ArrayList<String> customQ = new ArrayList<String>(10); //array list for custom questions
	private String customT, customThank; //custom title and thank you message
	private ArrayList<String> customO1 = new ArrayList<String>(10); //array list for each question's custom options
	private ArrayList<String> customO2 = new ArrayList<String>(10);
	private ArrayList<String> customO3 = new ArrayList<String>(10);
	private ArrayList<String> customO4 = new ArrayList<String>(10);
	private ArrayList<String> customO5 = new ArrayList<String>(10);
	private ArrayList<String> customO6 = new ArrayList<String>(10);
	private ArrayList<String> customO7 = new ArrayList<String>(10);
	private ArrayList<String> customO8 = new ArrayList<String>(10);
	private ArrayList<String> customO9 = new ArrayList<String>(10);
	private ArrayList<String> customO10 = new ArrayList<String>(10);
	
	String question = "1", answer = ""; int surveyNum = 4; //survey variables and answer arraylist
	ArrayList<String> answers = new ArrayList<String>(10);
	
	public void createFrame() {//method to create the Survey Creator frame
		cFrame = new JFrame(); //frame
		cFrame.setTitle("The Decent Coders' Survey Application: Survey Creator!");
		cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cFrame.setSize(1100,700);
		cFrame.setLayout(new GridLayout(12,5)); //grid layout to hold all question fields, area fields, etc.
		cFrame.getContentPane().setBackground(Color.gray);
		
		l1 = new JLabel("Questions:"); l1.setSize(30, 10); cFrame.add(l1); //column 1 (table labels)
		l2 = new JLabel("Option 1:"); l2.setSize(30, 10); cFrame.add(l2);
		l3 = new JLabel("Option 2:"); l3.setSize(30, 10); cFrame.add(l3);
		l4 = new JLabel("Option 3:"); l4.setSize(30, 10); cFrame.add(l4);
		l5 = new JLabel("Option 4:"); l5.setSize(30, 10); cFrame.add(l5);
		
		q1 = new JTextField("1:"); //column 2
		cFrame.add(q1);
		q1o1 = new JTextField();
		cFrame.add(q1o1);
		q1o2 = new JTextField();
		cFrame.add(q1o2);
		q1o3 = new JTextField();
		cFrame.add(q1o3);
		q1o4 = new JTextField();
		cFrame.add(q1o4);
		
		q2 = new JTextField("2:"); //column 3
		cFrame.add(q2);
		q2o1 = new JTextField();
		cFrame.add(q2o1);
		q2o2 = new JTextField();
		cFrame.add(q2o2);
		q2o3 = new JTextField();
		cFrame.add(q2o3);
		q2o4 = new JTextField();
		cFrame.add(q2o4);
		
		q3 = new JTextField("3:"); //column 4
		cFrame.add(q3);
		q3o1 = new JTextField();
		cFrame.add(q3o1);
		q3o2 = new JTextField();
		cFrame.add(q3o2);
		q3o3 = new JTextField();
		cFrame.add(q3o3);
		q3o4 = new JTextField();
		cFrame.add(q3o4);
		
		q4 = new JTextField("4:"); cFrame.add(q4);//column 5
		q4o1 = new JTextField(); cFrame.add(q4o1);
		q4o2 = new JTextField(); cFrame.add(q4o2);
		q4o3 = new JTextField(); cFrame.add(q4o3);
		q4o4 = new JTextField(); cFrame.add(q4o4);
		
		q5 = new JTextField("5:"); cFrame.add(q5); //column 6
		q5o1 = new JTextField(); cFrame.add(q5o1);
		q5o2 = new JTextField(); cFrame.add(q5o2);
		q5o3 = new JTextField(); cFrame.add(q5o3);
		q5o4 = new JTextField(); cFrame.add(q5o4);
		
		q6 = new JTextField("6:"); cFrame.add(q6); //column 7
		q6o1 = new JTextField(); cFrame.add(q6o1);
		q6o2 = new JTextField(); cFrame.add(q6o2);
		q6o3 = new JTextField(); cFrame.add(q6o3);
		q6o4 = new JTextField(); cFrame.add(q6o4);
		
		q7 = new JTextField("7:"); //column 8
		cFrame.add(q7);
		q7o1 = new JTextField();
		cFrame.add(q7o1);
		q7o2 = new JTextField();
		cFrame.add(q7o2);
		q7o3 = new JTextField();
		cFrame.add(q7o3);
		q7o4 = new JTextField();
		cFrame.add(q7o4);
		
		q8 = new JTextField("8:"); //column 9
		cFrame.add(q8);
		q8o1 = new JTextField();
		cFrame.add(q8o1);
		q8o2 = new JTextField();
		cFrame.add(q8o2);
		q8o3 = new JTextField();
		cFrame.add(q8o3);
		q8o4 = new JTextField();
		cFrame.add(q8o4);
		
		q9 = new JTextField("9:"); //column 10
		cFrame.add(q9);
		q9o1 = new JTextField();
		cFrame.add(q9o1);
		q9o2 = new JTextField();
		cFrame.add(q9o2);
		q9o3 = new JTextField();
		cFrame.add(q9o3);
		q9o4 = new JTextField();
		cFrame.add(q9o4);
		
		q10 = new JTextField("10:"); //column 11
		cFrame.add(q10);
		q10o1 = new JTextField();
		cFrame.add(q10o1);
		q10o2 = new JTextField();
		cFrame.add(q10o2);
		q10o3 = new JTextField();
		cFrame.add(q10o3);
		q10o4 = new JTextField();
		cFrame.add(q10o4);
		
		title = new JTextField("title"); //column 12
		cFrame.add(title);
		play = new JButton("PLAY AND SAVE"); play.addActionListener(this); cFrame.add(play);
		a1 = new JTextArea("Instructions: erase and fill with \nquestions and options!");
		a1.setSize(30, 10);	a1.setEditable(false); cFrame.add(a1);
		back2 = new JButton("BACK"); back2.addActionListener(this); cFrame.add(back2);
		thank = new JTextField("thank you message"); cFrame.add(thank);
		cFrame.setVisible(true);
	}
	public void save() {
		customQ.set(0,q1.getText()); customQ.set(1,q2.getText()); //save custom questions into an array
		customQ.set(2,q3.getText()); customQ.set(3,q4.getText()); customQ.set(4,q5.getText()); customQ.set(5,q6.getText());
		customQ.set(6,q7.getText()); customQ.set(7,q8.getText()); customQ.set(8,q9.getText()); customQ.set(9,q10.getText());
		
		customO1.set(0,q1o1.getText()); //save custom question options into respective arrays
		customO1.set(1,q1o2.getText()); customO1.set(2,q1o3.getText()); customO1.set(3,q1o4.getText());
		customO2.set(0,q2o1.getText());customO2.set(1,q2o2.getText());customO2.set(2,q2o3.getText());customO2.set(3,q2o4.getText());
		customO3.set(0,q3o1.getText());customO3.set(1,q3o2.getText());customO3.set(2,q3o3.getText());customO3.set(3,q3o4.getText());
		customO4.set(0,q4o1.getText());customO4.set(1,q4o2.getText());customO4.set(2,q4o3.getText());customO4.set(3,q4o4.getText());
		customO5.set(0,q5o1.getText());customO5.set(1,q5o2.getText());customO5.set(2,q5o3.getText());customO5.set(3,q5o4.getText());
		customO6.set(0,q6o1.getText());customO6.set(1,q6o2.getText());customO6.set(2,q6o3.getText());customO6.set(3,q6o4.getText());
		customO7.set(0,q7o1.getText());customO7.set(1,q7o2.getText());customO7.set(2,q7o3.getText());customO7.set(3,q7o4.getText());
		customO8.set(0,q8o1.getText());customO8.set(1,q8o2.getText());customO8.set(2,q8o3.getText());customO8.set(3,q8o4.getText());
		customO9.set(0,q9o1.getText());customO9.set(1,q9o2.getText());customO9.set(2,q9o3.getText());customO9.set(3,q9o4.getText());
		customO10.set(0,q10o1.getText());customO10.set(1,q10o2.getText());customO10.add(2,q10o3.getText());customO10.add(3,q10o4.getText());
		
		customT = title.getText(); customThank = thank.getText();//saving custom title and thank you message
	}
	public void playSurvey() {//method to play your Created Survey
		answers.add(" ");answers.add(" ");answers.add(" ");answers.add(" ");answers.add(" ");
		answers.add(" ");answers.add(" ");answers.add(" ");answers.add(" ");answers.add(" ");
	}
	public void blank() {
		customQ.add(""); customQ.add(""); customQ.add(""); customQ.add(""); customQ.add(""); customQ.add("");
		customQ.add(""); customQ.add(""); customQ.add(""); customQ.add("");
		customO1.add(""); customO1.add(""); customO1.add(""); customO1.add("");
		customO2.add(""); customO2.add(""); customO2.add(""); customO2.add("");
		customO3.add(""); customO3.add(""); customO3.add(""); customO3.add("");
		customO4.add(""); customO4.add(""); customO4.add(""); customO4.add("");
		customO5.add(""); customO5.add(""); customO5.add(""); customO5.add("");
		customO6.add(""); customO6.add(""); customO6.add(""); customO6.add("");
		customO7.add(""); customO7.add(""); customO7.add(""); customO7.add("");
		customO8.add(""); customO8.add(""); customO8.add(""); customO8.add("");
		customO9.add(""); customO9.add(""); customO9.add(""); customO9.add("");
		customO10.add(""); customO10.add(""); customO10.add(""); customO10.add("");
	}
	
	public void menu() {//same stuff as premade survey menus
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); menuFrame.setSize(1100,700);
		menuFrame.getContentPane().setBackground(Color.gray); menuFrame.setTitle("Custom Survey");
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); menuPanel.setBackground(Color.darkGray);
		menuPanel.setPreferredSize(new Dimension(100,100));
		menuLabel.setForeground(Color.white); menuLabel.setText("This is your custom survey!");
		menuLabel.setFont(new Font("Arial",Font.PLAIN,30));
		menuPanel.add(menuLabel); menuPanel.add(playButton); menuPanel.add(back); menuFrame.add(menuPanel);
		playButton.addActionListener(this); back.addActionListener(this);
		menuFrame.setVisible(true);
	}
	@Override
	public void create() { //method to create the survey frame and stuff
		suvFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		suvFrame.setSize(1100,700);
		suvFrame.getContentPane().setBackground(Color.gray);
		suvFrame.setTitle(customT);
		
		suvPanel1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		suvPanel1.setBackground(Color.darkGray);
		suvPanel1.setPreferredSize(new Dimension(100,100));
		
		suvPanel2.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		suvPanel2.setBackground(Color.black);
		suvPanel2.setPreferredSize(new Dimension(100,100));
		
		qLabel.setForeground(Color.white);
		qLabel.setFont(new Font("Arial",Font.PLAIN,30));
		suvPanel2.add(qLabel);
		
		aButton1.addActionListener(this); //adding action listener to buttons
		aButton2.addActionListener(this);
		aButton3.addActionListener(this);
		aButton4.addActionListener(this);
		submit.addActionListener(this);
		
		suvPanel1.add(aButton1); //adding answer buttons
		aButton1.setVisible(true);
		
		suvPanel1.add(aButton2);
		aButton2.setVisible(true);
		
		suvPanel1.add(aButton3);
		aButton3.setVisible(true);
		
		suvPanel1.add(aButton4);
		aButton4.setVisible(true);
		
		submit.setVisible(true);
		suvPanel1.add(submit);
		question = "1";
		
		suvFrame.add(suvPanel2,BorderLayout.CENTER);
		suvFrame.add(suvPanel1,BorderLayout.SOUTH);
		suvFrame.setVisible(true);
	}

	@Override
	public void resetSurvey() { //resets question number, answer text, and button texts
		question = "1";
		answer = "";
		qLabel.setText("");
		aButton1.setText("");
		aButton2.setText("");
		aButton3.setText("");
		aButton4.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == play) { //playing created survey (it also saves the survey)
			playSurvey();
			save();
			menu();
			cFrame.dispose();
		}
		if (e.getSource() == back2) { //going back to main menu from Survey Creator window
			cFrame.dispose();
			m1 = new mainMenu();
		}
		if(e.getSource()==playButton && surveyNum == 4) { //action when you press 'play'
			menuFrame.dispose();
			create();
		}
		else if(e.getSource()==back) { //action when you press 'back'
			menuFrame.dispose();
			createFrame();
		}
		
		//submit button to make save each answer to a variable
		if(e.getSource()==submit && question == "1") { //submit answer 1
			answers.set(0, answer);
			System.out.println("answer 1: "+answers.get(0));
			question = "2";
		}
		else if(e.getSource()==submit && question == "2") { //submit answer 2
			answers.set(1, answer);
			System.out.println("answer 2: "+answers.get(1));
			question = "3";
		}
		else if(e.getSource()==submit && question == "3") { //submit answer 3
			answers.set(2, answer);
			System.out.println("answer 3: "+answers.get(2));
			question = "4";
		}
		else if(e.getSource()==submit && question == "4") { //submit answer 4
			answers.set(3, answer);
			System.out.println("answer 4: "+answers.get(3));
			question = "5";
		}
		else if(e.getSource()==submit && question == "5") { //submit answer 5
			answers.set(4, answer);
			System.out.println("answer 5: "+answers.get(4));
			question = "6";
		}
		else if(e.getSource()==submit && question == "6") { //submit answer 6
			answers.set(5, answer);
			System.out.println("answer 6: "+answers.get(5));
			question = "7";
		}
		else if(e.getSource()==submit && question == "7") { //submit answer 7
			answers.set(6, answer);
			System.out.println("answer 7: "+answers.get(6));
			question = "8";
		}
		else if(e.getSource()==submit && question == "8") { //submit answer 8
			answers.set(7, answer);
			System.out.println("answer 8: "+answers.get(7));
			question = "9";
		}
		else if(e.getSource()==submit && question == "9") { //submit answer 9
			answers.set(8, answer);
			System.out.println("answer 9: "+answers.get(8));
			question = "10";
		}
		else if(e.getSource()==submit && question == "10") { //submit answer 10
			answers.set(9, answer);
			System.out.println("answer 10: "+answers.get(9));
			question = "thank";
		}
		
		//question switch statements
		switch(question) {
			case "1":
				qLabel.setText(customQ.get(0)); //question
				aButton1.setText(customO1.get(0)); //setting option button texts for question 1
				aButton2.setText(customO1.get(1));
				aButton3.setText(customO1.get(2));
				aButton4.setText(customO1.get(3));
				if(e.getSource()==aButton1 && question == "1") { //action for each button
					answer = customO1.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "1") {
					answer = customO1.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "1") {
					answer = customO1.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "1") {
					answer = customO1.get(3);
					System.out.println(answer);
				}
				break;
			case "2": //question 2
				qLabel.setText(customQ.get(1));
				aButton1.setText(customO2.get(0));
				aButton2.setText(customO2.get(1));
				aButton3.setText(customO2.get(2));
				aButton4.setText(customO2.get(3));
				if(e.getSource()==aButton1 && question == "2") {
					answer = customO2.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "2") {
					answer = customO2.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "2") {
					answer = customO2.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "2") {
					answer = customO2.get(3);
					System.out.println(answer);
				}
				break;
			case "3": //question 3
				qLabel.setText(customQ.get(2));
				aButton1.setText(customO3.get(0));
				aButton2.setText(customO3.get(1));
				aButton3.setText(customO3.get(2));
				aButton4.setText(customO3.get(3));
				if(e.getSource()==aButton1 && question == "3") {
					answer = customO3.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "3") {
					answer = customO3.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "3") {
					answer = customO3.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "3") {
					answer = customO3.get(3);
					System.out.println(answer);
				}
				break;
			case "4": //question 4
				qLabel.setText(customQ.get(3));
				aButton1.setText(customO4.get(0));
				aButton2.setText(customO4.get(1));
				aButton3.setText(customO4.get(2));
				aButton4.setText(customO4.get(3));
				if(e.getSource()==aButton1 && question == "4") {
					answer = customO4.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "4") {
					answer = customO4.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "4") {
					answer = customO4.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "4") {
					answer = customO4.get(3);
					System.out.println(answer);
				}
				break;
			case "5": //question 5
				qLabel.setText(customQ.get(4));
				aButton1.setText(customO5.get(0));
				aButton2.setText(customO5.get(1));
				aButton3.setText(customO5.get(2));
				aButton4.setText(customO5.get(3));
				if(e.getSource()==aButton1 && question == "5") {
					answer = customO5.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "5") {
					answer = customO5.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "5") {
					answer = customO5.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "5") {
					answer = customO5.get(3);
					System.out.println(answer);
				}
				break;
			case "6": //question 6
				qLabel.setText(customQ.get(5));
				aButton1.setText(customO6.get(0));
				aButton2.setText(customO6.get(1));
				aButton3.setText(customO6.get(2));
				aButton4.setText(customO6.get(3));
				if(e.getSource()==aButton1 && question == "6") {
					answer = customO6.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "6") {
					answer = customO6.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "6") {
					answer = customO6.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "6") {
					answer = customO6.get(3);
					System.out.println(answer);
				}
				break;
			case "7": //question 7
				qLabel.setText(customQ.get(6));
				aButton1.setText(customO7.get(0));
				aButton2.setText(customO7.get(1));
				aButton3.setText(customO7.get(2));
				aButton4.setText(customO7.get(3));
				if(e.getSource()==aButton1 && question == "7") {
					answer = customO7.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "7") {
					answer = customO7.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "7") {
					answer = customO7.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "7") {
					answer = customO7.get(3);
					System.out.println(answer);
				}
				break;
			case "8": //question 8
				qLabel.setText(customQ.get(7));
				aButton1.setText(customO8.get(0));
				aButton2.setText(customO8.get(1));
				aButton3.setText(customO8.get(2));
				aButton4.setText(customO8.get(3));
				if(e.getSource()==aButton1 && question == "8") {
					answer = customO8.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "8") {
					answer = customO8.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "8") {
					answer = customO8.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "8") {
					answer = customO8.get(3);
					System.out.println(answer);
				}
				break;
			case "9": //question 9
				qLabel.setText(customQ.get(8));
				aButton1.setText(customO9.get(0));
				aButton2.setText(customO9.get(1));
				aButton3.setText(customO9.get(2));
				aButton4.setText(customO9.get(3));
				if(e.getSource()==aButton1 && question == "9") {
					answer = customO9.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "9") {
					answer = customO9.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "9") {
					answer = customO9.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "9") {
					answer = customO9.get(3);
					System.out.println(answer);
				}
				break;
			case "10": //question 10
				qLabel.setText(customQ.get(9));
				aButton1.setText(customO10.get(0));
				aButton2.setText(customO10.get(1));
				aButton3.setText(customO10.get(2));
				aButton4.setText(customO10.get(3));
				if(e.getSource()==aButton1 && question == "10") {
					answer = customO10.get(0);
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "10") {
					answer = customO10.get(1);
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "10") {
					answer = customO10.get(2);
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "10") {
					answer = customO10.get(3);
					System.out.println(answer);
				}
				break;
			case "thank": //thank you message
				qLabel.setFont(new Font("Arial",Font.PLAIN,20));
				qLabel.setText(customThank);
				aButton1.setText("EXIT");
				aButton2.setVisible(false); //setting buttons to false
				aButton3.setVisible(false);
				aButton4.setVisible(false);
				submit.setVisible(false);
				if(e.getSource()==aButton1 && question == "thank") { //action to return to main menu
					System.exit(0);
				}
				break;
		}
		
	}
	
}
