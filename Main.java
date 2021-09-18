import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame{

	JPanel northPanel, centerPanel, southPanel;
	void components() {
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		northPanel.setBackground(Color.CYAN);
		centerPanel.setBackground(Color.GRAY);
		southPanel.setBackground(Color.BLUE);
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		north();
		center();
		south();
	}
	
	JLabel lblTitle;
	void north() {
		lblTitle = new JLabel("Login");
		northPanel.add(lblTitle);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
	}
	
	JLabel lblEmail, lblPassword;
	JTextField txtEmail;
	JPasswordField txtPassword;
	void center() {
		lblEmail = new JLabel("Email");
		lblPassword = new JLabel("Password");
		txtEmail = new JTextField();
		txtPassword = new JPasswordField();
		
		centerPanel.setLayout(new GridLayout(2, 2, 30, 30));
		centerPanel.add(lblEmail);
		centerPanel.add(txtEmail);
		centerPanel.add(lblPassword);
		centerPanel.add(txtPassword);
	}
	
	JButton btnLogin, btnRegister;
	void south() {
		southPanel.setLayout(new FlowLayout());
		btnLogin = new JButton("Login");
		btnRegister = new JButton("Register");
		southPanel.add(btnLogin);
		southPanel.add(btnRegister);
	}
	
	public Main() {
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		components();
		
		setSize(500, 300);
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main();
	}

}
