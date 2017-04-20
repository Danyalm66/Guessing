import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Answer {

	public JFrame frame;
	public JLabel label;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Answer window = new Answer();
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
	public Answer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Guess gss = new Guess(); 
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		Button button = new Button("No");
		button.setBackground(Color.LIGHT_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				JOptionPane.showMessageDialog(frame, "Have a Nic Day!");
			}
		});
		button.setBounds(269, 169, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Yes");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				gss.frame.setVisible(true);
			}
		});
		button_1.setBounds(149, 169, 70, 22);
		frame.getContentPane().add(button_1);
		
		JLabel label_2 = new JLabel("");
		try{
			ImageIcon img = new ImageIcon(getClass().getResource("/resource/700303-icon-61-warning-128.png"));
			label_2.setIcon(img);
			}catch(Exception e){
				e.printStackTrace();}
		label_2.setBounds(10, 22, 128, 110);
		frame.getContentPane().add(label_2);
		
		JLabel lblWouldYouLike = new JLabel("Would you like to play more?");
		lblWouldYouLike.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWouldYouLike.setBounds(136, 87, 275, 56);
		frame.getContentPane().add(lblWouldYouLike);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(136, 38, 288, 65);
		frame.getContentPane().add(label);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
