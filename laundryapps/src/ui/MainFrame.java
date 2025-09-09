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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setBounds(33, 34, 153, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PESANAN");
		btnNewButton.setBounds(33, 89, 98, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LAYANAN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(171, 89, 98, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PELANGGAN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(307, 89, 98, 61);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PENGGUNA");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(33, 161, 98, 61);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LAPORAN");
		btnNewButton_4.setBounds(171, 161, 98, 61);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PROFILE");
		btnNewButton_5.setBounds(307, 161, 98, 61);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("KELUAR");
		btnNewButton_6.setBounds(33, 229, 372, 34);
		contentPane.add(btnNewButton_6);
	}

}
