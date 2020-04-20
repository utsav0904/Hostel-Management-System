import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import java.sql.*;

public class Home{
	static Homepanel h1;
	public static void main(String []args){
		aa();
	}
	public static void aa(){
		h1=new Homepanel("Hostel Management System");
	}

}

class StudentLogin{
	static Applypanel ap;
	public static void loadApply(){
		ap=new Applypanel("Hostel Management System");
	}
}

class AdminLogin{
	static Adminpanel ad;
	public static void loadAdmin(){
		ad=new Adminpanel("Hostel Management System");
	}
}


class Toppanel extends JPanel{
	JLabel l1;
	Font f;
	Toppanel(){
		setBounds(0,0,1350,130);
		setBackground(new Color(200,200,150));
		setLayout(null);
		f=new Font("Copperplate Gothic Bold",Font.BOLD,40);
		ImageIcon icon=new ImageIcon("resources/MSU.png");
        l1=new JLabel("HOSTEL MANAGEMENT SYSTEM",icon,JLabel.LEFT);
        l1.setFont(f);
		l1.setForeground(Color.BLACK);
		l1.setBounds(150,0,1350,130);
		add(l1);
	}
	
}

class Leftpanel extends JPanel{
	JLabel l2;
	Font f,f1;
	JTextArea t1;
	Leftpanel(){
		setBounds(0,130,350,550);
		setBackground(new Color(102,102,0));
		setLayout(null);
		f1=new Font("Tahoma",Font.BOLD,11);
		f=new Font("Tahoma",Font.PLAIN,18);
		l2=new JLabel("NEWS");
		
		l2.setFont(f);
		l2.setForeground(new Color(255,255,255));
		l2.setBounds(20,5,100,50);
		add(l2);
		
		t1=new JTextArea("\n->  HOSTEL ADDMISSION PROCESS WILL START \n FROM 05/04/2018.\n\n ->  ADDMISSION PROCESS LAST DATE IS 05/05/2018."
				+ "\n\n->  ADDMISSION RENEW WILL BE START AT \n 11/04/2018.\n"
				+"\n->  FEES PAYMENT LAST DATE IS 15/05/2018.\n"
				+"\n->  FIRST YOUR ADDMISSION DONE IN YOUR \n ACADMIC SECTION THEN YOU CAN APPLY FOR \n HOSTEL ADDMISSION.\n"
				+"\n->  ADDMISSION WILL ANNOUNCE AT 25/05/2018."
				+"\n\n->  AFTER YOR GET ADDMISSION TAKE YOUR ID\n PROOF FROM MAIN OFFICE.");
		t1.setBounds(20,55,310,440);
		t1.setForeground(Color.GRAY);
		t1.setFont(f1);
		add(t1);
	}
}


class TopRightpanel extends JPanel{
     JButton home;
     JButton complaint;
     JButton aboutus;
     JButton admin;
     Font f;
	TopRightpanel(){
		setBounds(350,130,1000,55);
		setBackground(new Color(102,102,0));
		setLayout(null);
		
		f=new Font("Tahoma",Font.BOLD,16);
		
		home=new JButton("HOME");
		home.setBounds(8,8,150,39);
		home.setForeground(Color.WHITE);
		home.setBackground(new Color(0,102,102));
		home.setFont(f);
		
		complaint=new JButton("COMPLAINT");
		complaint.setBounds(166,8,150,39);
		complaint.setForeground(Color.WHITE);
		complaint.setBackground(new Color(0,102,102));
		complaint.setFont(f);
		
		aboutus=new JButton("ABOUT US");
		aboutus.setBounds(322,8,150,39);
		aboutus.setForeground(Color.WHITE);
		aboutus.setBackground(new Color(0,102,102));
		aboutus.setFont(f);
		
		admin=new JButton("ADMIN LOGIN");
		admin.setBounds(800,8,150,39);
		admin.setForeground(Color.WHITE);
		admin.setBackground(new Color(0,102,102));
		admin.setFont(f);
		
		
		add(home);
		add(complaint);
		add(aboutus);
		add(admin);
	}
}

class HomeButtonpanel extends JPanel{
	JButton registration;
	JButton login;
	Font f;
	HomeButtonpanel()
	{
		setBackground(new Color(200,200,150));
		setLayout(null);
		
		f=new Font("Tahoma",Font.BOLD,16);
		
		registration=new JButton("REGISTRATION");
		login=new JButton("LOGIN");
		registration.setBackground(new Color(0,102,102));
		login.setBackground(new Color(0,102,102));
		
		registration.setBounds(400,172,200,50);
		login.setBounds(400,262,200,50);
		
		registration.setForeground(Color.WHITE);
		login.setForeground(Color.WHITE);
		
		registration.setFont(f);
		login.setFont(f);
		
		add(registration);
		add(login);
	}
}


class ComplaintButtonpanel extends JPanel implements ActionListener{
	
	JLabel jl,jl1,jl2,l1,l2;
	JTextField jt,jt1;
	JTextArea ja;
	JButton send;
	
	ComplaintButtonpanel(){
		
		setBackground(new Color(200,200,150));
		setLayout(null);
		
		Font jf=new Font("Arial",Font.BOLD,18);
		
		jl=new JLabel("Subject");
		jl.setBounds(100,35,100,50);
		jl.setFont(jf);
		add(jl);
		
		jt =new JTextField(60);
		jt.setBounds(230,40,500,40);
		add(jt);
		
		jl1=new JLabel("Description");
		jl1.setBounds(100,85,100,100);
		jl1.setFont(jf);
		add(jl1);
		
		ja=new JTextArea(27,27);
		ja.setBounds(230,120,500,190);
		add(ja);
		
		send=new JButton("SEND");
		send.setForeground(Color.WHITE);
		send.setBackground(new Color(0,102,102));
		
		jl2=new JLabel("Contact Info.");
		jl2.setFont(jf);
		jl2.setBounds(100,345,500,40);
		add(jl2);
		
		jt1=new JTextField(10);
		jt1.setBounds(230,350,500,40);
		add(jt1);
		
		send.setBounds(400,420,160,40);
		send.setFont(jf);
		add(send);
		
		send.addActionListener(this);
		
		l1=new JLabel("*");
		l1.setBounds(735,40,100,40);
		l1.setFont(new Font("Tahoma",Font.BOLD,15));
		l1.setForeground(Color.RED);
		
		l2=new JLabel("*");
		l2.setBounds(735,120,100,40);
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setForeground(Color.RED);
		
		add(l1);
		add(l2);
		
		l1.setVisible(false);
		l2.setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		String title,disc,num;
		String s=e.getActionCommand();
		title=jt.getText();
		disc=ja.getText();
		num=jt1.getText();
		if(s.equalsIgnoreCase("Send")){
			
		if(!title.equals("") && !disc.equals("")){
		
			Databaseconnection.complainDataBase(title,disc,num);
			
	
			jt.setText("");
			ja.setText("");
			jt1.setText("");
			JOptionPane.showMessageDialog(null,"Complaint is register");
			
			
			l1.setVisible(false);
			l2.setVisible(false);
			
		}
		else{
			if(title.equals("")){
				l1.setVisible(true);
			}	
			else{
				l1.setVisible(false);
			}	
				
			if(disc.equals("")){
				l2.setVisible(true);
			}	
			else{
				l2.setVisible(false);
			}	
		}
		}
	}
}

class AboutusButtonpanel extends JPanel{
	
	
	AboutusButtonpanel(){
		
		setBackground(new Color(200,200,150));
		setLayout(null);
		
		ImageIcon img1=new ImageIcon("resources/mehul.jpg");
		
		JLabel mehul=new JLabel(img1);
		mehul.setBounds(55,80,200,250);
		add(mehul);
		
		ImageIcon img2=new ImageIcon("resources/vishal.jpg");
		
		JLabel jimg2=new JLabel(img2);
		jimg2.setBounds(280,80,200,250);
		add(jimg2);
		
		ImageIcon img3=new ImageIcon("resources/utsav.jpg");
		
		JLabel jimg3=new JLabel(img3);
		jimg3.setBounds(505,80,200,250);
		add(jimg3);
		
		ImageIcon img4=new ImageIcon("resources/prashant1.jpg");
		
		JLabel jimg4=new JLabel(img4);
		jimg4.setBounds(730,80,200,250);
		add(jimg4);
		
		JLabel name1=new JLabel("Mehul  Padasala");
		
		name1.setBounds(80,335,200,50);
		name1.setForeground(Color.BLACK);
		
		Font namef=new Font("Tahoma",Font.BOLD,18);
		Font f=new Font("Tahoma",Font.BOLD,24);
		
		name1.setFont(namef);
		add(name1);
		
		JLabel name2=new JLabel("Vishal Dhameliya");
		name2.setBounds(305,335,200,50);
		name2.setForeground(Color.BLACK);
		name2.setFont(namef);
		add(name2);
		
		JLabel name3=new JLabel("Utsav Acharya");
		name3.setBounds(538,335,200,50);
		name3.setForeground(Color.BLACK);
		name3.setFont(namef);
		add(name3);
		
		JLabel name4=new JLabel("Prashant Alagiya");
		name4.setBounds(755,335,200,50);
		name4.setForeground(Color.BLACK);
		name4.setFont(namef);
		add(name4);
		
		JLabel name5=new JLabel("OUR TEAM");
		name5.setBounds(420,20,200,50);
		name5.setForeground(Color.BLACK);
		name5.setFont(f);
		add(name5);
		
	}
}

class Adminbuttonpanel extends JPanel implements ActionListener{
	
	JLabel l1,l2,u1,u2,p1,p2;
	Font f;
	JTextField t1;
	JPasswordField t2;
	JButton adminfinal;
	
	Adminbuttonpanel(){
		
	    setBounds(350,185,1000,495);
		setBackground(new Color(200,200,150));
		setLayout(null);
		
		f=new Font("Tahoma",Font.PLAIN,18);
		l1=new JLabel("USERNAME");
		l1.setFont(f);
		l1.setBounds(250,100,150,50);
		l1.setForeground(Color.black);
		
		l2=new JLabel("PASSWORD");
		l2.setFont(f);
		l2.setBounds(250,200,150,50);
		l2.setForeground(Color.black);
		
		add(l1);
		add(l2);
		
		t1=new JTextField();
		t1.setBounds(400,100,200,40);
		add(t1);
		
		t2=new JPasswordField();
		t2.setBounds(400,200,200,40);
		add(t2);
		
		adminfinal=new JButton("LOGIN");
		adminfinal.setBounds(350,300,120,35);
		adminfinal.setForeground(Color.WHITE);
		adminfinal.setBackground(new Color(0,102,102));
		adminfinal.setFont(f);
		add(adminfinal);
		
		adminfinal.addActionListener(this);
		
		u1=new JLabel("Enter valid username");
		u1.setBounds(610,100,280,40);
		u1.setFont(new Font("Tahoma",Font.ITALIC,13));
		u1.setForeground(Color.RED);
		
		u2=new JLabel("*");
		u2.setBounds(610,100,100,40);
		u2.setFont(new Font("Tahoma",Font.BOLD,15));
		u2.setForeground(Color.RED);
		
		p1=new JLabel("Enter valid password");
		p1.setBounds(610,200,280,40);
		p1.setFont(new Font("Tahoma",Font.ITALIC,13));
		p1.setForeground(Color.RED);
		
		p2=new JLabel("*");
		p2.setBounds(610,200,100,40);
		p2.setFont(new Font("Tahoma",Font.BOLD,15));
		p2.setForeground(Color.RED);
		
		add(u1);
		add(u2);
		add(p1);
		add(p2);
		
		u1.setVisible(false);
		u2.setVisible(false);
		p1.setVisible(false);
		p2.setVisible(false);
	
	}
	
	public void actionPerformed(ActionEvent e){
		
			String uname,pname;
			
			uname=t1.getText();
			pname=t2.getText();
			
			String userp="[6789][0-9]{9}";
			String passp="((?=.*[a-zA-A])(?=.*[0-9])(?=.*[@#$%_]).{5,15})";
			
			if(Pattern.matches(userp,uname) && Pattern.matches(passp,pname)){
				t1.setText("");
				t2.setText("");
				
				u1.setVisible(false);
				u2.setVisible(false);
				p1.setVisible(false);
				p2.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from adminregistration  where username='"+uname+"'and password='"+pname+"'");
					
					
					if(rs.next()){
						Home.h1.dispose();
						AdminLogin.loadAdmin();
						System.out.println("Login Sucessfully");
					}
					else{
						JOptionPane.showMessageDialog(null,"Enter valid username or password");
					}
					
					con.close();
					st.close();
					rs.close();
					
				}
				catch(Exception e1){
					e1.printStackTrace();
					System.out.println(e1.getMessage());	
				}
				
			}
			else{
				if(Pattern.matches(userp,uname)){
					u1.setVisible(false);
					u2.setVisible(false);
				}
				else if(uname.equals("")){
					u1.setVisible(false);
					u2.setVisible(true);
				}	
				else{
					u2.setVisible(false);
					u1.setVisible(true);
					t1.setText("");
				}	
					
				if(Pattern.matches(passp,pname)){
					p1.setVisible(false);
					p2.setVisible(false);
				}
				else if(pname.equals("")){
					p1.setVisible(false);
					p2.setVisible(true);
				}	
				else{
					p2.setVisible(false);
					p1.setVisible(true);
					t2.setText("");
				}	
			}
	}
}


class Loginbuttonpanel extends JPanel implements ActionListener{
	
	JLabel l1,l2,u1,u2,p1,p2;
	Font f;
	JTextField username;
	JPasswordField password;
	JButton loginfinal;
	Loginbuttonpanel(){
		
	    setBounds(350,185,1000,495);
		setBackground(new Color(200,200,150));
		setLayout(null);
		
		f=new Font("Tahoma",Font.PLAIN,18);
		l1=new JLabel("USERNAME");
		l1.setFont(f);
		l1.setBounds(250,100,150,50);
		l1.setForeground(Color.black);
		
		l2=new JLabel("PASSWORD");
		l2.setFont(f);
		l2.setBounds(250,200,150,50);
		l2.setForeground(Color.black);
		
		add(l1);
		add(l2);
		
		username=new JTextField();
		username.setBounds(400,100,200,40);
		add(username);
		
		password=new JPasswordField();
		password.setBounds(400,200,200,40);
		add(password);
		
		loginfinal=new JButton("LOGIN");
		loginfinal.setBounds(350,300,120,35);
		loginfinal.setForeground(Color.WHITE);
		loginfinal.setBackground(new Color(0,102,102));
		loginfinal.setFont(f);
		add(loginfinal);
		
		loginfinal.addActionListener(this);
		
		u1=new JLabel("Enter valid username");
		u1.setBounds(610,100,280,40);
		u1.setFont(new Font("Tahoma",Font.ITALIC,13));
		u1.setForeground(Color.RED);
		
		u2=new JLabel("*");
		u2.setBounds(610,100,100,40);
		u2.setFont(new Font("Tahoma",Font.BOLD,15));
		u2.setForeground(Color.RED);
		
		p1=new JLabel("Enter valid password");
		p1.setBounds(610,200,280,40);
		p1.setFont(new Font("Tahoma",Font.ITALIC,13));
		p1.setForeground(Color.RED);
		
		p2=new JLabel("*");
		p2.setBounds(610,200,100,40);
		p2.setFont(new Font("Tahoma",Font.BOLD,15));
		p2.setForeground(Color.RED);
		
		add(u1);
		add(u2);
		add(p1);
		add(p2);
		
		u1.setVisible(false);
		u2.setVisible(false);
		p1.setVisible(false);
		p2.setVisible(false);
	
	}
	
	public void actionPerformed(ActionEvent e){
		
			String uname,pname;
			
			uname=username.getText();
			pname=password.getText();
			
			String userp="[6789][0-9]{9}";
			String passp="((?=.*[a-zA-A])(?=.*[0-9])(?=.*[@#$%_]).{5,15})";
			
			
			
			if(Pattern.matches(userp,uname) && Pattern.matches(passp,pname)){
				username.setText("");
				password.setText("");
				
				u1.setVisible(false);
				u2.setVisible(false);
				p1.setVisible(false);
				p2.setVisible(false);
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from studentregistration  where mbno='"+uname+"'and pass='"+pname+"'");
					
					
					if(rs.next()){
						Home.h1.dispose();
						StudentLogin.loadApply();
						System.out.println("Login Sucessfully");
					}
					else{
						JOptionPane.showMessageDialog(null,"Enter valid username or password");
					}
					
					con.close();
					st.close();
					rs.close();
					
				}
				catch(Exception e1){
					e1.printStackTrace();
					System.out.println(e1.getMessage());	
				}
				
			}
			else{
				if(Pattern.matches(userp,uname)){
					u1.setVisible(false);
					u2.setVisible(false);
				}
				else if(uname.equals("")){
					u1.setVisible(false);
					u2.setVisible(true);
				}	
				else{
					u2.setVisible(false);
					u1.setVisible(true);
					username.setText("");
				}	
					
				if(Pattern.matches(passp,pname)){
					p1.setVisible(false);
					p2.setVisible(false);
				}
				else if(pname.equals("")){
					p1.setVisible(false);
					p2.setVisible(true);
				}	
				else{
					p2.setVisible(false);
					p1.setVisible(true);
					password.setText("");
				}	
			}
		}
}

class Registrationbuttonpanel extends JPanel implements ActionListener{
	JLabel l1,l2,l3,l4;
	JLabel n1,n2,m1,m2,pa1,pa2,fp1,fp2;
	Font f;
	JTextField name,mobileno;
    JPasswordField pass,finalpass;
    JButton registrationfinal;
        
	Registrationbuttonpanel()
	{
	                setBounds(350,185,1000,495);
	                setBackground(new Color(200,200,150));
	          	    setLayout(null);

                    f=new Font("Tahoma",Font.PLAIN,18);
                     
					l1=new JLabel("NAME");
					l1.setFont(f);
					l1.setBounds(145,60,200,40);
					l1.setForeground(Color.black);
					 
					l2=new JLabel("MOBILE NUMBER");
					l2.setFont(f);
					l2.setBounds(145,135,200,40);
					l2.setForeground(Color.black);
					 
					l3=new JLabel("PASSWORD");
					l3.setFont(f);
					l3.setBounds(145,210,200,40);
					l3.setForeground(Color.black);
					 
					l4=new JLabel("CONFIRM PASSWORD");
					l4.setFont(f);
					l4.setBounds(145,285,200,40);
					l4.setForeground(Color.black);
					 
					name=new JTextField();
					name.setBounds(380,60,250,40);
								 
				 	mobileno=new JTextField();
					mobileno.setBounds(380,135,250,40);
								 
					pass=new JPasswordField();
					pass.setBounds(380,210,250,40);
								 
					finalpass=new JPasswordField();
					finalpass.setBounds(380,285,250,40);
					 
					registrationfinal=new JButton("REGISTER");
					registrationfinal.setFont(f);
					registrationfinal.setBounds(320,360,150,40);
					registrationfinal.setForeground(Color.WHITE);
					registrationfinal.setBackground(new Color(0,102,102));					 

					registrationfinal.addActionListener(this);
					 
					add(l1);
					add(l2);
					add(l3);
					add(l4);
					add(name);
					add(mobileno);
					add(pass);
					add(finalpass);
					add(registrationfinal);
						
					n1=new JLabel("Enter valid name");
					n1.setBounds(640,60,280,40);
					n1.setFont(new Font("Tahoma",Font.ITALIC,13));
					n1.setForeground(Color.RED);
						
					n2=new JLabel("*");
					n2.setBounds(640,60,100,40);
					n2.setFont(new Font("Tahoma",Font.BOLD,15));
					n2.setForeground(Color.RED);
						
					m1=new JLabel("Enter valid mobileno");
					m1.setBounds(640,135,280,40);
					m1.setFont(new Font("Tahoma",Font.ITALIC,13));
					m1.setForeground(Color.RED);
						
					m2=new JLabel("*");
					m2.setBounds(640,135,100,40);
					m2.setFont(new Font("Tahoma",Font.BOLD,15));
					m2.setForeground(Color.RED);
						
					pa1=new JLabel("Enter valid password");
					pa1.setBounds(640,210,280,40);
					pa1.setFont(new Font("Tahoma",Font.ITALIC,13));
					pa1.setForeground(Color.RED);
						
					pa2=new JLabel("*");
					pa2.setBounds(640,210,100,40);
					pa2.setFont(new Font("Tahoma",Font.BOLD,15));
					pa2.setForeground(Color.RED);
						
					fp1=new JLabel("Enter valid password");
					fp1.setBounds(640,285,280,40);
					fp1.setFont(new Font("Tahoma",Font.ITALIC,13));
					fp1.setForeground(Color.RED);
						
					fp2=new JLabel("*");
					fp2.setBounds(640,285,100,40);
					fp2.setFont(new Font("Tahoma",Font.BOLD,15));
					fp2.setForeground(Color.RED);
						
					add(n1);
					add(n2);
					add(m1);
					add(m2);
					add(pa1);
					add(pa2);
					add(fp1);
					add(fp2);
						
					n1.setVisible(false);
					n2.setVisible(false);
					m1.setVisible(false);
					m2.setVisible(false);
					pa1.setVisible(false);
					pa2.setVisible(false);
					fp1.setVisible(false);
					fp2.setVisible(false);
					
		}
	
public void actionPerformed(ActionEvent e){
		
		String name1,mno,pas,fpass;
		
		name1=name.getText();
		mno=mobileno.getText();
		pas=pass.getText();
		fpass=finalpass.getText();
		
		String mbno="[6789][0-9]{9}";
		String passp="((?=.*[a-zA-A])(?=.*[0-9])(?=.*[@#$%_]).{5,15})";
		String nam="[a-zA-Z\\s]+";
		
		if(Pattern.matches(nam,name1) && Pattern.matches(mbno,mno) &&
			Pattern.matches(passp,pas) && Pattern.matches(passp,fpass) 
			&& pas.equals(fpass)){
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
					Statement stp=con.createStatement();
					ResultSet rs=stp.executeQuery("select * from studentregistration where to_char(mbno)='"+mno+"'");
					
					if(rs.next()){
						JOptionPane.showMessageDialog(null,"Mobile Number is alreday Register");
						mobileno.setText("");
					}
					else{
						Databaseconnection.storeData(name1,mno,pas,fpass);
						
						name.setText("");
						mobileno.setText("");
						pass.setText("");
						finalpass.setText("");
						
						JOptionPane.showMessageDialog(null,"Registration Sucessfully");
					}
					con.close();
					stp.close();
					rs.close();
					
				} catch	(Exception e4) {
					e4.printStackTrace();
					System.out.println(e4.getMessage());
				}	
				
				n1.setVisible(false);
				n2.setVisible(false);
				m1.setVisible(false);
				m2.setVisible(false);
				pa1.setVisible(false);
				pa2.setVisible(false);
				fp1.setVisible(false);
				fp2.setVisible(false);
				
		}
		else{
			if(Pattern.matches(nam,name1)){
				n1.setVisible(false);
				n2.setVisible(false);
			}
			else if(name1.equals("")){
				n1.setVisible(false);
				n2.setVisible(true);
			}
			else{
				n2.setVisible(false);
				n1.setVisible(true);
				name.setText("");
			}
			
			if(Pattern.matches(mbno,mno)){
				m1.setVisible(false);
				m2.setVisible(false);
			}
			else if(mno.equals("")){
				m1.setVisible(false);
				m2.setVisible(true);
			}
			else{
				m2.setVisible(false);
				m1.setVisible(true);
				mobileno.setText("");
			}	
			
			if(Pattern.matches(passp,pas)){
				pa1.setVisible(false);
				pa2.setVisible(false);
			}
			else if(pas.equals("")){
				pa1.setVisible(false);
				pa2.setVisible(true);
			}
			else{
				pa2.setVisible(false);
				pa1.setVisible(true);
				pass.setText("");
			}
			
			if(Pattern.matches(passp,fpass) && pas.equals(fpass)){
				fp1.setVisible(false);
				fp2.setVisible(false);
			}
			else if(fpass.equals("")){
				fp1.setVisible(false);
				fp2.setVisible(true);
			}
			else if(!pas.equals(fpass)){
				fp2.setVisible(false);
				fp1.setVisible(true);
				finalpass.setText("");
			}
			else{
				fp2.setVisible(false);
				fp1.setVisible(true);
				finalpass.setText("");
			}
		}
	}
}

class Homepanel extends JFrame implements ActionListener{
	
	Toppanel t1;
	Leftpanel l1;
	TopRightpanel tr1;
	HomeButtonpanel hb;
	ComplaintButtonpanel cb;
	AboutusButtonpanel ab;
	Adminbuttonpanel ad;
	Loginbuttonpanel lb;
	Registrationbuttonpanel rgb;
	
	Homepanel(){
	}
	Homepanel(String s){
		super(s);
		setLayout(null);
		
		setSize(1350,700);
		setLocation(0,0);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon=new ImageIcon("resources/hm3.jpg");
        setIconImage(icon.getImage());
		
		t1=new Toppanel();
		add(t1);
		
		l1=new Leftpanel();
		add(l1);
		
		tr1=new TopRightpanel();
		add(tr1);
		
		tr1.home.addActionListener(this);
		tr1.complaint.addActionListener(this);
		tr1.aboutus.addActionListener(this);
		tr1.admin.addActionListener(this);
	
		hb=new HomeButtonpanel();
		hb.setBounds(350,185,1000,495);
		add(hb);
		
		lb=new Loginbuttonpanel();
		add(lb);
		
		rgb=new Registrationbuttonpanel();
		add(rgb);
		
		hb.login.addActionListener(this);
		hb.registration.addActionListener(this);
		
		cb=new ComplaintButtonpanel();
		cb.setBounds(350,185,1000,495);
		add(cb);
		cb.setBackground(new Color(200,200,150));
		
		ab=new AboutusButtonpanel();
		ab.setBounds(350,185,1000,495);
		add(ab);
		
		ad=new Adminbuttonpanel();
		add(ad);
		
		
		hb.setVisible(true);
		cb.setVisible(false);
		ab.setVisible(false);
		ad.setVisible(false);
		lb.setVisible(false);
		rgb.setVisible(false);
		
		}
	
		public void actionPerformed(ActionEvent ae){
			String s=ae.getActionCommand();
			if(s.equalsIgnoreCase("HOME")){
				hb.setVisible(true);
				cb.setVisible(false);
				ab.setVisible(false);
				ad.setVisible(false);
				lb.setVisible(false);
				rgb.setVisible(false);
				
				
				
			}
			else if(s.equalsIgnoreCase("COMPLAINT")){
				hb.setVisible(false);
				cb.setVisible(true);
				ab.setVisible(false);
				ad.setVisible(false);
				lb.setVisible(false);
				rgb.setVisible(false);
				cb.l1.setVisible(false);
				cb.l2.setVisible(false);
				
			}
			else if(s.equalsIgnoreCase("ABOUT US")){
				hb.setVisible(false);
				cb.setVisible(false);
				ab.setVisible(true);
				ad.setVisible(false);
				lb.setVisible(false);
				rgb.setVisible(false);
			}
			else if(s.equalsIgnoreCase("ADMIN LOGIN")){
				hb.setVisible(false);
				cb.setVisible(false);
				ab.setVisible(false);
				ad.setVisible(true);
				lb.setVisible(false);
				rgb.setVisible(false);
				ad.u1.setVisible(false);
				ad.u2.setVisible(false);
				ad.p1.setVisible(false);
				ad.p2.setVisible(false);
			}
			else if(s.equalsIgnoreCase("LOGIN")){
				hb.setVisible(false);
				cb.setVisible(false);
				ab.setVisible(false);
				ad.setVisible(false);
				lb.setVisible(true);
				rgb.setVisible(false);
				lb.u1.setVisible(false);
				lb.u2.setVisible(false);
				lb.p1.setVisible(false);
				lb.p2.setVisible(false);
			}
			else if(s.equalsIgnoreCase("REGISTRATION")){
				hb.setVisible(false);
				cb.setVisible(false);
				ab.setVisible(false);
				ad.setVisible(false);
				lb.setVisible(false);
				rgb.setVisible(true);	
				rgb.n1.setVisible(false);
				rgb.n2.setVisible(false);
				rgb.m1.setVisible(false);
				rgb.m2.setVisible(false);
				rgb.pa1.setVisible(false);
				rgb.pa2.setVisible(false);
				rgb.fp1.setVisible(false);
				rgb.fp2.setVisible(false);
			}
		}
	}


class Databaseconnection{
	
	public static void storeData(String name1,String mno,String pas,String fpas){
		
		String sname,mn,pass,cpass;
		sname=name1;
		mn=mno;
		pass=pas;
		cpass=fpas;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("insert into studentregistration values('"+sname+"','"+mn+"','"+pass+"','"+cpass+"')");
			
			con.close();
			st.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			
	}
	
	public static void datainApply(String n,String fn,String mn,String date,String se,String ad,String pin,String ci,String st,String pr,String ph,String em,String fc,String dp,String yr,String twper,String sper,String po,String pt,String pth)
	{
		String name,fname,mname,bdate,sex,address,pincode,city,state,prn,phone,email,faculty,department,year,twpercent,sempercent,priorityone,prioritytwo,prioritythree;
		name=n;
		fname=fn;
		mname=mn;
	    bdate=date;
		sex=se;
		address=ad;
		pincode=pin;
		city=ci;
		state=st;
		prn=pr;
		phone=ph;
		email=em;
		faculty=fc;
		department=dp;
		year=yr;
		twpercent=twper;
		sempercent=sper;
		priorityone=po;
		prioritytwo=pt;
		prioritythree=pth;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
			Statement stp=con.createStatement();
			ResultSet rs=stp.executeQuery("insert into applicationform values('"+name+"','"+fname+"','"+mname+"',to_date('"+bdate+"','dd/mm/yyyy'),'"+sex+"','"+address+"','"+pincode+"','"+city+"','"+state+"','"+prn+"','"+phone+"','"+email+"','"+faculty+"','"+department+"','"+year+"','"+twpercent+"','"+sempercent+"','"+priorityone+"','"+prioritytwo+"','"+prioritythree+"')");
			
			if(rs.next()){
				System.out.println("Sucessfully submit");
			}
			else{
				JOptionPane.showMessageDialog(null,"not done");
			}
			con.close();
			stp.close();
			rs.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
		}
	}
	public static void complainDataBase(String subject,String discription,String n)
	{
		String s=subject;
		String d=discription;
		String m=n;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("insert into complaint values('"+s+"','"+d+"','"+m+"')");
			
			con.close();
			st.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void storeDatainadmin(String h,String r,String p){
		
		String hall,room,prn;
		hall=h;
		room=r;
		prn=p;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("insert into allocateroom values('"+hall+"','"+room+"','"+prn+"')");
			
			con.close();
			st.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			
	}	

}	


class Atoppanel extends JPanel{
	JLabel l1;
	Font f;
	Atoppanel(){

		setBackground(new Color(200,200,150));

		f=new Font("copperplate Gothic Bold",Font.BOLD,40);
		ImageIcon icon=new ImageIcon("resources/MSU.png");
		l1=new JLabel("HOSTEL MANAGEMENT SYSTEM",icon,JLabel.LEFT);
		l1.setFont(f);
		l1.setForeground(Color.BLACK);
		l1.setBounds(150,0,1350,130);
		add(l1);
	}

}

class Aleftpanel extends JPanel{
	JButton l1,l2,l3,l4,l5;
	Font f;
	Aleftpanel(){

		setBackground(new Color(102,102,0));

		f=new Font("Tahoma",Font.BOLD,20);

		l1=new JButton("APPLICATION FORM");
		l1.setBounds(5,5,290,50);
		l1.setFont(f);
		l1.setForeground(Color.WHITE);
		l1.setBackground(new Color(0,102,102));

		l2=new JButton("DOCUMENT UPLOAD");
		l2.setBounds(5,60,290,50);
		l2.setFont(f);
		l2.setForeground(Color.WHITE);
		l2.setBackground(new Color(0,102,102));

		l3=new JButton("FEES PAYMENT");
		l3.setBounds(5,115,290,50);
		l3.setFont(f);
		l3.setForeground(Color.WHITE);
		l3.setBackground(new Color(0,102,102));

		l4=new JButton("STATUS");
		l4.setBounds(5,170,290,50);
		l4.setFont(f);
		l4.setForeground(Color.WHITE);
		l4.setBackground(new Color(0,102,102));
		
		l5=new JButton("LOGOUT");
		l5.setBounds(5,225,290,50);
		l5.setFont(f);
		l5.setForeground(Color.WHITE);
		l5.setBackground(new Color(0,102,102));
		

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	}
}


class Applicationbuttonpanel extends JPanel implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JTextField t1,t2,t3,t4,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	Font f,m;
	JComboBox fa,d,y,h,p1,p2,p3;
	String[] department={"Computer Science","Mechanical","Civil","Chemical","Electrical","Textiles","Electronics","MBBS","Dental","Bcom","BBA","Bca"};
	String[] faculty={"Faculty of Commerce","Faculty of Medical","Faculty of Technology"};
	String[] year={"Fresher","1","2","3"};
	String[] hall={"SGB hall","MVB hall","SGG hall","MVg hall"};
	JRadioButton ma;
	JRadioButton fe;
	ButtonGroup group;
	JButton submit;
	JScrollPane jsp;
	JTextField date;
	
	int t;
	
	JLabel n1,n2,fn1,fn2,mn1,mn2,a2,pin1,pin2,c1,c2,s1,s2,prn1,prn2,em1,em2,per1,per2,sper1,sper2,ph1,ph2;

	Applicationbuttonpanel(){
		
		setBounds(300,130,1050,620);
		setBackground(Color.WHITE);
		setLayout(null);
		
		f=new Font("Tahoma",Font.PLAIN,14);
		m=new Font("Thaoma",Font.BOLD,18);
		l1=new JLabel("Name :-");
		l1.setFont(f);
		l1.setBounds(50,10,100,25);
		l1.setForeground(Color.black);

		l2=new JLabel("Father name :-");
		l2.setFont(f);
		l2.setBounds(50,45,100,25);
		l2.setForeground(Color.black);

		l3=new JLabel("Mother name :-");
		l3.setFont(f);
		l3.setBounds(50,75,100,25);
		l3.setForeground(Color.black);

		l4=new JLabel("Birthdate :-");
		l4.setFont(f);
		l4.setBounds(50,115,100,25);
		l4.setForeground(Color.black);

		l5=new JLabel("Gender :-");
		l5.setFont(f);
		l5.setBounds(390,115,100,25);
		l5.setForeground(Color.black);

		l6=new JLabel("Address :-");
		l6.setFont(f);
		l6.setBounds(50,150,100,25);
		l6.setForeground(Color.black);

		l7=new JLabel("Pincode :-");
		l7.setFont(f);
		l7.setBounds(50,185,100,25);
		l7.setForeground(Color.black);

		l8=new JLabel("City :-");
		l8.setFont(f);
		l8.setBounds(420,185,100,25);
		l8.setForeground(Color.black);

		l9=new JLabel("State :-");
		l9.setFont(f);
		l9.setBounds(700,185,100,25);
		l9.setForeground(Color.black);

		l10=new JLabel("PRN no. :-");
		l10.setFont(f);
		l10.setBounds(50,225,100,25);
		l10.setForeground(Color.black);
		
		l20=new JLabel("Phone no:-");
		l20.setFont(f);
		l20.setBounds(500,225,100,25);
		l20.setForeground(Color.black);
		add(l20);

		l11=new JLabel("E-mail :-");
		l11.setFont(f);
		l11.setBounds(50,255,100,25);
		l11.setForeground(Color.black);

		l12=new JLabel("Faculty :-");
		l12.setFont(f);
		l12.setBounds(50,285,100,25);
		l12.setForeground(Color.black);

		l13=new JLabel("Department :-");
		l13.setFont(f);
		l13.setBounds(510,285,100,25);
		l13.setForeground(Color.black);

		l14=new JLabel("Year :-");
		l14.setFont(f);
		l14.setBounds(50,315,100,25);
		l14.setForeground(Color.black);

		l15=new JLabel("Priority 1 :-");
		l15.setFont(f);
		l15.setBounds(50,345,100,25);
		l15.setForeground(Color.black);

		l16=new JLabel("Priority 2 :-");
		l16.setFont(f);
		l16.setBounds(50,375,100,25);
		l16.setForeground(Color.black);

		l17=new JLabel("Priority 3 :-");
		l17.setFont(f);
		l17.setBounds(50,405,100,25);
		l17.setForeground(Color.black);
		
		l18=new JLabel("12th percentage :-");
		l18.setFont(f);
		l18.setBounds(510,315,140,25);
		l18.setForeground(Color.black);
	
		l19=new JLabel("Sem percentage :-");
		l19.setFont(f);
		l19.setBounds(510,345,140,25);
		l19.setForeground(Color.black);
		
		t1=new JTextField();
		t1.setBounds(200,10,700,25);
		add(t1);

		t2=new JTextField();
		t2.setBounds(200,45,700,25);
		add(t2);

		t3=new JTextField();
		t3.setBounds(200,80,700,25);
		add(t3);

		date=new JTextField();
		date.setBounds(200,115, 100,25);
		add(date);
		
		ma=new JRadioButton("Male",true);
		ma.setBounds(450,115,100,25);
		ma.setFont(f);
		ma.setBackground(Color.WHITE);
		ma.setForeground(Color.BLACK);
		ma.setActionCommand("Male");
		add(ma);

		fe=new JRadioButton("Female",false);
		fe.setBounds(580,115,100,25);
		fe.setFont(f);
		fe.setBackground(Color.WHITE);
		fe.setForeground(Color.BLACK);
		fe.setActionCommand("Female");
		add(fe);
		

		group=new ButtonGroup();
		group.add(ma);
		group.add(fe);

		t6=new JTextField();
		t6.setBounds(200,150,600,25);
		add(t6);

		t7=new JTextField();
		t7.setBounds(200,185,100,25);
		add(t7);

		t8=new JTextField();
		t8.setBounds(480,185,100,25);
		add(t8);

		t9=new JTextField();
		t9.setBounds(760,185,100,25);
		add(t9);

		t10=new JTextField();
		t10.setBounds(200,225,180,25);
		add(t10);

		t11=new JTextField();
		t11.setBounds(200,255,500,25);
		add(t11);
		
		t12=new JTextField();
		t12.setBounds(660,315,50,25);
		add(t12);
		
		t13=new JTextField();
		t13.setBounds(660,345,50,25);
		add(t13);
		
		t14=new JTextField();
		t14.setBounds(620,225,140,25);
		add(t14);

		fa=new JComboBox(faculty);
		fa.setBounds(200,285,200,25);
		add(fa);

		d=new JComboBox(department);
		d.setBounds(660,285,250,25);
		add(d);

		y=new JComboBox(year);
		y.setBounds(200,315,100,25);
		add(y);

		p1=new JComboBox(hall);
		p1.setBounds(200,345,150,25);
		add(p1);

		p2=new JComboBox(hall);
		p2.setBounds(200,375,150,25);
		add(p2);

		p3=new JComboBox(hall);
		p3.setBounds(200,405,150,25);
		add(p3);

		submit=new JButton("Submit");
		submit.setBounds(485,455,120,30);
		submit.setFont(m);
		submit.setForeground(Color.BLACK);
		submit.setBackground(Color.GRAY);
		add(submit);
		
		submit.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        add(l15);
        add(l16);
        add(l17);
        add(l18);
        add(l19);
        
        n1=new JLabel("Enter valid name");
		n1.setBounds(905,10,110,25);
		n1.setFont(new Font("Tahoma",Font.ITALIC,13));
		n1.setForeground(Color.RED);
		
		n2=new JLabel("*");
		n2.setBounds(905,10,100,25);
		n2.setFont(new Font("Tahoma",Font.BOLD,15));
		n2.setForeground(Color.RED);
		
        fn1=new JLabel("Enter valid name");
		fn1.setBounds(905,45,110,25);
		fn1.setFont(new Font("Tahoma",Font.ITALIC,13));
		fn1.setForeground(Color.RED);
		
		fn2=new JLabel("*");
		fn2.setBounds(905,45,100,25);
		fn2.setFont(new Font("Tahoma",Font.BOLD,15));
		fn2.setForeground(Color.RED);
		
        mn1=new JLabel("Enter valid name");
		mn1.setBounds(905,80,110,25);
		mn1.setFont(new Font("Tahoma",Font.ITALIC,13));
		mn1.setForeground(Color.RED);
		
		mn2=new JLabel("*");
		mn2.setBounds(905,80,100,25);
		mn2.setFont(new Font("Tahoma",Font.BOLD,15));
		mn2.setForeground(Color.RED);
		
		a2=new JLabel("*");
		a2.setBounds(805,150,100,25);
		a2.setFont(new Font("Tahoma",Font.BOLD,15));
		a2.setForeground(Color.RED);
		
        pin1=new JLabel("Enter valid pincode");
		pin1.setBounds(305,185,120,25);
		pin1.setFont(new Font("Tahoma",Font.ITALIC,13));
		pin1.setForeground(Color.RED);
		
		pin2=new JLabel("*");
		pin2.setBounds(305,185,100,25);
		pin2.setFont(new Font("Tahoma",Font.BOLD,15));
		pin2.setForeground(Color.RED);
		
		c1=new JLabel("Enter valid city");
		c1.setBounds(585,185,100,25);
		c1.setFont(new Font("Tahoma",Font.ITALIC,13));
		c1.setForeground(Color.RED);
		
		c2=new JLabel("*");
		c2.setBounds(585,185,100,25);
		c2.setFont(new Font("Tahoma",Font.BOLD,15));
		c2.setForeground(Color.RED);
		
		s1=new JLabel("Enter valid state");
		s1.setBounds(865,185,100,25);
		s1.setFont(new Font("Tahoma",Font.ITALIC,13));
		s1.setForeground(Color.RED);
		
		s2=new JLabel("*");
		s2.setBounds(865,185,100,25);
		s2.setFont(new Font("Tahoma",Font.BOLD,15));
		s2.setForeground(Color.RED);
		
		prn1=new JLabel("Enter valid prn");
		prn1.setBounds(385,225,100,25);
		prn1.setFont(new Font("Tahoma",Font.ITALIC,13));
		prn1.setForeground(Color.RED);
		
		prn2=new JLabel("*");
		prn2.setBounds(385,225,100,25);
		prn2.setFont(new Font("Tahoma",Font.BOLD,15));
		prn2.setForeground(Color.RED);
		
		ph1=new JLabel("Enter valid no");
		ph1.setBounds(765,225,100,25);
		ph1.setFont(new Font("Tahoma",Font.BOLD,15));
		ph1.setForeground(Color.RED);
		
		ph2=new JLabel("*");
		ph2.setBounds(765,225,100,25);
		ph2.setFont(new Font("Tahoma",Font.BOLD,15));
		ph2.setForeground(Color.RED);
		
		em1=new JLabel("Enter valid email");
		em1.setBounds(705,255,100,25);
		em1.setFont(new Font("Tahoma",Font.ITALIC,13));
		em1.setForeground(Color.RED);
		
		em2=new JLabel("*");
		em2.setBounds(705,255,100,25);
		em2.setFont(new Font("Tahoma",Font.BOLD,15));
		em2.setForeground(Color.RED);
		
		per1=new JLabel("Enter valid percentage");
		per1.setBounds(715,315,150,25);
		per1.setFont(new Font("Tahoma",Font.ITALIC,13));
		per1.setForeground(Color.RED);
		
		per2=new JLabel("*");
		per2.setBounds(715,315,100,25);
		per2.setFont(new Font("Tahoma",Font.BOLD,15));
		per2.setForeground(Color.RED);
		
		sper1=new JLabel("Enter valid percentage");
		sper1.setBounds(715,345,150,25);
		sper1.setFont(new Font("Tahoma",Font.ITALIC,13));
		sper1.setForeground(Color.RED);
		
		sper2=new JLabel("*");
		sper2.setBounds(715,345,100,25);
		sper2.setFont(new Font("Tahoma",Font.BOLD,15));
		sper2.setForeground(Color.RED);
		
		add(n1);
		add(n2);
		add(fn1);
		add(fn2);
		add(mn1);
		add(mn2);
		add(a2);
		add(pin1);
		add(pin2);
		add(c1);
		add(c2);
		add(s1);
		add(s2);
		add(prn1);
		add(prn2);
		add(ph1);
		add(ph2);
		add(em1);
		add(em2);
		add(per1);
		add(per2);
		add(sper1);
		add(sper2);
		
		n1.setVisible(false);
		n2.setVisible(false);
		fn1.setVisible(false);
		fn2.setVisible(false);
		mn1.setVisible(false);
		mn2.setVisible(false);
		a2.setVisible(false);
		pin1.setVisible(false);
		pin2.setVisible(false);
		c1.setVisible(false);
		c2.setVisible(false);
		s1.setVisible(false);
		s2.setVisible(false);
		prn1.setVisible(false);
		prn2.setVisible(false);
		ph1.setVisible(false);
		ph2.setVisible(false);
		em1.setVisible(false);
		em2.setVisible(false);
		per1.setVisible(false);
		per2.setVisible(false);
		sper1.setVisible(false);
		sper2.setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e){
		
		String dt,sn,sfn,smn,sdd,sa,sp,sc,ss,sprn,sph,sem,sper,ssper,sbd,sex,fac,dept,year,po,pt,pth;
		String sf,sd,sy,spo,spt,spth;
		
		sn=t1.getText();
		sfn=t2.getText();
		smn=t3.getText();
		sdd=date.getText();
		
		sex=group.getSelection().getActionCommand();
		sf=fa.getSelectedItem().toString();
		sd=d.getSelectedItem().toString();
		sy=y.getSelectedItem().toString();
		spo=p1.getSelectedItem().toString();
		spt=p2.getSelectedItem().toString();
		spth=p3.getSelectedItem().toString();
		
		sa=t6.getText();
		sp=t7.getText();
		sc=t8.getText();
		ss=t9.getText();
		sprn=t10.getText();
		sph=t14.getText();
		sem=t11.getText();
		sper=t12.getText();
		ssper=t13.getText();
		
		String name="[a-zA-Z\\s]+";
		String pincode="[1-9][0-9]{5}";
		String prnno="[1-9][0-9]{14}";
		String email="[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
		String percentage="[0-9][0-9]([.][0-9]+)?";
		String mbno="[6789][0-9]{9}";
		
		if(Pattern.matches(name,sn) && Pattern.matches(name,sfn) &&
				Pattern.matches(name,smn) && Pattern.matches(name,sc)&&
				Pattern.matches(name,ss) && !sa.equals("") &&
				Pattern.matches(pincode,sp) && Pattern.matches(email,sem)&&
				Pattern.matches(percentage,sper) && Pattern.matches(prnno,sprn)&& Pattern.matches(mbno,sph)&&
				Pattern.matches(percentage,ssper) && t==1){
			
			Databaseconnection.datainApply(sn,sfn,smn,sdd,sex,sa,sp,sc,ss,sprn,sph,sem,sf,sd,sy,sper,ssper,spo,spt,spth);
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			date.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");
			t12.setText("");
			t13.setText("");
			t14.setText("");
		
			n1.setVisible(false);
			n2.setVisible(false);
			fn1.setVisible(false);
			fn2.setVisible(false);
			mn1.setVisible(false);
			mn2.setVisible(false);
			a2.setVisible(false);
			pin1.setVisible(false);
			pin2.setVisible(false);
			c1.setVisible(false);
			c2.setVisible(false);
			s1.setVisible(false);
			s2.setVisible(false);
			prn1.setVisible(false);
			prn2.setVisible(false);
			ph1.setVisible(false);
			ph2.setVisible(false);
			em1.setVisible(false);
			em2.setVisible(false);
			per1.setVisible(false);
			per2.setVisible(false);
			sper1.setVisible(false);
			sper2.setVisible(false);
			
			JOptionPane.showMessageDialog(null,"Registration Sucessfully");
			
		}
		else{
			if(Pattern.matches(name,sn)){
				n1.setVisible(false);
				n2.setVisible(false);
			}
			else if(sn.equals("")){
				n1.setVisible(false);
				n2.setVisible(true);
			}
			else{
				n2.setVisible(false);
				n1.setVisible(true);
				t1.setText("");
			}
			
			if(Pattern.matches(name,sfn)){
				fn1.setVisible(false);
				fn2.setVisible(false);
			}
			else if(sfn.equals("")){
				fn1.setVisible(false);
				fn2.setVisible(true);
			}
			else{
				fn2.setVisible(false);
				fn1.setVisible(true);
				t2.setText("");
			}
			
			if(Pattern.matches(name,smn)){
				mn1.setVisible(false);
				mn2.setVisible(false);
			}
			else if(smn.equals("")){
				mn1.setVisible(false);
				mn2.setVisible(true);
			}
			else{
				mn2.setVisible(false);
				mn1.setVisible(true);
				t3.setText("");
			}
			
			if(Pattern.matches(name,sc)){
				c1.setVisible(false);
				c2.setVisible(false);
			}
			else if(sc.equals("")){
				c1.setVisible(false);
				c2.setVisible(true);
			}
			else{
				c2.setVisible(false);
				c1.setVisible(true);
				t8.setText("");
			}
			
			if(Pattern.matches(name,ss)){
				s1.setVisible(false);
				s2.setVisible(false);
			}
			else if(ss.equals("")){
				s1.setVisible(false);
				s2.setVisible(true);
			}
			else{
				s2.setVisible(false);
				s1.setVisible(true);
				t9.setText("");
			}
			
			if(sa.equals("")){
				a2.setVisible(true);
				t6.setText("");
			}
			else{
				a2.setVisible(false);
			}
			
			if(Pattern.matches(pincode,sp)){
				pin1.setVisible(false);
				pin2.setVisible(false);
			}
			else if(sp.equals("")){
				pin1.setVisible(false);
				pin2.setVisible(true);
			}
			else{
				pin2.setVisible(false);
				pin1.setVisible(true);
				t7.setText("");
			}
			
			if(Pattern.matches(prnno,sprn)){
				prn1.setVisible(false);
				prn2.setVisible(false);
			}
			else if(sprn.equals("")){
				prn1.setVisible(false);
				prn2.setVisible(true);
			}
			else{
				prn2.setVisible(false);
				prn1.setVisible(true);
				t10.setText("");
			}
			
			if(Pattern.matches(mbno,sph)){
				ph1.setVisible(false);
				ph2.setVisible(false);
			}
			else if(sph.equals("")){
				ph1.setVisible(false);
				ph2.setVisible(true);
			}
			else{
				ph2.setVisible(false);
				ph1.setVisible(true);
				t14.setText("");
			}
			
			if(Pattern.matches(email,sem)){
				em1.setVisible(false);
				em2.setVisible(false);
			}
			else if(sem.equals("")){
				em1.setVisible(false);
				em2.setVisible(true);
			}
			else{
				em2.setVisible(false);
				em1.setVisible(true);
				t11.setText("");
			}
			
			if(Pattern.matches(percentage,sper)){
				per1.setVisible(false);
				per2.setVisible(false);
			}
			else if(sper.equals("")){
				per1.setVisible(false);
				per2.setVisible(true);
			}
			else{
				per2.setVisible(false);
				per1.setVisible(true);
				t12.setText("");
			}
			
			if(Pattern.matches(percentage,ssper)){
				sper1.setVisible(false);
				sper2.setVisible(false);
			}
			else if(ssper.equals("")){
				sper1.setVisible(false);
				sper2.setVisible(true);
			}
			else{
				sper2.setVisible(false);
				sper1.setVisible(true);
				t13.setText("");
			}
			
			if(Pattern.matches(prnno,sprn) && Pattern.matches(mbno,sph)){
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from applicationform where prn='"+sprn+"'");
					
					if(rs.next()){
						JOptionPane.showMessageDialog(null,"Enter Your Prn Number");
						t10.setText("");
						t=0;
					}
					else{
						t=1;
					}
					
					con.close();
					st.close();
					rs.close();
					
				} catch (Exception e8) {
					e8.printStackTrace();
					System.out.println(e8.getMessage());
				}
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from studentregistration where mbno='"+sph+"'");
					
					if(rs.next()){
						t=1;
					}
					else{
						JOptionPane.showMessageDialog(null,"Enter Your Register Mobile no.");
						t14.setText("");
						t=0;
					}
					
					con.close();
					st.close();
					rs.close();
					
				} catch (Exception e8) {
					e8.printStackTrace();
					System.out.println(e8.getMessage());
				}
			}
		}

	}
}


class Feespaymentpanel extends JPanel{
	JComboBox bank;
	JLabel fe,id,na,ba;
	JLabel am;
	JTextField no;
	JButton pay;
	Font f;
	String[] b={"Bank of Baroda","State Bank of India","ICICI Bank","HDFC Bank","BOI Bank","Kotak Mahindra Bank"};
	Feespaymentpanel(){
		setBackground(Color.WHITE);
		setLayout(null);
		
		f=new Font("Tahoma",Font.BOLD,14);
		
		id=new JLabel("Application no:-");
		id.setBounds(100,50,200,30);
		id.setFont(f);
		id.setForeground(Color.BLACK);
		add(id);
		
		
		no=new JTextField("");
		no.setBounds(250,50,250,25);
		no.setFont(f);
		no.setForeground(Color.BLACK);
		add(no);
		
		na=new JLabel("Applicant Name:-");
		na.setBounds(100,100,400,30);
		na.setFont(f);
		na.setForeground(Color.BLACK);
		add(na);
		setVisible(true);
		
		ba=new JLabel("Select Bank Name:-");
		ba.setBounds(100,160,200,30);
		ba.setFont(f);
		ba.setForeground(Color.BLACK);
		add(ba);
		
		
		bank=new JComboBox(b);
		bank.setBounds(250,160,250,30);
		bank.setFont(f);
		add(bank);
		
		fe=new JLabel("Fees:-");
		fe.setBounds(100,220,100,30);
		fe.setForeground(Color.BLACK);
		fe.setFont(f);
		add(fe);
		
		am=new JLabel("15000$");
		am.setBounds(180,220,100,30);
		am.setForeground(Color.BLACK);
		am.setFont(f);
		add(am);
		
		pay=new JButton("Pay Fees");
		pay.setBounds(250,280,100,30);
		pay.setBackground(Color.WHITE);
		pay.setForeground(Color.BLACK);
		pay.setFont(f);
		add(pay);

	}
}

class Documentuploadpanel extends JPanel{
	Documentuploadpanel(){
		setBackground(Color.WHITE);
		setLayout(null);
	}
}

class Statuspanel extends JPanel{
		JLabel ad,appst,hall,rom,fes,prn;
		Font f;
		int n=10;
		
	    Statuspanel()
	    {
		setBackground(Color.WHITE);
		setLayout(null);
		
		f=new Font("Tahoma",Font.BOLD,14);
		
		ad=new JLabel("Addmission status:-");
		ad.setBounds(50,50,200,40);
		ad.setFont(f);
		ad.setForeground(Color.BLACK);
		
		appst=new JLabel("Application form status:-");
		appst.setBounds(50,120,250,40);
		appst.setFont(f);
		appst.setForeground(Color.BLACK);
		
		fes=new JLabel("Fees status:-");
		fes.setBounds(350,120,250,40);
		fes.setFont(f);
		fes.setForeground(Color.BLACK);
		
		hall=new JLabel("Hall name:-");
		hall.setBounds(50,190,100,40);
		hall.setFont(f);
		hall.setForeground(Color.BLACK);
		
		rom=new JLabel("Room no:-");
		rom.setBounds(50,260,150,40);
		rom.setFont(f);
		rom.setForeground(Color.BLACK);
		
		add(ad);
		add(appst);
		add(hall);
		add(rom);
		add(fes);
	}
}


class  Applypanel extends JFrame implements ActionListener{	
	Atoppanel atp;
	Aleftpanel alp;
	Applicationbuttonpanel abp;
	Statuspanel sp;
	Documentuploadpanel dup;
	Feespaymentpanel fpp;
	JScrollPane jsp1;
	
	Applypanel(String s){

		super(s);
		setLayout(null);
		
		setSize(1350,750);
		setLocation(0,0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon=new ImageIcon("resources/hm3.jpg");
        setIconImage(icon.getImage());

		atp=new Atoppanel();
		atp.setLayout(null);
		atp.setBounds(0,0,1350,130);
		add(atp);

		alp=new Aleftpanel();
		alp.setLayout(null);
		alp.setBounds(0,130,300,620);
		add(alp);

		alp.l1.addActionListener(this);
		alp.l2.addActionListener(this);
		alp.l3.addActionListener(this);
		alp.l4.addActionListener(this);
		alp.l5.addActionListener(this);

		abp=new Applicationbuttonpanel();
		abp.setVisible(false);
		add(abp);
		 
		sp=new Statuspanel();
		sp.setBounds(300,130,1050,620);
		add(sp);
		sp.setVisible(false);

		dup=new Documentuploadpanel();
		dup.setBounds(300,130,1050,620);
		add(dup);
		dup.setVisible(false);

		fpp=new Feespaymentpanel();
		fpp.setBounds(300,130,1050,620);
		add(fpp);
		fpp.setVisible(false);

	}
		public void actionPerformed(ActionEvent e)
		{
			String se=e.getActionCommand();
			
			if(se.equalsIgnoreCase("Application form"))
			{
				abp.setVisible(true);
				dup.setVisible(false);
				sp.setVisible(false);
				fpp.setVisible(false);
				
				abp.t=0;
				abp.n1.setVisible(false);
				abp.n2.setVisible(false);
				abp.fn1.setVisible(false);
				abp.fn2.setVisible(false);
				abp.mn1.setVisible(false);
				abp.mn2.setVisible(false);
				abp.a2.setVisible(false);
				abp.pin1.setVisible(false);
				abp.pin2.setVisible(false);
				abp.c1.setVisible(false);
				abp.c2.setVisible(false);
				abp.s1.setVisible(false);
				abp.s2.setVisible(false);
				abp.prn1.setVisible(false);
				abp.prn2.setVisible(false);
				abp.em1.setVisible(false);
				abp.em2.setVisible(false);
				abp.per1.setVisible(false);
				abp.per2.setVisible(false);
				abp.sper1.setVisible(false);
				abp.sper2.setVisible(false);
				abp.ph1.setVisible(false);
				abp.ph2.setVisible(false);
				
			}
			else if(se.equalsIgnoreCase("Document upload"))
			{
				abp.setVisible(false);
				sp.setVisible(false);
				fpp.setVisible(false);
				dup.setVisible(true);
			}
			else if(se.equalsIgnoreCase("Fees payment"))
			{
				abp.setVisible(false);
				dup.setVisible(false);
				sp.setVisible(false);
				fpp.setVisible(true);
			}
			else if(se.equalsIgnoreCase("Status"))
			{
				abp.setVisible(false);
				dup.setVisible(false);
				fpp.setVisible(false);
				sp.setVisible(true);
			}
			else if(se.equalsIgnoreCase("Logout")){
				StudentLogin.ap.dispose();
				Home.aa();
			}
		}
	}

class Adtoppanel extends JPanel{
	
	JLabel l1;
	Font f;
	Adtoppanel(){
		
		setBackground(new Color(200,200,150));
		
		f=new Font("Copperplate Gothic Bold",Font.BOLD,40);
		ImageIcon icon=new ImageIcon("resources/MSU.png");
		l1=new JLabel("HOSTEL MANAGEMENT SYSTEM",icon,JLabel.LEFT);
		l1.setFont(f);
		l1.setForeground(Color.BLACK);
		l1.setBounds(150,0,1350,130);
		add(l1);
		
	}
}

class Adleftpanel extends JPanel{
	 
	JButton l1,l2,l3;
	Font f;
	
	Adleftpanel(){

		setBackground(new Color(102,102,0));

		f=new Font("ARIAL",Font.BOLD,20);

		l1=new JButton("GIVE ADMISSION");
		l1.setBounds(5,5,290,50);
		l1.setFont(f);
		l1.setForeground(Color.WHITE);
		l1.setBackground(new Color(0,102,102));

		l2=new JButton("SHOW APPLICATION");
		l2.setBounds(5,60,290,50);
		l2.setFont(f);
		l2.setForeground(Color.WHITE);
		l2.setBackground(new Color(0,102,102));
		
		l3=new JButton("LOG OUT");
		l3.setBounds(5,115,290,50);
		l3.setFont(f);
		l3.setForeground(Color.WHITE);
		l3.setBackground(new Color(0,102,102));

		add(l1);
		add(l2);
	    add(l3);
	    
	}
}

class Giveaddmissionpanel extends JPanel implements ActionListener{
	
	JComboBox ro,ha,st;
	JLabel room,hall,l1,l2;
	JTextField st1,st2;
	String[] h={"sgbh","mvbh","sggh","mvgh"};
    String[] r={"101","102","103","104","105","106","107","108","109","110"};
    String[] s={"student 1","student 2","student 3"};
	JButton sub1,sub2,sub3,getdata;
	JLabel note;
	Font m,f;
	
	int t;
	
	Giveaddmissionpanel(){
			
		setBounds(300,130,1050,620);
		setLayout(null);
		setBackground(Color.WHITE);
		
		t=0;
		
		f=new Font("ARIAL",Font.BOLD,15);
		m=new Font("ARIAL",Font.BOLD,13);
		
		note=new JLabel(" SGBH and MVBH ARE Boys Hostel, SGGH and MVGH Are Girls Hostel.");
		note.setBounds(10,10,800,30);
		note.setFont(m);
		note.setForeground(Color.RED);
		add(note);
		
		hall=new JLabel("Select Hall:");
		hall.setBounds(100,50,250,30);
		hall.setFont(f);
		hall.setForeground(Color.BLACK);
		add(hall);
		
		ha=new JComboBox(h);
		ha.setBounds(240,50,100,30);
		add(ha);
		
		room=new JLabel(" Select Room No:");
		room.setBounds(100,100,200,30);
		room.setFont(f);
		room.setForeground(Color.BLACK);
		add(room);
		
		ro=new JComboBox(r);
		ro.setBounds(250,100,80,30);
		add(ro);
		
		st=new JComboBox(s);
		st.setBounds(100,150,80,30);
		add(st);
		
		st1=new JTextField();
		st1.setBounds(220,150,130,30);
		add(st1);
		
		sub1=new JButton("Give addmission");
		sub1.setBounds(380,150,200,30);
		sub1.setBackground(new Color(0,102,102));
		sub1.setForeground(Color.WHITE);
		sub1.setFont(f);
		add(sub1);
		
		st2=new JTextField();
		st2.setBounds(300,200,130,30);
		add(st2);
		
		getdata=new JButton("Get Data");
		getdata.setBounds(100,200,150,30);
		getdata.setBackground(new Color(0,102,102));
		getdata.setForeground(Color.WHITE);
		getdata.setFont(f);
		add(getdata);
		
		getdata.addActionListener(this);
        sub1.addActionListener(this);
        
        l1=new JLabel("Enter valid prn number");
		l1.setBounds(350,150,110,25);
		l1.setFont(new Font("Tahoma",Font.ITALIC,13));
		l1.setForeground(Color.RED);
		
		l2=new JLabel("*");
		l2.setBounds(350,150,100,25);
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setForeground(Color.RED);
		
		add(l1);
		add(l2);
		
		l1.setVisible(false);
		l2.setVisible(false);
	
	}
	
    public void actionPerformed(ActionEvent e){
    	
    		
    	String s=e.getActionCommand();
    	
    	if(s.equalsIgnoreCase("Give addmission")){
    		
    		String hall,room,prn;
    		
    		String prnno="[1-9][0-9]{14}";
    		
    		hall=ha.getSelectedItem().toString();
    		room=ro.getSelectedItem().toString();
    		prn=st1.getText();
    		
    		if(Pattern.matches(prnno,prn) && !prn.equals("") && t==1){
    		    			
    			Databaseconnection.storeDatainadmin(hall,room,prn);
    			
    			st1.setText("");
    			
    			l1.setVisible(false);
    			l2.setVisible(false);
    			
    			JOptionPane.showMessageDialog(null,"Room Allocation Sucessful");
    			
    		}
    		else{
    			if(Pattern.matches(prnno,prn)){
    				l1.setVisible(false);
    				l2.setVisible(false);
    			}
    			else if(prn.equals("")){
    				l1.setVisible(false);
    				l2.setVisible(true);
    			}
    			else{
    				l1.setVisible(true);
    				l2.setVisible(false);
    				st1.setText("");
    			}
    			
    			if(Pattern.matches(prnno,prn)){
    				
    				try{
    					Class.forName("oracle.jdbc.driver.OracleDriver");
    					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
    					Statement st=con.createStatement();
    					ResultSet rs=st.executeQuery("select * from allocateroom where prnno='"+prn+"'");
    					
    					if(rs.next()){
    						JOptionPane.showMessageDialog(null,"Prn has already allocated room");
    						st1.setText("");
    						t=0;
    					}
    					else{
    						t=1;
    					}
    					
    					con.close();
    					st.close();
    					rs.close();
    			
    				} catch(Exception e9){
    					e9.printStackTrace();
    					System.out.println(e9.getMessage());
    				}

    				try{
    					Class.forName("oracle.jdbc.driver.OracleDriver");
    					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HMS","Hms007");
    					Statement st=con.createStatement();
    					ResultSet sr=st.executeQuery("select * from applicationform where prn='"+prn+"'");
    					
    					if(sr.next() && t==1){
    						t=1;
    					}
    					else{
    						if(sr.next()){
    	
    						}
    						else{
    							JOptionPane.showMessageDialog(null,"Prn number is not present");
    							st1.setText("");
    							t=0;
    						}
    					}
    					
    					con.close();
    					st.close();
    					sr.close();
    					
    				} catch (Exception e8) {
    					e8.printStackTrace();
    					System.out.println(e8.getMessage());
    				}
    				
    				
    			}
    		}
    	}	 
    }	
}

class Showapplication extends JPanel{
	
	JButton show;
	Font f;
	
	Showapplication(){
	
		setBounds(300,130,1050,620);
		setLayout(null);
		setBackground(Color.WHITE);
		
		f=new Font("ARIAL",Font.BOLD,15);
		
		show=new JButton("Show All Application");
		show.setBounds(400,270,250,30);
		show.setBackground(Color.BLACK);
		show.setForeground(Color.WHITE);
		show.setFont(f);
		add(show);
		
	}
}

class Showall extends JPanel{
	
	Showall(){
		
		setBounds(300,130,1050,620);
		setLayout(null);
		setBackground(Color.WHITE);
		
	}
	
}


class Adminpanel extends JFrame implements ActionListener{
	
	Adtoppanel tp;
	Adleftpanel lp;
	Giveaddmissionpanel gap;
	Showapplication sa;
	Showall sh;
	
	Adminpanel(){
		
	}
	
	Adminpanel(String s){
		
		super(s);
		
		setSize(1350,750);
		setLocation(0,0);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon=new ImageIcon("resources/hm3.jpg");
        setIconImage(icon.getImage());
		
		tp=new Adtoppanel();
		tp.setLayout(null);
		tp.setBounds(0,0,1350,130);
		add(tp);
		
		lp=new Adleftpanel();
		lp.setLayout(null);
		lp.setBounds(0,130,300,620);
		add(lp);
		
		lp.l1.addActionListener(this);
		lp.l2.addActionListener(this);
	    lp.l3.addActionListener(this); 
	    
		gap=new Giveaddmissionpanel();
		add(gap);
			
		sa=new Showapplication();
		add(sa);
		
		sh=new Showall();
		add(sh);
		
		sa.show.addActionListener(this);
		
		gap.setVisible(false);
		sa.setVisible(false);
		sh.setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
	    String s=e.getActionCommand();
	    
	    if(s.equalsIgnoreCase("GIVE ADMISSION")){
	    	gap.setVisible(true);
	    	sa.setVisible(false);
	    	sh.setVisible(false);
	    	gap.l1.setVisible(false);
	    	gap.l2.setVisible(false);
	    	gap.t=0;
	    }
	    
	    else if(s.equalsIgnoreCase("SHOW APPLICATION")){
	    	gap.setVisible(false);
	    	sa.setVisible(true);	
	    	sh.setVisible(false);
	    }
	    
	    else if(s.equalsIgnoreCase("Show All Application")){
	    	gap.setVisible(false);
	    	sa.setVisible(false);	
	    	sh.setVisible(true);
	    }
	    else if(s.equalsIgnoreCase("LOG OUT")){
	    	AdminLogin.ad.dispose();
	    	Home.aa();
	    }
	    
	}
}