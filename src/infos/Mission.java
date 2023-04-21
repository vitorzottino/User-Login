package infos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import login.App;

public class Mission extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mission frame = new Mission();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Mission() {
		setTitle("MISSION");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 320);
		setBackground(Color.black);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel missionHeader = new JLabel("MISSION");
		missionHeader.setHorizontalAlignment(SwingConstants.CENTER);
		missionHeader.setForeground(Color.GREEN);
		missionHeader.setFont(new Font("SansSerif", Font.BOLD, 18));
		missionHeader.setBounds(190, 20, 100, 25);
		contentPane.add(missionHeader);

		JTextArea missionText = new JTextArea();
		missionText.setWrapStyleWord(true);
		missionText.setText(
				"Comprando nossos automóveis a vista, nós oferecemos um jogo de pneus grátis e higienização do veículo com produtos de primeiro escalão mundial. Tentamos deixar o cliente o mais à vontade possível, pois, ele é a nossa prioridade aqui na SkyWay.");
		missionText.setTabSize(15);
		missionText.setRows(20);
		missionText.setLineWrap(true);
		missionText.setForeground(Color.WHITE);
		missionText.setFont(new Font("SansSerif", Font.PLAIN, 16));
		missionText.setEditable(false);
		missionText.setColumns(10);
		missionText.setBackground(Color.BLACK);
		missionText.setBounds(10, 80, 474, 150);
		contentPane.add(missionText);

		JLabel valuesLabel = new JLabel("< VALUES ");
		valuesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		valuesLabel.setForeground(Color.GREEN);
		valuesLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		valuesLabel.setBounds(22, 245, 100, 25);
		contentPane.add(valuesLabel);
		valuesLabel.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {
				new Values().setVisible(true);
				dispose();

			}
		});

		JLabel backLabel = new JLabel("BACK >");
		backLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backLabel.setForeground(Color.GREEN);
		backLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		backLabel.setBounds(385, 245, 100, 25);
		contentPane.add(backLabel);
		backLabel.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {
				new App().setVisible(true);
				dispose();

			}
		});

	}
}
