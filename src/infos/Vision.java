package infos;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class Vision extends JFrame{

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vision frame = new Vision();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Vision() {
		setTitle("VISOIN");
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.BLACK);
		setBounds(100, 100, 510, 320);
		setLocationRelativeTo(null);
		setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(200, 126, 46, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea visionText = new JTextArea();
		visionText.setTabSize(15);
		visionText.setWrapStyleWord(true);
		visionText.setColumns(10);
		visionText.setRows(10);
		visionText.setEditable(false);
		visionText.setFont(new Font("SansSerif", Font.PLAIN, 16));
		visionText.setForeground(Color.white);
		visionText.setLineWrap(true);
		visionText.setBackground(Color.black);
		visionText.setText("O mundo automotivo é um ramo onde existem pessoas desleais e que sempre buscam tirar vantagem do próximo. Desde de simples revisões até em batidas de carros, então, quando criamos a SkyWay ela tem como propósito deixar seu cliente confortável e seguro com as coisas que ele está pagando e sabendo que seu dinheiro não está sendo gasto sem um propósito.");
		visionText.setBounds(22, 60, 450, 150);
		contentPane.add(visionText);
		
		JLabel lblVision = new JLabel("VISION");
		lblVision.setHorizontalAlignment(SwingConstants.CENTER);
		lblVision.setForeground(Color.GREEN);
		lblVision.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblVision.setBounds(200, 20, 100, 25);
		contentPane.add(lblVision);
		
		JLabel backLabel = new JLabel("< BACK");
		backLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backLabel.setForeground(Color.GREEN);
		backLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		backLabel.setBounds(22, 245, 100, 25);
		contentPane.add(backLabel);
		
		JLabel valuesLabel = new JLabel("VALUES >");
		valuesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		valuesLabel.setForeground(Color.GREEN);
		valuesLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		valuesLabel.setBounds(372, 245, 100, 25);
		contentPane.add(valuesLabel);
	}

}
