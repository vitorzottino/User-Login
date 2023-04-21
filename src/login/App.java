package login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import infos.Vision;
import newUser.newUser;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	
	newUser userpage = new newUser();
	JLabel errorLabel = new JLabel();
	Usuario user = new Usuario();

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
		txtUsername = new JTextField();
		txtUsername.setBounds(260, 70, 120, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(260, 115, 120, 20);
		contentPane.add(txtPassword);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(120, 70, 80, 20);
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(120, 115, 80, 20);
		contentPane.add(lblPassword);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblLogin.setBounds(120, 165, 260, 25);
		contentPane.add(lblLogin);

		lblLogin.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {
				lblLogin.setBorder(BorderFactory.createLineBorder(Color.white, 1));

			}

			public void mouseEntered(MouseEvent e) {
				lblLogin.setBorder(BorderFactory.createLineBorder(Color.green, 1));
				lblLogin.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

			}

			public void mouseClicked(MouseEvent e) {

				if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
					errorLabel.setText("* Mandatory Fields Missing!");

				} else {
					errorLabel.setText(null);

					if (newUser.userMap.containsKey(txtUsername.getText())) {
						if (newUser.userMap.get(txtUsername.getText()).getPassword().equals(txtPassword.getText())) {
							new Vision().setVisible(true);
							dispose();
						} else {
							errorLabel.setText("Wrong Username/Password");
						}

					} else {
						errorLabel.setText("Wrong Username/Password");
					}

				}

			}
		});

		JLabel hyperlink = new JLabel("SIGN IN");
		hyperlink.setHorizontalAlignment(SwingConstants.CENTER);
		hyperlink.setForeground(Color.WHITE);
		hyperlink.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		hyperlink.setBounds(120, 210, 260, 25);
		getContentPane().add(hyperlink);
		hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		hyperlink.setFont(new Font("SansSerif", Font.BOLD, 18));

		hyperlink.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				dispose();
				userpage.setVisible(true);

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseReleased(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {
				hyperlink.setBorder(BorderFactory.createLineBorder(Color.green, 1));

			}

			public void mouseExited(MouseEvent e) {
				hyperlink.setBorder(BorderFactory.createLineBorder(Color.white, 1));
				hyperlink.setForeground(Color.white);

			}
		});

		JLabel logoLabel = new JLabel();
		logoLabel.setIcon(new ImageIcon("img/logo.png"));

		logoLabel.setHorizontalAlignment(JLabel.CENTER);
		logoLabel.setVerticalAlignment(JLabel.CENTER);

		logoLabel.setBounds(10, 11, 90, 90);
		contentPane.add(logoLabel);

		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		errorLabel.setForeground(Color.RED);
		errorLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		errorLabel.setBounds(120, 250, 260, 20);
		contentPane.add(errorLabel);

		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1.setBounds(390, 65, 20, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(390, 110, 20, 20);
		contentPane.add(lblNewLabel_1_1);

	}

	public static void main(String[] args) {

		App loginpage = new App();
		loginpage.setVisible(true);

	}

}
