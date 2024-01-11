package surveyTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.*;


public class survey3_3v3 implements surveyInt, ActionListener{
	
	String question = "", answer = ""; //string variables for question and answer
	private ArrayList<String> answers = new ArrayList<String>(10);
        int surveyNum = 3;
        JLabel displayField21;
        JLabel displayField22;
        JLabel displayField23;
        JLabel displayField24;
        JLabel displayField25;
        JLabel displayField26;
        JLabel displayField27;
        JLabel displayField28;
        JLabel displayField29;
        JLabel displayField30;
        JLabel displayField0;
        ImageIcon image21;
        ImageIcon image22;
        ImageIcon image23;
        ImageIcon image24;
        ImageIcon image25;
        ImageIcon image26;
        ImageIcon image27;
        ImageIcon image28;
        ImageIcon image29;
        ImageIcon image30;
        ImageIcon image0;
	
	survey3_3v3(){
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
		
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation
		menuFrame.setSize(1100,700); //setting size
		menuFrame.getContentPane().setBackground(Color.gray); //setting background colour
		menuFrame.setTitle("Survey Intro");
		
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		menuPanel.setBackground(new Color(0, 89, 179)); //setting background colour
		menuPanel.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		menuLabel.setForeground(Color.white);
		menuLabel.setText("Welcome to Survey 3. This survey is all about personal lifestyle choices.");
		menuLabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
		
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
		suvFrame.setTitle("Survey 3: ");
		
		suvPanel1.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		suvPanel1.setBackground(Color.darkGray); //setting background colour
		suvPanel1.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		suvPanel2.setLayout(new FlowLayout(FlowLayout.CENTER,20,10)); //setting layout
		suvPanel2.setBackground(new Color(0, 89, 179)); //setting background colour
		suvPanel2.setPreferredSize(new Dimension(100,100)); //setting preferred size
		
		qLabel.setFont(new Font("Times New Roman",Font.PLAIN,40));
		qLabel.setForeground(Color.white); //setting question font and text
		suvPanel2.add(qLabel);
		
		aButton1.addActionListener(this); //adding action listener to buttons
		aButton2.addActionListener(this);
		aButton3.addActionListener(this);
		aButton4.addActionListener(this);
		submit.addActionListener(this);
		
		suvPanel1.add(aButton1); //adding answer buttons
		suvPanel1.add(aButton2);
		suvPanel1.add(aButton3);
		suvPanel1.add(aButton4);
		suvPanel1.add(submit);
		question = "1";
		
		suvFrame.add(suvPanel2,BorderLayout.CENTER);
		suvFrame.add(suvPanel1,BorderLayout.SOUTH);
		suvFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playButton && surveyNum == 3) { //action when you press 'play'
			menuFrame.dispose();
			create();
			System.out.println("Survey "+surveyNum);
		}
		else if(e.getSource()==back && surveyNum == 3) { //action when you press 'back'
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
                        displayField21.setVisible(false);
			answers.set(1, answer);
			System.out.println("answer 2: "+answers.get(1));
			question = "3";
		}
		else if(e.getSource()==submit && question == "3") { //submit answer 3
                        displayField22.setVisible(false);
			answers.set(2, answer);
			System.out.println("answer 3: "+answers.get(2));
			question = "4";
		}
		else if(e.getSource()==submit && question == "4") { //submit answer 4
                        displayField23.setVisible(false);
			answers.set(3, answer);
			System.out.println("answer 4: "+answers.get(3));
			question = "5";
		}
		else if(e.getSource()==submit && question == "5") { //submit answer 5
                        displayField24.setVisible(false);
			answers.set(4, answer);
			System.out.println("answer 5: "+answers.get(4));
			question = "6";
		}
		else if(e.getSource()==submit && question == "6") { //submit answer 6
                        displayField25.setVisible(false);
			answers.set(5, answer);
			System.out.println("answer 6: "+answers.get(5));
			question = "7";
		}
		else if(e.getSource()==submit && question == "7") { //submit answer 7
                        displayField26.setVisible(false);
			answers.set(6, answer);
			System.out.println("answer 7: "+answers.get(6));
			question = "8";
		}
		else if(e.getSource()==submit && question == "8") { //submit answer 8
                        displayField27.setVisible(false);
			answers.set(7, answer);
			System.out.println("answer 8: "+answers.get(7));
			question = "9";
		}
		else if(e.getSource()==submit && question == "9") { //submit answer 9
                        displayField28.setVisible(false);
			answers.set(8, answer);
			System.out.println("answer 9: "+answers.get(8));
			question = "10";
		}
		else if(e.getSource()==submit && question == "10") { //submit answer 10
                        displayField29.setVisible(false);
			answers.set(9, answer);
			System.out.println("answer 10: "+answers.get(9));
			question = "thank";
		}
		
		//question switch statements
		switch(question) {
			case "1":
				qLabel.setText("Question 1: What time do you wake up in the morning?"); //question
                             try{
                                image21 = new ImageIcon(getClass().getResource("s3i1.jpg"));
                                displayField21 = new JLabel(image21);
                                clearSuvPanel2();
                                suvPanel2.add(displayField21,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("5-6 AM"); //setting option button texts for question 1
				aButton2.setText("7-8 AM");
				aButton3.setText("8-10 AM");
				aButton4.setText("Later than 10 AM");
				if(e.getSource()==aButton1 && question == "1") { //action for each button
					answer = "5-6 AM";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "1") {
					answer = "7-8 AM";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "1") {
					answer = "8-10 AM";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "1") {
					answer = "Later than 10 AM";
					System.out.println(answer);
				}
				break;
			case "2": //question 2
				qLabel.setText("Question 2: What is your preferred exercise type?");           
                            try{
                                image22 = new ImageIcon(getClass().getResource("s3i2.png"));
                                displayField22 = new JLabel(image22);
                                clearSuvPanel2();
                                suvPanel2.add(displayField22,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Cardio (Running, Cycling)");
				aButton2.setText("Strength Training");
				aButton3.setText("Yoga/Pilates");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "2") {
					answer = "Cardio (Running, Cycling)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "2") {
					answer = "Strength Training";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "2") {
					answer = "Yoga/Pilates";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "2") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "3": //question 3
				qLabel.setText("Question 3: What is your preferred weekend activity?");
                            try{
                                image23 = new ImageIcon(getClass().getResource("s3i3.jpg"));
                                displayField23 = new JLabel(image23);
                                clearSuvPanel2();
                                suvPanel2.add(displayField23,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Exploring Nature");
				aButton2.setText("Cultural Events/Museums");
				aButton3.setText("Relaxing at Home");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "3") {
					answer = "Exploring Nature";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "3") {
					answer = "Cultural Events/Museums";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "3") {
					answer = "Relaxing at Home";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "3") {
					answer = "Other";
					System.out.println(answer);
					
				}
				break;
			case "4": //question 4
				qLabel.setText("Question 4: What is your breakfast preference?");           
                            try{
                                image24 = new ImageIcon(getClass().getResource("s3i4.jpg"));
                                displayField24 = new JLabel(image24);
                                clearSuvPanel2();
                                suvPanel2.add(displayField24,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Sweet (e.g., Pancakes, Waffles)");
				aButton2.setText("Savory (e.g., Eggs, Bacon)");
				aButton3.setText("Healthy (e.g., Smoothie, Yogurt)");
				aButton4.setText("Daily");
				if(e.getSource()==aButton1 && question == "4") {
					answer = "Sweet (e.g., Pancakes, Waffles)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "4") {
					answer = "Savory (e.g., Eggs, Bacon)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "4") {
					answer = "Healthy (e.g., Smoothie, Yogurt)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "4") {
					answer = "Daily";
					System.out.println(answer);
				}
				break;
			case "5": //question 5
				qLabel.setText("Question 5: What genre of show do you enjoy the most?");            
                            try{
                                image25 = new ImageIcon(getClass().getResource("s3i5.jpg"));
                                displayField25 = new JLabel(image25);
                                clearSuvPanel2();
                                suvPanel2.add(displayField25,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }	
				aButton1.setText("Comedy");
				aButton2.setText("Drama");
				aButton3.setText("Sci-Fi/Fantasy");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "5") {
					answer = "Comedy";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "5") {
					answer = "Drama";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "5") {
					answer = "Sci-Fi/Fantasy";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "5") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "6": //question 6
				qLabel.setText("Question 6: Where would you go for vacation?");           
                            try{
                                image26 = new ImageIcon(getClass().getResource("s3i6.jpg"));
                                displayField26 = new JLabel(image26);
                                clearSuvPanel2();
                                suvPanel2.add(displayField26,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Beach Retreat");
				aButton2.setText("Mountain Escape");
				aButton3.setText("City Exploration");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "6") {
					answer = "Beach Retreat";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "6") {
					answer = "Mountain Escape";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "6") {
					answer = "City Exploration";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "6") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "7": //question 7
				qLabel.setText("Question 7: How do you prefer to socialize?");          
                            try{
                                image27 = new ImageIcon(getClass().getResource("s3i7.jpg"));
                                displayField27 = new JLabel(image27);
                                clearSuvPanel2();
                                suvPanel2.add(displayField27,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Dinner Parties at Home");
				aButton2.setText("Going Out to Restaurants/Bars");
				aButton3.setText("Outdoor Activities/Events");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "7") {
					answer = "Dinner Parties at Home";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "7") {
					answer = "Going Out to Restaurants/Bars";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "7") {
					answer = "Outdoor Activities/Events";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "7") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "8": //question 8
				qLabel.setText("Question 8: What is your preferred learning environment?");            
                            try{
                                image28 = new ImageIcon(getClass().getResource("s3i8.jpg"));
                                displayField28 = new JLabel(image28);
                                clearSuvPanel2();
                                suvPanel2.add(displayField28,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Classroom Setting");
				aButton2.setText("Online Courses");
				aButton3.setText("Self-paced Learning");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "8") {
					answer = "Classroom Setting";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "8") {
					answer = "Online Courses";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "8") {
					answer = "Self-paced Learning";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "8") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "9": //question 9
				qLabel.setFont(new Font("Comic Sans",Font.PLAIN,40));
				qLabel.setText("Question 9: What is your preferred web browser?");
                            try{
                                image29 = new ImageIcon(getClass().getResource("s3i9.jpg"));
                                displayField29 = new JLabel(image29);
                                clearSuvPanel2();
                                suvPanel2.add(displayField29,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }	
				aButton1.setText("Google Chrome");
				aButton2.setText("Mozilla Firefox");
				aButton3.setText("Safari");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "9") {
					answer = "Google Chrome";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "9") {
					answer = "Mozilla Firefox";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "9") {
					answer = "Safari";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "9") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "10": //question 10
				qLabel.setText("What are your sleeping habits?");
                            try{
                                image30 = new ImageIcon(getClass().getResource("s3i10.jpg"));
                                displayField30 = new JLabel(image30);
                                clearSuvPanel2();
                                suvPanel2.add(displayField30,BorderLayout.CENTER);
                            } catch (Exception i){
                                    System.out.println("Image cannot be found");
                            }
				aButton1.setText("Early to Bed, Early to Rise)");
				aButton2.setText("Balanced (7-8 hours)");
				aButton3.setText("Night Owl, Late Sleeper");
				aButton4.setText("Other");
				if(e.getSource()==aButton1 && question == "10") {
					answer = "Early to Bed, Early to Rise)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton2 && question == "10") {
					answer = "Balanced (7-8 hours)";
					System.out.println(answer);
				}
				if(e.getSource()==aButton3 && question == "10") {
					answer = "Night Owl, Late Sleeper";
					System.out.println(answer);
				}
				if(e.getSource()==aButton4 && question == "10") {
					answer = "Other";
					System.out.println(answer);
				}
				break;
			case "thank": //thank you message
				qLabel.setText("Thank you for taking our survey! Please restart the program to try another survey or to create and play your own survey.");
                            displayField30.setVisible(false);
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