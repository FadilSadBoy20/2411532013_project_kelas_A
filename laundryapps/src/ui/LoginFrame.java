package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(40, 13, 131, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Males nyuci? Biar kami aja cuciin ");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(40, 33, 186, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(40, 68, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(40, 84, 350, 40);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(40, 146, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(40, 163, 350, 40);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(User.login(txtUsername.getText(), txtPassword.getText())) {
					new MainFrame().setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null,  "Login Gagal");
				}
			}
		});
		
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBounds(40, 214, 350, 43);
		contentPane.add(btnLogin);
	}
}
