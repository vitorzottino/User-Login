package login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		setTitle("App");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 320);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField = new JTextField();
		textField.setBounds(229, 55, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(229, 106, 154, 20);
		contentPane.add(textField_1);

		JLabel lblNewLabel = new JLabel("User:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(145, 58, 80, 15);
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(145, 109, 80, 15);
		contentPane.add(lblPassword);

		JButton loginButton = new JButton("LOGIN");
		loginButton.setBackground(Color.WHITE);
		loginButton.setBounds(149, 176, 100, 50);
		contentPane.add(loginButton);

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(259, 176, 100, 50);
		contentPane.add(btnCancel);

		JLabel hyperlink = new JLabel("New User");
		hyperlink.setForeground(Color.WHITE);
		hyperlink.setBounds(229, 237, 86, 20);
		getContentPane().add(hyperlink);
		hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Font font = hyperlink.getFont();
		Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		hyperlink.setFont(font.deriveFont(attributes));
		
		JLabel logoLabel = new JLabel();
		logoLabel.setIcon(new ImageIcon("img/logo.png"));
		Dimension size = logoLabel.getPreferredSize();
		logoLabel.setHorizontalAlignment(JLabel.CENTER);
        logoLabel.setVerticalAlignment(JLabel.CENTER);
        
		logoLabel.setBounds(25, 25, 90, 90);
		contentPane.add(logoLabel);
		
		
		
		

	}
}
