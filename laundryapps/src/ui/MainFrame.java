package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setBounds(33, 34, 153, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PESANAN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(33, 111, 125, 79);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LAYANAN");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(250, 111, 125, 79);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PELANGGAN");
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(463, 111, 125, 79);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PENGGUNA");
		btnNewButton_3.setBackground(new Color(0, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(33, 211, 125, 79);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LAPORAN");
		btnNewButton_4.setBackground(new Color(0, 255, 255));
		btnNewButton_4.setBounds(250, 211, 125, 79);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PROFILE");
		btnNewButton_5.setBackground(new Color(0, 255, 255));
		btnNewButton_5.setBounds(463, 211, 125, 79);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("KELUAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBackground(new Color(192, 192, 192));
		btnNewButton_6.setBounds(33, 325, 555, 34);
		contentPane.add(btnNewButton_6);
	}

}
