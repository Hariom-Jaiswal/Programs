package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_Page implements ActionListener{
	
	JFrame frame = new JFrame("Login Page");
	
	public Login_Page() {
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel l1 = new JLabel("Library Management");
		l1.setBounds(85, 20, 150, 50);
		frame.add(l1);
		
		JButton b1 = new JButton("Admin Login");
		b1.setBounds(70, 100, 150, 50);
		b1.addActionListener(this);
		frame.add(b1);
		
		JButton b2= new JButton("Library Login");
		b2.setBounds(70, 170, 150, 50);
		b2.addActionListener(this);
		frame.add(b2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String check = e.getActionCommand();
		if (check=="Admin Login") {
			frame.dispose();
			new Admin_Page();
		}
		
		if (check == "Library Login"){
			frame.dispose();
			new Library_Page();
		}
	}

	public static void main(String[] args) {
		new Login_Page();
	}
}
