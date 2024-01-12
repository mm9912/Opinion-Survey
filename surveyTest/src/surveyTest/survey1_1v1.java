package surveyTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

//The Three Decent Coders
//Survey Application

//Darrell Abubo
//Mel Meneses
//Michael Alvarez
//November 16th, 2023

//survey 1
public class survey1_1v1 implements surveyInt, ActionListener{
	
	String question = "", answer = ""; //string variables for question and answer
	private ArrayList<String> answers = new ArrayList<String>(10);
	int surveyNum = 0;
        JLabel displayField;
        JLabel displayField2;
        JLabel displayField3;
        JLabel displayField4;
        JLabel displayField5;
        JLabel displayField6;
        JLabel displayField7;
        JLabel displayField8;
        JLabel displayField9;
        JLabel displayField10;
        JLabel displayField0;
        ImageIcon image;
        ImageIcon image2;
        ImageIcon image3;
        ImageIcon image4;
        ImageIcon image5;
        ImageIcon image6;
        ImageIcon image7;
        ImageIcon image8;
        ImageIcon image9;
        ImageIcon image10;
        ImageIcon image0;
	
	survey1_1v1(){
		
		menu(); //menu method
		answers.add(" "); //filling arraylist with air so that the answers can be set
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		answers.add(" ");
		playButton.addActionListener(this); //adding action listener to play and back buttons
		back.addActionListener(this);
	}
	
	@Override
	public void menu() {
		
		surveyNum = 1;
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation
		menuFrame.setSize(1100,700); //setting size
		menuFrame.getContentPane().setBackground(Color.gray); //setting background colour
		menuFrame.setTitle("Survey Intro");
		
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		menuPanel.setBackground(new Color(153, 51, 102)); //setting background colour
		menuPanel.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		menuLabel.setForeground(Color.white);
		menuLabel.setText("Welcome to Survey 1. This survey is about food and your opinions on various foods,"
				+ "along with other food-related questions.");
		menuLabel.setFont(new Font("Comic Sans",Font.PLAIN,20));
		
		menuPanel.add(menuLabel);
		menuPanel.add(playButton);
		menuPanel.add(back);
		menuFrame.add(menuPanel);
		
		menuFrame.setVisible(true);
	}

	@Override
	public void create() {
		
		suvFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation
		suvFrame.setSize(1100,700); //setting size
		suvFrame.getContentPane().setBackground(Color.gray); //setting background colour
		suvFrame.setTitle("Survey 1:");
		
		suvPanel1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		suvPanel1.setBackground(Color.darkGray); //setting background colour
		suvPanel1.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		suvPanel2.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		suvPanel2.setBackground(new Color(153, 51, 102)); //setting background colour
		suvPanel2.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		qLabel.setForeground(Color.white); //setting question font and text
		qLabel.setFont(new Font("Comic Sans",Font.PLAIN,40));
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playButton && surveyNum == 1) { //action when you press 'play'
			menuFrame.dispose();
			create();
			System.out.println("Survey "+surveyNum);
		}
		else if(e.getSource()==back && surveyNum == 1) { //action when you press 'back'
			menuFrame.dispose();
			premadeSurveys prems = new premadeSurveys(); //premadeSurveys object
			prems.initialize(); //using the initializing method to make the new window
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
				qLabel.setText("Question 1: What is your favorite breakfast food?"); //question
                             try{
                                image = new ImageIcon(getClass().getResource("breakfast.jpg"));
                                displayField = new JLabel(image);
                                clearSuvPanel2();
                                suvPanel2.add(displayField,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("eggs and bacon"); //setting option button texts for question 1
				aButton2.setText("cereal");
				aButton3.setText("pancakes");
				aButton4.setText("oatmeal");
				if(e.getSource()==aButton1 && question == "1") { //action for each button
					answer = "eggs and bacon";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "1") {
					answer = "cereal";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "1") {
					answer = "pancakes";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "1") {
					answer = "oatmeal";
					System.out.println(answer);
				}
				break;
			case "2": //question 2
				qLabel.setText("Question 2: What is your favorite lunch food?");
                              try{
                                image2 = new ImageIcon(getClass().getResource("s1i2.jpeg"));
                                displayField2 = new JLabel(image2);
                                clearSuvPanel2();
                                suvPanel2.add(displayField2,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("sandwich");
				aButton2.setText("burger");
				aButton3.setText("salad");
				aButton4.setText("hot dogs");
				if(e.getSource()==aButton1 && question == "2") {
					answer = "sandwich";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "2") {
					answer = "burger";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "2") {
					answer = "salad";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "2") {
					answer = "hot dogs";
					System.out.println(answer);
				}
				break;
			case "3": //question 3
				qLabel.setText("Question 3: What is your favorite dinner food?");
                            try{
                                image3 = new ImageIcon(getClass().getResource("s1i3.jpeg"));
                                displayField3 = new JLabel(image3);
                                clearSuvPanel2();
                                suvPanel2.add(displayField3,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("pizza");
				aButton2.setText("pasta");
				aButton3.setText("rice and chicken");
				aButton4.setText("sushi");
				if(e.getSource()==aButton1 && question == "3") {
					answer = "pizza";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "3") {
					answer = "pasta";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "3") {
					answer = "rice and chicken";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "3") {
					answer = "sushi";
					System.out.println(answer);
					
				}
				break;
			case "4": //question 4
				qLabel.setText("Question 4: What is your favorite dessert?");
                            try{
                                image4 = new ImageIcon(getClass().getResource("s1i4.jpg"));
                                displayField4 = new JLabel(image4);
                                clearSuvPanel2();
                                suvPanel2.add(displayField4,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("ice cream");
				aButton2.setText("chocolate");
				aButton3.setText("candy");
				aButton4.setText("cake");
				if(e.getSource()==aButton1 && question == "4") {
					answer = "ice cream";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "4") {
					answer = "chocolate";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "4") {
					answer = "candy";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "4") {
					answer = "cake";
					System.out.println(answer);
				}
				break;
			case "5": //question 5
				qLabel.setText("Question 5: How many meals do you eat per day?");
                            try{
                                image5 = new ImageIcon(getClass().getResource("s1i5.jpg"));
                                displayField5 = new JLabel(image5);
                                clearSuvPanel2();
                                suvPanel2.add(displayField5,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("1");
				aButton2.setText("2");
				aButton3.setText("3");
				aButton4.setText("4 or above");
				if(e.getSource()==aButton1 && question == "5") {
					answer = "1";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "5") {
					answer = "2";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "5") {
					answer = "3";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "5") {
					answer = "4 or above";
					System.out.println(answer);
				}
				break;
			case "6": //question 6
				qLabel.setText("Question 6: What is your favorite snack to eat?");
                            try{
                                image6 = new ImageIcon(getClass().getResource("s1i6.jpg"));
                                displayField6 = new JLabel(image6);
                                clearSuvPanel2();
                                suvPanel2.add(displayField6,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("cookies");
				aButton2.setText("chips");
				aButton3.setText("crackers");
				aButton4.setText("popcorn");
				if(e.getSource()==aButton1 && question == "6") {
					answer = "cookies";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "6") {
					answer = "chips";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "6") {
					answer = "crackers";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "6") {
					answer = "popcorn";
					System.out.println(answer);
				}
				break;
			case "7": //question 7
				qLabel.setText("Question 7: Where do you usually eat dinner?");
                            try{
                                image7 = new ImageIcon(getClass().getResource("s1i7.jpg"));
                                displayField7 = new JLabel(image7);
                                clearSuvPanel2();
                                suvPanel2.add(displayField7,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("bedroom");
				aButton2.setText("kitchen");
				aButton3.setText("dining table");
				aButton4.setText("outside");
				if(e.getSource()==aButton1 && question == "7") {
					answer = "bedroom";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "7") {
					answer = "kitchen";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "7") {
					answer = "dining table";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "7") {
					answer = "outside";
					System.out.println(answer);
				}
				break;
			case "8": //question 8
				qLabel.setFont(new Font("Comic Sans",Font.PLAIN,50));
				qLabel.setText("Question 8: When do you eat lunch?");
                            try{
                                image8 = new ImageIcon(getClass().getResource("s1i8.jpeg"));
                                displayField8 = new JLabel(image8);
                                clearSuvPanel2();
                                suvPanel2.add(displayField8,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
                                displayField7.setVisible(false);
				aButton1.setText("11AM");
				aButton2.setText("12PM");
				aButton3.setText("1PM");
				aButton4.setText("2PM or later");
				if(e.getSource()==aButton1 && question == "8") {
					answer = "11AM";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "8") {
					answer = "12PM";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "8") {
					answer = "1PM";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "8") {
					answer = "2PM or later";
					System.out.println(answer);
				}
				break;
			case "9": //question 9
				qLabel.setText("Question 9: Opinion on brunch?");
                            try{
                                image9 = new ImageIcon(getClass().getResource("s1i9.jpg"));
                                displayField9 = new JLabel(image9);
                                clearSuvPanel2();
                                suvPanel2.add(displayField9,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("I LOVE IT!! :D");
				aButton2.setText("it's pretty good");
				aButton3.setText("meh");
				aButton4.setText("I'll pass");
				if(e.getSource()==aButton1 && question == "9") {
					answer = "I LOVE IT!! :D";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "9") {
					answer = "it's pretty good";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "9") {
					answer = "meh";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "9") {
					answer = "I'll pass";
					System.out.println(answer);
				}
				break;
			case "10": //question 10
				qLabel.setText("Question 10: Did you enjoy this survey?");
                            try{
                                image10 = new ImageIcon(getClass().getResource("s1i10.jpg"));
                                displayField10 = new JLabel(image10);
                                clearSuvPanel2();
                                suvPanel2.add(displayField10,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("YESSS");
				aButton2.setText("yeah it was nice");
				aButton3.setText("not really");
				aButton4.setText("no.");
				if(e.getSource()==aButton1 && question == "10") {
					answer = "YESSS";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "10") {
					answer = "yeah it was nice";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "10") {
					answer = "not really";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "10") {
					answer = "no.";
					System.out.println(answer);
				}
				break;
			case "thank": //thank you message
				qLabel.setFont(new Font("Comic Sans",Font.PLAIN,20));
				qLabel.setText("Thank you for taking our survey! Please restart the program to try another survey or to create and play your own survey.");
                            try{
                                image0 = new ImageIcon(getClass().getResource("thankyou.jpg"));
                                displayField0 = new JLabel(image0);
                                clearSuvPanel2();
                                suvPanel2.add(displayField0,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
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

	@Override
	public void resetSurvey() {
		question = "";
		answer = "";
		qLabel.setText(" ");
		aButton1.setText(" ");
		aButton2.setText(" ");
		aButton3.setText(" ");
		aButton4.setText(" ");
	}
    private Font Font(String verdana, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void clearSuvPanel2() {
        suvPanel2.removeAll();
        suvPanel2.revalidate();
        suvPanel2.repaint();
        suvPanel2.add(qLabel);
    }
	
}
