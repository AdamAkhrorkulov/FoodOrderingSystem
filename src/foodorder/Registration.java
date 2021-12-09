package foodorder;

//import checking.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("unchecked")
class Registration extends JFrame implements ActionListener
{

	JButton cancel = new JButton("Cancel");
	JButton b1 = new JButton("Submit");

	JLabel l = new JLabel("First Name");
	JLabel l1 = new JLabel("Last Name");
	JLabel l5 = new JLabel("Email");
	JLabel l6 = new JLabel("Contact No");
	JLabel l9 = new JLabel("Address");
	JLabel l2 = new JLabel("User Name");
	JLabel l3 = new JLabel("Password");
	JLabel l4 = new JLabel("Confirm Password");

	JTextField t = new JTextField();
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	JTextField t6 = new JTextField();
	JTextField t7 = new JTextField();
	//setContentPane(new JLabel(new ImageIcon("reg.jpg")));

	public Registration()
	{
		setSize(600,600);
		setVisible(true);
		setLayout(null);
//		setContentPane(new JLabel(new ImageIcon("reg.jpg")));

		l.setBounds(55,80,100,25);
		add(l);

		l1.setBounds(55,120,100,25);
		add(l1);

		l2.setBounds(55,160,100,25);
		add(l2);

		l3.setBounds(55,200,100,25);
		add(l3);

		l4.setBounds(55,240,150,25);
		add(l4);

		l9.setBounds(55,280,100,25);
		add(l9);

		l5.setBounds(55,320,100,25);
		add(l5);

		l6.setBounds(55,360,100,25);
		add(l6);

		t.setBounds(250,80,200,23);
		add(t);

		t1.setBounds(250,120,200,23);
		add(t1);

		t2.setBounds(250,160,200,23);
		add(t2);

		t3.setBounds(250,200,200,23);
		add(t3);

		t4.setBounds(250,240,200,23);
		add(t4);

		t7.setBounds(250,280,200,23);
		add(t7);

		t5.setBounds(250,320,200,23);
		add(t5);

		t6.setBounds(250,360,200,23);
		add(t6);


		cancel.setBounds(200,480,100,30);
//		b.setIcon(new ImageIcon("cancel.png"));
		add(cancel);

		b1.setBounds(350,480,100,30);
//		b1.setIcon(new ImageIcon("submit.png"));
		add(b1);

		cancel.addActionListener(this);
		b1.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);


	}

	String first,last,user,pass,mail,address,contact;
	String confirmPass;

	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == cancel)
		{
			this.setVisible(false);
			Login login = new Login();
		}
		else
		{
			first = t.getText();
			last = t1.getText();
			user = t2.getText();
			pass = t3.getText();
			confirmPass = t4.getText();
			address = t7.getText();
			mail = t5.getText();
			contact = t6.getText();

			if(first.equals("") || last.equals("") || user.equals("") || pass.equals("") || confirmPass.equals("") || address.equals("") || mail.equals("") || contact.equals(""))
			{
				TextFieldEmpty t = new TextFieldEmpty();
			}
			else
			{
				if(pass.equals(confirmPass))
				{
//					RegistrationConfirmedScreen m = new RegistrationConfirmedScreen();
					Order o = new Order();
					this.setVisible(false);
				}
				else
				{
					PasswordNotMatchScreen p = new PasswordNotMatchScreen();
				}
			}
		}
	}
}