package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Library_Page implements ActionListener{
	JFrame frame = new JFrame("Login Page");
	
	public Library_Page() {
		frame.setVisible(true);
		frame.setSize(300, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel l1 = new JLabel("Library Section");
		l1.setBounds(100, 20, 150, 50);;
		frame.add(l1);
		
		JButton b1 = new JButton("Add Books");
		b1.setBounds(70, 100, 150, 50);
		b1.addActionListener(this);
		frame.add(b1);
		
		JButton b2= new JButton("View Books");
		b2.setBounds(70, 170, 150, 50);
		b2.addActionListener(this);
		frame.add(b2);
		
		JButton b3= new JButton("Issue Books");
		b3.setBounds(70, 240, 150, 50);
		b3.addActionListener(this);
		frame.add(b3);
		
		JButton b4= new JButton("View Issued Books");
		b4.setBounds(70, 310, 150, 50);
		b4.addActionListener(this);
		frame.add(b4);
		
		JButton b5= new JButton("Return Book");
		b5.setBounds(70, 380, 150, 50);
		b5.addActionListener(this);
		frame.add(b5);
		
		JButton b6= new JButton("Logout");
		b6.setBounds(70, 450, 150, 50);
		b6.addActionListener(this);
		frame.add(b6);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String check = e.getActionCommand();
		if (check=="Add Books") {
			new DataBase().addBooks();
		}
		
		if (check == "View Books"){
			new DataBase().viewBooks();
		}
		
		if (check == "Issue Books"){
			new DataBase().issueBooks();
		}
		
		if (check == "View Issued Books"){
			new DataBase().viewIssued();
		}
		
		if (check == "Return Book"){
			new DataBase().returnBooks();
		}
		
		if (check == "Logout"){
			frame.dispose();
			new Login_Page();
		}
	}

}


