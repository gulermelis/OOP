import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogIn;
	private JTextField txtUserName;
	private JPasswordField passwordField;
    private JButton btnLogIn;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Login() 
	{
		frmLogIn = new JFrame();
		frmLogIn.setTitle("Log in");
		frmLogIn.setBounds(100, 100, 316, 196);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		
		//*username: i�in label
		JLabel lblUserName = new JLabel("User Name: ");
		lblUserName.setBounds(55, 31, 78, 14);
		frmLogIn.getContentPane().add(lblUserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(143, 28, 86, 20);
		txtUserName.setColumns(10);
		frmLogIn.getContentPane().add(txtUserName);
		
		//*password: i�in label
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 65, 78, 14);
		frmLogIn.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 59, 86, 20);
		frmLogIn.getContentPane().add(passwordField);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() 
		//btnLogIn Nenesi JButton s�n�f�ndan turem�s, s�n�f�n "addActionListener" methodunu cag�r�yoruz,bu method PARAMETRE OLARAK METHOD ALIYOR..(?)
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(txtUserName.getText().equals("yunus") &&
						passwordField.getText().equals("pass"))
				{
					MenuPage mp = new MenuPage();
					mp.getFrame().setVisible(true);
					frmLogIn.setVisible(false);
				}
				else
				{
					txtUserName.setText("");
					passwordField.setText("");
					JOptionPane.showMessageDialog(frmLogIn, "Wrong password or user name");

				}
			}
		});
		
		btnLogIn.setBounds(140, 105, 89, 23);
		frmLogIn.getContentPane().add(btnLogIn);
		
		
	}


}
