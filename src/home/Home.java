package home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame{

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TESTE");
		lblNewLabel.setBounds(200, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
