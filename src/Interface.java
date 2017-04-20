import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Button;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 408, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGuessingMachine = new JLabel("Guessing Machine");
		lblGuessingMachine.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblGuessingMachine.setForeground(Color.RED);
		lblGuessingMachine.setBounds(132, 36, 268, 84);
		frame.getContentPane().add(lblGuessingMachine);
		
		Button button = new Button("PLAY");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Guess gss = new Guess();
				gss.frame.setVisible(true);
			}
		});
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		button.setForeground(Color.YELLOW);
		button.setBounds(241, 126, 76, 31);
		frame.getContentPane().add(button);
		
		
		Button button_1 = new Button("QUIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button_1.setForeground(Color.YELLOW);
		button_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(241, 160, 76, 31);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("");
		try{
		ImageIcon img = new ImageIcon(getClass().getResource("/resource/number-guessing-java-game.jpg"));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/resource/icon.PNG.ico"));
		label.setIcon(img);
		}catch(Exception e){
			e.printStackTrace();}
		label.setBounds(0, 0, 400, 258);
		frame.getContentPane().add(label);
	}

}

