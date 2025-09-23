package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class UserFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTable tableUsers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(229, 229, 229));
		panel.setBounds(10, 10, 625, 238);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(36, 45, 49, 14);
		panel.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(113, 42, 471, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(113, 85, 471, 20);
		panel.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(113, 127, 471, 20);
		panel.add(txtPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(36, 88, 90, 14);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(36, 130, 79, 14);
		panel.add(lblPassword);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(0, 255, 0));
		btnSave.setBounds(113, 181, 89, 23);
		panel.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 255, 0));
		btnCancel.setBounds(495, 181, 89, 23);
		panel.add(btnCancel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setBounds(372, 181, 89, 23);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(0, 0, 255));
		btnUpdate.setBounds(244, 181, 89, 23);
		panel.add(btnUpdate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(229, 229, 229));
		panel_1.setBounds(10, 269, 625, 346);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		tableUsers = new JTable();
		tableUsers.setBounds(10, 11, 605, 324);
		panel_1.add(tableUsers);
	}

}
