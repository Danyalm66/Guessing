import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Guess {

	public JFrame frame;
	public int answer,guess;
	public String str;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guess window = new Guess();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Guess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(279, 80, 74, 22);
		frame.getContentPane().add(textField);
		
		Label label = new Label("I'm thinking of a number between 1 and 20. ");
		label.setFont(new Font("EucrosiaUPC", Font.BOLD, 14));
		label.setBounds(67, 0, 325, 33);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Guess what it is: ");
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(231, 49, 133, 22);
		frame.getContentPane().add(label_1);
		frame.setBounds(100, 100, 450, 300);
		
		Button button = new Button("Check");
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Answer ans = new Answer();
				str = textField.getText();
				if(!str.isEmpty() && str.matches("\\d+")){
					guess = Integer.parseInt(str);
					if(guess>=1 && guess<=20){
						final int MAX = 20;
						Random generator = new Random();
						answer = generator.nextInt(MAX) + 1;
						if(answer !=guess){
							ans.label.setText("That is not correct, sorry.\nThe number was " + answer);
							frame.setVisible(false);
							ans.frame.setVisible(true);
						}else{
							ans.label.setText("You got it! Good guessing!");
							ans.frame.setVisible(true);
					}}else{
						JOptionPane.showMessageDialog(frame, "Number must be in between 1 to 20!!");
			}}else{
				JOptionPane.showMessageDialog(frame, "Enter a Number!!");
			}
			}
			});
		button.setBackground(Color.WHITE);
		button.setBounds(254, 122, 126, 22);
		frame.getContentPane().add(button);
		
		Label label_2 = new Label("Enter:");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(241, 80, 47, 22);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		try{
			ImageIcon img = new ImageIcon(getClass().getResource("/resource/index.jpg"));
			label_3.setIcon(img);
			}catch(Exception e){
				e.printStackTrace();}
		label_3.setBounds(10, 25, 299, 242);
		frame.getContentPane().add(label_3);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		}

