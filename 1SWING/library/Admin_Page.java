package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin_Page implements ActionListener{
	JFrame frame = new JFrame("Login Page");
	
	public Admin_Page() {
		frame.setVisible(true);
		frame.setSize(300, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel l1 = new JLabel("Admin Section");
		l1.setBounds(100, 20, 150, 50);
		frame.add(l1);
		
		JButton b1 = new JButton("Add Librarian");
		b1.setBounds(70, 100, 150, 50);
		b1.addActionListener(this);
		frame.add(b1);
		
		
		JButton b2= new JButton("View Librarian");
		b2.setBounds(70, 170, 150, 50);
		b2.addActionListener(this);
		frame.add(b2);
		
		JButton b3= new JButton("Delete Librarian");
		b3.setBounds(70, 240, 150, 50);
		b3.addActionListener(this);
		frame.add(b3);
		
		JButton b4= new JButton("Logout");
		b4.setBounds(70, 310, 150, 50);
		b4.addActionListener(this);
		frame.add(b4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String check = e.getActionCommand();
		if (check=="Add Librarian") {
			new DataBase().Admin_add();
		}
		
		if (check == "View Librarian"){
			new DataBase().Admin_view();
		}
		
		if (check == "Delete Librarian"){
			new DataBase().Admin_delete();
		}
		
		if (check == "Logout"){
			frame.dispose();
			new Login_Page();
		}
	}


}


