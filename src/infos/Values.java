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

public class Values extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Values frame = new Values();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Values() {
		setTitle("VALUES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 320);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea visionText = new JTextArea();
		visionText.setWrapStyleWord(true);
		visionText.setBounds(22, 60, 450, 150);
		visionText.setText(
				"Aqui na SkyWay nós transformamos a experiência do consumidor desde na hora de comprar seu carro até o pós-venda, nosso principal conceito é oferecer um atendimento que o cliente tenha certeza que aqui na SkyWay é o melhor lugar para comprar seu próximo automóvel.");
		visionText.setTabSize(15);
		visionText.setRows(20);
		visionText.setLineWrap(true);
		visionText.setForeground(Color.WHITE);
		visionText.setFont(new Font("SansSerif", Font.PLAIN, 16));
		visionText.setEditable(false);
		visionText.setColumns(10);
		visionText.setBackground(Color.BLACK);

		contentPane.add(visionText);

		JLabel valuesLabel = new JLabel("VALUES");
		valuesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		valuesLabel.setForeground(Color.GREEN);
		valuesLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		valuesLabel.setBounds(190, 20, 100, 25);
		contentPane.add(valuesLabel);

		JLabel visionLabel = new JLabel("< VISON");
		visionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		visionLabel.setForeground(Color.GREEN);
		visionLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		visionLabel.setBounds(22, 245, 100, 25);
		contentPane.add(visionLabel);
		visionLabel.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {
				new Vision().setVisible(true);
				dispose();

			}
		});

		JLabel missionLabel = new JLabel("MISSION >");
		missionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		missionLabel.setForeground(Color.GREEN);
		missionLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		missionLabel.setBounds(372, 245, 100, 25);
		contentPane.add(missionLabel);
		missionLabel.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {

			}

			public void mousePressed(MouseEvent e) {

			}

			public void mouseExited(MouseEvent e) {

			}

			public void mouseEntered(MouseEvent e) {

			}

			public void mouseClicked(MouseEvent e) {
				new Mission().setVisible(true);
				dispose();

			}
		});
	}

}
