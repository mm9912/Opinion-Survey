package surveyTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/**
 * 
 */

/**
 * @author melfe
 *
 */
public class survey2_2v2 implements surveyInt, ActionListener{
	
	String question = "", answer = ""; //string variables for question and answer
	private ArrayList<String> answers = new ArrayList<String>(10);
	int surveyNum = 0;
        JLabel displayField11;
        JLabel displayField12;
        JLabel displayField13;
        JLabel displayField14;
        JLabel displayField15;
        JLabel displayField16;
        JLabel displayField17;
        JLabel displayField18;
        JLabel displayField19;
        JLabel displayField20;
        JLabel displayField0;
        ImageIcon image11;
        ImageIcon image12;
        ImageIcon image13;
        ImageIcon image14;
        ImageIcon image15;
        ImageIcon image16;
        ImageIcon image17;
        ImageIcon image18;
        ImageIcon image19;
        ImageIcon image20;
        ImageIcon image0;
	
	survey2_2v2(){
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
		
		surveyNum = 2;
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation
		menuFrame.setSize(1100,700); //setting size
		menuFrame.getContentPane().setBackground(Color.gray); //setting background colour
		menuFrame.setTitle("Survey Intro");
		
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		menuPanel.setBackground(new Color(0, 204, 0)); //setting background colour
		menuPanel.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		menuLabel.setForeground(Color.white);
		menuLabel.setText("Welcome to Survey 2. This survey is all about movies, including your opinions on various films, as well as other movie-related questions.");
		menuLabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
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
		suvFrame.setTitle("Survey 2:");
		
		suvPanel1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		suvPanel1.setBackground(Color.darkGray); //setting background colour
		suvPanel1.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		suvPanel2.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		suvPanel2.setBackground(new Color(0, 204, 0)); //setting background colour
		suvPanel2.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		qLabel.setForeground(Color.white); //setting question font and text
		qLabel.setFont(new Font("Times New Roman",Font.PLAIN,40));
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
		if(e.getSource()==playButton && surveyNum == 2) { //action when you press 'play'
			menuFrame.dispose();
			create();
			System.out.println("Survey "+surveyNum);
		}
		else if(e.getSource()==back && surveyNum == 2) { //action when you press 'back'
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
				qLabel.setText("Question 1: What is your favorite actor/actress?"); //question
                            try{
                                image11 = new ImageIcon(getClass().getResource("s2i1.jpg"));
                                displayField11 = new JLabel(image11);
                                clearSuvPanel2();
                                suvPanel2.add(displayField11,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Keanu Reeves"); //setting option button texts for question 1
				aButton2.setText("Meryl Streep");
				aButton3.setText("Tom Hanks");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "1") { //action for each button
					answer = "Keanu Reeves";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "1") {
					answer = "Meryl Streep";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "1") {
					answer = "Tom Hanks";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "1") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "2": //question 2
				qLabel.setText("Question 2: What is your favorite movie?");
                            try{
                                image12 = new ImageIcon(getClass().getResource("s2i2.jpg"));
                                displayField12 = new JLabel(image12);
                                clearSuvPanel2();
                                suvPanel2.add(displayField12,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("FNAF (2023)");
				aButton2.setText("Oppenheimer");
				aButton3.setText("Barbie");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "2") {
					answer = "FNAF (2023)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "2") {
					answer = "Oppenheimer";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "2") {
					answer = "Barbie";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "2") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "3": //question 3
				qLabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
				qLabel.setText("Question 3: What is your preferred method of streaming movies/shows?");
                            try{
                                image13 = new ImageIcon(getClass().getResource("s2i3.jpg"));
                                displayField13 = new JLabel(image13);
                                clearSuvPanel2();
                                suvPanel2.add(displayField13,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Netflix");
				aButton2.setText("Disney+");
				aButton3.setText("Amazon Prime");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "3") {
					answer = "Netflix";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "3") {
					answer = "Disney+";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "3") {
					answer = "Amazon Prime";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "3") {
					answer = "Other";
					System.out.println(answer);
					
				}
				break;
			case "4": //question 4
				qLabel.setFont(new Font("Times New Roman",Font.PLAIN,40));
				qLabel.setText("Question 4: How often do you watch movies?");
                            try{
                                image14 = new ImageIcon(getClass().getResource("s2i4.jpg"));
                                displayField14 = new JLabel(image14);
                                clearSuvPanel2();
                                suvPanel2.add(displayField14,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Weekly");
				aButton2.setText("Monthly");
				aButton3.setText("Occasionally");
				aButton4.setText("Daily");
				if(e.getSource()==aButton1 && question == "4") {
					answer = "Weekly";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "4") {
					answer = "Monthly";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "4") {
					answer = "Occasionally";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "4") {
					answer = "Daily";
					System.out.println(answer);
				}
				break;
			case "5": //question 5
				qLabel.setText("Question 5: What genre of movies do you enjoy the most?");
                            try{
                                image15 = new ImageIcon(getClass().getResource("s2i5.jpg"));
                                displayField15 = new JLabel(image15);
                                clearSuvPanel2();
                                suvPanel2.add(displayField15,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Action");
				aButton2.setText("Comedies");
				aButton3.setText("Horror");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "5") {
					answer = "Action";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "5") {
					answer = "Comedies";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "5") {
					answer = "Horror";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "5") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "6": //question 6
				qLabel.setText("Question 6: When was the last time you went to a movie theater?");
                            try{
                                image16 = new ImageIcon(getClass().getResource("s2i6.jpg"));
                                displayField16 = new JLabel(image16);
                                clearSuvPanel2();
                                suvPanel2.add(displayField16,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Last Week");
				aButton2.setText("A While Ago");
				aButton3.setText("Pre-Pandemic (Freuqently Before)");
				aButton4.setText("Not Sure");
				if(e.getSource()==aButton1 && question == "6") {
					answer = "Last Week";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "6") {
					answer = "A While Ago";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "6") {
					answer = "Pre-Pandemic (Freuqently Before)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "6") {
					answer = "Not Sure";
					System.out.println(answer);
				}
				break;
			case "7": //question 7
				qLabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
				qLabel.setText("Question 7: Do you prefer watching movies alone or with friends/family?");
                            try{
                                image17 = new ImageIcon(getClass().getResource("s2i7.jpg"));
                                displayField17 = new JLabel(image17);
                                clearSuvPanel2();
                                suvPanel2.add(displayField17,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Solo/Alone");
				aButton2.setText("With Friends/Family");
				aButton3.setText("With Other People");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "7") {
					answer = "Solo/Alone";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "7") {
					answer = "With Friends/Family";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "7") {
					answer = "With Other People";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "7") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "8": //question 8
				qLabel.setText("Question 8: What factors influence your movie choices (reviews, cast, trailers)?");
                            try{
                                image18 = new ImageIcon(getClass().getResource("s2i8.png"));
                                displayField18 = new JLabel(image18);
                                clearSuvPanel2();
                                suvPanel2.add(displayField18,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Movie Reviews");
				aButton2.setText("Familiar Cast Members");
				aButton3.setText("Trailer/Gut Feeling");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "8") {
					answer = "Movie Reviews";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "8") {
					answer = "Familiar Cast Members";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "8") {
					answer = "Trailer/Gut Feeling";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "8") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "9": //question 9
				qLabel.setText("Question 9: Have you ever attended a film festival or special movie screening?");
                            try{
                                image19 = new ImageIcon(getClass().getResource("s2i9.png"));
                                displayField19 = new JLabel(image19);
                                clearSuvPanel2();
                                suvPanel2.add(displayField19,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Yes (Once)");
				aButton2.setText("Yes (Several)");
				aButton3.setText("No");
				aButton4.setText("Yes (A Few)");
				if(e.getSource()==aButton1 && question == "9") {
					answer = "Yes (Once)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "9") {
					answer = "Yes (Several)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "9") {
					answer = "No";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "9") {
					answer = "Yes (A Few)";
					System.out.println(answer);
				}
				break;
			case "10": //question 10
				qLabel.setText("Would you recommend a movie app subscription over a cable TV subscription?");
                            try{
                                image20 = new ImageIcon(getClass().getResource("s2i10.jpg"));
                                displayField20 = new JLabel(image20);
                                clearSuvPanel2();
                                suvPanel2.add(displayField20,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Yes (Movie/Show Applications)");
				aButton2.setText("No (Cable TV Preferred)");
				aButton3.setText("Yes (Other than Movie/Show Applications)");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "10") {
					answer = "Yes (Movie/Show Applications)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "10") {
					answer = "No (Cable TV Preferred)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "10") {
					answer = "Yes (Other than Movie/Show Applications)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "10") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "thank": //thank you message
				qLabel.setFont(new Font("Comic Sans",Font.PLAIN,50));
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