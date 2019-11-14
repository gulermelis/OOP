import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login {

	
	private JFrame frmLogIn;
	private JTextField txtUserName;
	private JPasswordField passwordField;
    private JButton btnLogIn;
    
    
  

		public Login(JFrame superF) 
			{
			frmLogIn = new JFrame();
			frmLogIn.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent arg0) {
						superF.setVisible(true);
						try {
							this.finalize();
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				
		
			
				frmLogIn.setTitle("Log in");
				frmLogIn.setBounds(100, 100, 316, 196);
				frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmLogIn.getContentPane().setLayout(null);
				
				
				JLabel lblUserName = new JLabel("User Name: ");
				lblUserName.setBounds(49, 31, 78, 14);
				frmLogIn.getContentPane().add(lblUserName);
				
				txtUserName = new JTextField();
				txtUserName.setBounds(143, 28, 86, 20);
				txtUserName.setColumns(10);
				frmLogIn.getContentPane().add(txtUserName);
				
				 String nametut=txtUserName.getText();
				
			
				JLabel lblPassword = new JLabel("Password:");
				lblPassword.setBounds(55, 65, 78, 14);
				frmLogIn.getContentPane().add(lblPassword);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(143, 59, 86, 20);
				frmLogIn.getContentPane().add(passwordField);
				
				btnLogIn = new JButton("Log in");
				btnLogIn.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent arg0) 
					{
						String value1=txtUserName.getText();
						String value2=passwordField.getText();
	
					  boolean retValue=MainMenu.op.LogInCustomer(value1,value2);
							
						if(retValue) {
								
								JOptionPane.showMessageDialog(frmLogIn, "SUCCESFFULL");
								ViewProduct vpFrm=new ViewProduct();
								vpFrm.getFrame().setVisible(true);
								frmLogIn.setVisible(false);
								
								
							}
					
						
						else
						{
							txtUserName.setText("");
							passwordField.setText("");
							JOptionPane.showMessageDialog(frmLogIn, "Wrong password or user name");

						}
						
						frmLogIn.setVisible(false);
					
					}
					
					
				
				  
				});
				
				
				btnLogIn.setBounds(140, 105, 89, 23);
				frmLogIn.getContentPane().add(btnLogIn);
						
	
					}
		
		
 public JFrame getFrame() {
	return frmLogIn;
}

 public void setFrame(JFrame frame) {
	this.frmLogIn = frame;
	}
}


