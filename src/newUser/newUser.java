package newUser;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import alerts.userCreated;
import login.App;
import login.Usuario;

public class newUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField textPassword;
	public static HashMap<String, Usuario> userMap = new HashMap<String, Usuario>();

	JLabel errorLabel = new JLabel();
	String error, username, password;
	Usuario user = new Usuario();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newUser frame = new newUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public newUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 320);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel signInLabel = new JLabel("REGISTER");
		signInLabel.setBounds(200, 184, 100, 25);
		signInLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		signInLabel.setForeground(Color.WHITE);
		signInLabel.setHorizontalAlignment(JLabel.CENTER);
		signInLabel.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(signInLabel);

		signInLabel.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {
				signInLabel.setForeground(Color.WHITE);

			}

			public void mouseEntered(MouseEvent e) {
				signInLabel.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
				signInLabel.setForeground(Color.GREEN);

			}

			public void mouseClicked(MouseEvent e) {

				if (txtUsername.getText().isEmpty() || textPassword.getText().isEmpty()) {
					errorLabel.setText("* Mandatory Fields Missing!");

				} else {
					errorLabel.setText(null);
					if (!userMap.containsKey(txtUsername.getText())) {
						user.username = txtUsername.getText();
						user.password = textPassword.getText();
						userMap.put(user.username, user);
						new userCreated().setVisible(true);
						dispose();
					} else {
						errorLabel.setText("User Already Exists!");

					}

				}

			}
		});

		txtUsername = new JTextField();
		txtUsername.setText(null);
		txtUsername.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtUsername.setBounds(260, 70, 120, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(1);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(120, 70, 80, 20);
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPassword.setBounds(120, 115, 80, 20);
		contentPane.add(lblPassword);

		textPassword = new JTextField();
		textPassword.setFont(new Font("SansSerif", Font.BOLD, 12));
		textPassword.setColumns(1);
		textPassword.setBounds(260, 115, 120, 20);
		contentPane.add(textPassword);

		JLabel lblBack = new JLabel("BACK");
		lblBack.setVerticalAlignment(SwingConstants.CENTER);
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblBack.setBounds(200, 227, 100, 25);
		contentPane.add(lblBack);

		lblBack.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.WHITE);
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
				lblBack.setForeground(Color.GREEN);

			}

			public void mouseClicked(MouseEvent e) {
				dispose();
				new App().setVisible(true);
			}
		});

		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setForeground(Color.RED);
		errorLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		errorLabel.setBounds(120, 255, 260, 20);
		contentPane.add(errorLabel);

		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(390, 65, 20, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(390, 110, 20, 20);
		contentPane.add(lblNewLabel_1_1);

		JLabel logoLabel = new JLabel();
		logoLabel.setIcon(new ImageIcon("img/logo.png"));
		logoLabel.setVerticalAlignment(SwingConstants.CENTER);
		logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoLabel.setBounds(10, 11, 90, 90);
		contentPane.add(logoLabel);

	}
}
