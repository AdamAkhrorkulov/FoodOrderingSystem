package foodorder;

import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
	JButton b = new JButton("Login");
	JButton b1 = new JButton("Register");
	JLabel l = new JLabel("Username");
	JLabel l1 = new JLabel("Password");
	JTextField f = new JTextField();
	JTextField f1 = new JTextField();
	int flag = 0;

	
	public Login() {

		setSize(600,600);
		setVisible(true);
		setLayout(null);
		setContentPane(new JLabel());
		
		b.setBounds(400,350,100,40);
		add(b);
		
		b1.setBounds(200,350,170,40);

		add(b1);
		
		l.setBounds(100,150,100,20);
		add(l);
		
		l1.setBounds(100,250,100,20);
		add(l1);
		
		f.setBounds(250,150,200,25);
		add(f);
		
		f1.setBounds(250,250,200,25);
		add(f1);
		
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	
	String userName,password;
	String first,last,mail,address,contact,gender;
	
	public void actionPerformed(ActionEvent a)
	{	
		if(a.getSource() == b)
		{
			userName = f. getText();
		    password = f1.getText();
			
			if(!userName.equals("") && !password.equals(""))
			{

			if(flag == 0)
			{
				LoginFailedScreen n = new LoginFailedScreen();
			}
			else
			{
				this.setVisible(false);
				MemberPanel b = new MemberPanel(this);
			}
			
			}
			else
			{
				TextFieldEmpty t = new TextFieldEmpty();
			}
		}
		else
		{
			this.setVisible(false);
			Registration r = new Registration();
		}
	}
}