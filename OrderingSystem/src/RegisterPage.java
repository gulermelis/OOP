
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPage  {

	private JFrame rpFrame;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	
	private JTextField txtCountryCode;
	private JTextField txtCityCode;
	private JTextField txtPhoneNumber;
	private JComboBox cbxPhoneType; 
	private JTextField txtStreet;
	private JTextField txtTown;
	private JTextField txtCity;
	private JComboBox cbxAddressType;
	
	private JPanel panel;
	
	private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblPhone;
    private JLabel lblAddress;
    
   
    private JLabel lblCreateAnAccount;
    
    public JFrame getFrame() {
		return rpFrame;
	}


	public void setFrame(JFrame frame) {
		this.rpFrame = frame;
	}

    
    
    public RegisterPage() 
	{
		rpFrame = new JFrame();
		
		
		rpFrame.setTitle("Sign Up");
		rpFrame.setBounds(100, 100, 328, 329);
		rpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rpFrame.setSize(600,600);
		rpFrame.getContentPane().setLayout(null);
		
		
		txtUserName = new JTextField();
		txtUserName.setBounds(100, 61, 86, 20);
		txtUserName.setColumns(10);
		rpFrame.getContentPane().add(txtUserName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 92, 86, 20);
		passwordField.setColumns(10);
		rpFrame.getContentPane().add(passwordField);
		
	
		txtCountryCode = new JTextField();
		txtCountryCode.setBounds(100, 123, 24, 20);
		txtCountryCode.setColumns(10);
		rpFrame.getContentPane().add(txtCountryCode);
		
		txtCityCode = new JTextField();
		txtCityCode.setBounds(134, 123, 32, 20);
		txtCityCode.setColumns(10);
		rpFrame.getContentPane().add(txtCityCode);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(176, 123, 86, 20);
		txtPhoneNumber.setColumns(10);
		rpFrame.getContentPane().add(txtPhoneNumber);
		

		
		cbxPhoneType = new JComboBox();
		cbxPhoneType.setModel(new DefaultComboBoxModel(new String[] {"Job", "Home", "Other"}));
		cbxPhoneType.setBounds(280, 123, 76, 20);
		rpFrame.getContentPane().add(cbxPhoneType);
		
		
		
     	txtCity = new JTextField();
		txtCity.setBounds(100, 259, 54, 20);
		txtCity.setColumns(10);
		rpFrame.getContentPane().add(txtCity);
		
		txtTown = new JTextField();
		txtTown.setBounds(100, 228, 82, 20);
		txtTown.setColumns(10);
		rpFrame.getContentPane().add(txtTown);
		
		txtStreet = new JTextField();
		txtStreet.setBounds(100, 197, 106, 20);
		txtStreet.setColumns(10);
		rpFrame.getContentPane().add(txtStreet);
		
		
		cbxAddressType = new JComboBox();
		cbxAddressType.setModel(new DefaultComboBoxModel(new String[] { "Home", "Other"}));
		cbxAddressType.setBounds(100, 166, 76, 20);
		rpFrame.getContentPane().add(cbxAddressType);
		
		
		
		
	    lblUsername = new JLabel("Username");
		lblUsername.setBounds(25, 64, 65, 14);
		rpFrame.getContentPane().add(lblUsername);

		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(25, 95, 58, 14);
		rpFrame.getContentPane().add(lblPassword);
		
		
		lblPhone = new JLabel("Phone");
		lblPhone.setBounds(25, 126, 48, 14);
		rpFrame.getContentPane().add(lblPhone);
	
		lblAddress = new JLabel("Address");
		lblAddress.setBounds(25, 169, 65, 17);
		rpFrame.getContentPane().add(lblAddress);
		
	
		
		lblCreateAnAccount = new JLabel("Create an Account!");
		lblCreateAnAccount.setBounds(220, 11, 144, 39);
		rpFrame.getContentPane().add(lblCreateAnAccount);
		
		
		JButton btnRegister = new JButton("SEND");
		
		btnRegister.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
	            
					Address adr=new Address(
							 txtStreet.getText(),
							 txtTown.getText(),txtCity.getText(),
							 cbxAddressType.getSelectedItem().toString());
					
					 Phone phone=new Phone(txtCountryCode.getText(),
							 txtCityCode.getText(),
							 txtPhoneNumber.getText(),
							 cbxPhoneType.getSelectedItem().toString());
					 
		
						if(txtUserName.getText().length() == 0 && passwordField.getText().length() == 0) {
							//txtUserName.requestFocus();
							//passwordField.requestFocus();
							JOptionPane.showMessageDialog(rpFrame, "missing information");
						}
						else {
							 MainMenu.op.registerCustomer(txtUserName.getText(),passwordField.getText(),adr,phone);
								JOptionPane.showMessageDialog(rpFrame, "Register is Successfull! Please Log In");
						
						}
						
			rpFrame.setVisible(false);
		
			}
							
			});

		
		
	
		btnRegister.setBounds(149, 323, 76, 28);
		rpFrame.getContentPane().add(btnRegister);
		

	
		}

	
}
