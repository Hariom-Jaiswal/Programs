package registrationForm;

import javax.swing.*;
import java.awt.*;

public class Regi_Page {
	
	JFrame frame = new JFrame();
	
	public Regi_Page() {
		frame.setTitle("User Registration Form");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(400, 600);
		frame.getContentPane().setBackground(Color.white);
		
		JLabel title = new JLabel("Registration Form");
		title.setBounds(150, 10, 150, 15);
		frame.add(title);
		
		JLabel name = new JLabel("Name");
		name.setBounds(50, 50, 50, 15);
		frame.add(name);
		
		JTextField nameU = new JTextField();
		nameU.setBounds(200, 50, 150, 20);
		frame.add(nameU);
		
		JLabel fatherName = new JLabel("Father Name");
		fatherName.setBounds(50, 100, 150, 15);
		frame.add(fatherName);
		
		JTextField nameF = new JTextField();
		nameF.setBounds(200, 100, 150, 20);
		frame.add(nameF);
		
		JLabel age = new JLabel("Age");
		age.setBounds(50, 150, 150, 15);
		frame.add(age);
		
		JTextField ageT = new JTextField();
		ageT.setBounds(200, 150, 150, 20);
		frame.add(ageT);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(50, 200, 150, 15);
		frame.add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(200, 200, 60, 20);
		frame.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(270, 200, 150, 20);
		frame.add(female);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(male);
		grp.add(female);
		
		JLabel course = new JLabel("Course");
		course.setBounds(50, 250, 150, 15);
		frame.add(course);
		
		JTextField courseT = new JTextField();
		courseT.setBounds(200, 250, 150, 20);
		frame.add(courseT);
		
		JLabel hobbies = new JLabel("Hobbies");
		hobbies.setBounds(50, 300, 150, 15);
		frame.add(hobbies);
		
		JPanel p1 = new JPanel();
		p1.setBounds(200, 280, 150, 80);
		JCheckBox drawing = new JCheckBox("Drawing");
		p1.add(drawing);
		
		JCheckBox singing = new JCheckBox("Singing");
		p1.add(singing);
		
		JCheckBox music = new JCheckBox("Music");
		p1.add(music);
		
		JCheckBox others = new JCheckBox("Others");
		p1.add(others);
		
		frame.add(p1);
		
		JLabel address = new JLabel("Address");
		address.setBounds(50, 360, 150, 15);
		frame.add(address);
		
		JTextArea addressT = new JTextArea();
		addressT.setBounds(200, 360, 150, 50);
		frame.add(addressT);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(120, 450, 130, 30);
		frame.add(submit);
		
	}
	public static void main(String[] args) {
		new Regi_Page();
	}

}
